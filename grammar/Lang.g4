grammar Lang;

prog: functions line+             # progLine
    ;

start_ : expr (';' expr)* EOF;

functions: function functions
        |// empty
        ;
 
function: FUNCTION VAR '('params')' fnBlock;

 
fnBlock:
     '{' fnBody '}'                # fnBlockLine
    ;

fnBody:
      line                      # fnBodyLine
    | line fnBody               # fnBodyLineMore
    | RETURN expr EOL           # fnReturnExprLine
    | RETURN EOL                # fnReturnLine
    ;

params: 
        VAR
      | VAR SEP params
      | // empty
      ;

line:
	  stmt EOL          # lineStmt
	| ifst              # lineIf
	| whilest         # lineWhile
    | forst           # lineFor
	| EOL              # lineEOL
    ;

funcInvoc:
    VAR '(' params ')' # funcInvocLine
    ;

stmt: 
      atrib             # stmtAtrib
    | input             # stmtInput
    | output            # stmtOutput    
    | funcInvoc        # lineFuncInvoc
    ;

input: 
    tipo READ VAR            # inputRead
    ;    
 
output: 
      WRITE VAR           # outputWriteVar
    | WRITE STR         # outputWriteStr
    | WRITE expr        # outputWriteExpr
    ;
tipo: 
      'numero'                # tipoNumero
    | 'texto'               # tipoTexto
    ;

ifst:
	  IF '(' cond ')' THEN block                  # ifstIf
	| IF '(' cond ')' THEN b1=block ELSE b2=block # ifstIfElse
    ;
whilest:
      WHILE '(' cond ')' block                    # whilestWhile
    | DO block WHILE '(' cond ')'                 # whilestDoWhile
    ;
forst:
      FOR '(' atrib? ';' cond? ';' atrib? ')' block  # forstFor
    ;
block:
     '{' line+ '}'                # blockLine
    ;

cond: 
      expr                        # condExpr
    | e1=expr RELOP=(EQ|NE|LT|GT|LE|GE) e2=expr       # condRelop
    | c1=cond AND c2=cond         # condAnd
    | c1=cond OR c2=cond          # condOr
    | NOT cond                    # condNot
    ;

atrib: 
     tipo VAR '=' expr            # atribVar
    | tipo VAR '=' STR            # atribVarStr
    ;

expr: 
      term '+' expr         # exprPlus
    | term '-' expr         # exprMinus
    | term                  # exprTerm
    ;

term: 
      factor '*' term       # termMult
    | factor '/' term       # termDiv
    | factor                # termFactor
    ;           

factor: 
     '(' expr ')'           # factorExpr
    | VAR                   # factorVar
    | NUM                   # factorNum
    ;

// Lexical rules
OE: '(';
CE: ')';
OB: '{';
CB: '}';
AT: '=';
SEP: ',';
PLUS: '+';
MINUS: '-';
MULT: '*';
DIV: '/';
AND: '&&';
OR: '||';
NOT: '!';
EQ : '==';
LT : '<';
GT : '>';
LE : '<=';
GE : '>=';
NE : '!=';
BOOL_TRUE: '👍';
BOL_FALSE: '👎';
IF: '🤔';
WHILE: [wW][hH][iI][lL][eE];
DO: [dD][oO];
FOR: [fF][oO][rR];
FUNCTION: [fF][uU][nN][cC][tT][iI][oO][nN];
RETURN: '↩️';
THEN: [tT][hH][eE][nN];
ELSE: [eE][lL][sS][eE];
WRITE: '✏️';
READ: '📖';
STR: '"' ~["]* '"';
EOL: ';';
NUM: [0-9]+ (.([0-9]+))?;
VAR: [a-zA-Z_][a-zA-Z0-9_]*;
COMMENT: '💬' ~[\r\n]* -> skip;
WS: [ \t\n\r]+ -> skip;