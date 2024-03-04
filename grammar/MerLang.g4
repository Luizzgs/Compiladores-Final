grammar MerLang;
/*
 * Parser Rules
 */


program: (line | function | scan_statement)+ EOF;

line: (ternary_statement | statement | conditional_statement) ';'? NEWLINE+;

// Statement

statement: (
		assignment
		| array_ops
		| array_concat
		| function_return
		| function_call
		| arithmetic
		| print
		| while_loop
        | for_loop
	);



scan_statement: VARIABLE '=' SCAN_KEYWORD '(' ')' ';';

condition: expression (relop expression)*;

conditional_statement:
	IF '(' condition ')' '{' NEWLINE* line+ '}';

ternary_statement: expression '?' statement ':' statement;

// Assignment
value: (
		VARIABLE
		| NUMBER
		| TEXT
		| function_call
		| array_item
		| array_length
		| array
		| assignment

	);

assignment: (INT | STRING | BOOLEAN) VARIABLE '=' value;

BOOLEAN_ASSIGNMENT: BOOLEAN VARIABLE '=' (TRUE | FALSE);

INT_ASSIGNMENT: INT VARIABLE '=' NUMBER;

STRING_ASSIGNMENT: STRING VARIABLE '=' TEXT;

// Function 
function: (
		FUNCTION VARIABLE? '(' value* ')' '{' NEWLINE* line+ '}' ';'? NEWLINE+
	);

function_call: VARIABLE '(' value* ')';

function_return: RETURN (value | array_concat);

// Arithmetic
op: (ADD_OP | SUB_OP | MUL_OP | DIV_OP);

unary_arithmetic: VARIABLE (UNARY_ADD | UNARY_MINUS);

arithmetic: ( (value op value (op value)*) | unary_arithmetic);

// Relational
relop: (LT | LTE | GT | GTE | EQ | NEQ);

expression: (value | arithmetic) relop (value | arithmetic);

// Array

array_item: VARIABLE '[' (value | arithmetic) ']';

array_length: VARIABLE '.' 'length';

array: '[' value? ( ',' value)* ']';

array_ops:
	VARIABLE '.' ('push' | 'pop') '(' (value | array_item)+ ')';

array_concat:
	value '.' 'concat' '(' (value | array_item) (
		',' (value | array_item)
	)* ')';



// Print
print: PRINT '(' value ( ',' value)* ')' 
		| PRINT '(' TEXT ( ',' value)* ')'
		| PRINT '(' TEXT ')'
		| PRINT '(' assignment ')'
		| PRINT '(' expression ')'
		| PRINT '(' array	')'
		| PRINT '(' array_item ')'
		| PRINT '(' array_length	')'
	;


// Loop
while_loop:
	WHILE '(' condition ')' '{' NEWLINE* (
		line+
		| (BREAK NEWLINE)
	) '}';

for_loop: FOR '(' assignment ';' condition ';' assignment ')' '{' NEWLINE* line+ '}';


/*
 * Lexer Rules
 */
fragment LOWERCASE: [a-z];
fragment UPPERCASE: [A-Z];
fragment DIGIT: [0-9];

INT: 'int';
STRING: 'string';
BOOLEAN: 'boolean';
TRUE: 'True';
FALSE: 'False';
FUNCTION: 'function';
RETURN: 'return';
WHILE: 'while';
FOR: 'for';
VAR: 'var';
CONST: 'const';
LET: 'let';
IF: 'if';
ELSE: 'else';
LT: '<';
LTE: '<=';
GT: '>';
GTE: '>=';
EQ: '==';
NEQ: '!=';
PRINT: 'print';
SCAN_KEYWORD: 'scan';
BREAK: 'break';
ADD_OP: '+';
SUB_OP: '-';
MUL_OP: '*';
DIV_OP: '/';
UNARY_ADD: '++';
UNARY_MINUS: '--';


VARIABLE: (LOWERCASE | UPPERCASE) (
		LOWERCASE
		| UPPERCASE
		| DIGIT
		| '_'
	)*;

NUMBER: DIGIT+ ([.,] DIGIT+)?;

WHITESPACE: (' ' | '\t')+ -> skip;

NEWLINE: ('\r'? '\n' | '\r')+;

TEXT: ('"' | '\'') ~['"]+ ('\'' | '"');
