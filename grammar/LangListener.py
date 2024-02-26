# Generated from Lang.g4 by ANTLR 4.13.1
from antlr4 import *
if "." in __name__:
    from .LangParser import LangParser
else:
    from LangParser import LangParser

# This class defines a complete listener for a parse tree produced by LangParser.
class LangListener(ParseTreeListener):

    # Enter a parse tree produced by LangParser#progLine.
    def enterProgLine(self, ctx:LangParser.ProgLineContext):
        pass

    # Exit a parse tree produced by LangParser#progLine.
    def exitProgLine(self, ctx:LangParser.ProgLineContext):
        pass


    # Enter a parse tree produced by LangParser#start_.
    def enterStart_(self, ctx:LangParser.Start_Context):
        pass

    # Exit a parse tree produced by LangParser#start_.
    def exitStart_(self, ctx:LangParser.Start_Context):
        pass


    # Enter a parse tree produced by LangParser#functions.
    def enterFunctions(self, ctx:LangParser.FunctionsContext):
        pass

    # Exit a parse tree produced by LangParser#functions.
    def exitFunctions(self, ctx:LangParser.FunctionsContext):
        pass


    # Enter a parse tree produced by LangParser#function.
    def enterFunction(self, ctx:LangParser.FunctionContext):
        pass

    # Exit a parse tree produced by LangParser#function.
    def exitFunction(self, ctx:LangParser.FunctionContext):
        pass


    # Enter a parse tree produced by LangParser#fnBlockLine.
    def enterFnBlockLine(self, ctx:LangParser.FnBlockLineContext):
        pass

    # Exit a parse tree produced by LangParser#fnBlockLine.
    def exitFnBlockLine(self, ctx:LangParser.FnBlockLineContext):
        pass


    # Enter a parse tree produced by LangParser#fnBodyLine.
    def enterFnBodyLine(self, ctx:LangParser.FnBodyLineContext):
        pass

    # Exit a parse tree produced by LangParser#fnBodyLine.
    def exitFnBodyLine(self, ctx:LangParser.FnBodyLineContext):
        pass


    # Enter a parse tree produced by LangParser#fnBodyLineMore.
    def enterFnBodyLineMore(self, ctx:LangParser.FnBodyLineMoreContext):
        pass

    # Exit a parse tree produced by LangParser#fnBodyLineMore.
    def exitFnBodyLineMore(self, ctx:LangParser.FnBodyLineMoreContext):
        pass


    # Enter a parse tree produced by LangParser#fnReturnExprLine.
    def enterFnReturnExprLine(self, ctx:LangParser.FnReturnExprLineContext):
        pass

    # Exit a parse tree produced by LangParser#fnReturnExprLine.
    def exitFnReturnExprLine(self, ctx:LangParser.FnReturnExprLineContext):
        pass


    # Enter a parse tree produced by LangParser#fnReturnLine.
    def enterFnReturnLine(self, ctx:LangParser.FnReturnLineContext):
        pass

    # Exit a parse tree produced by LangParser#fnReturnLine.
    def exitFnReturnLine(self, ctx:LangParser.FnReturnLineContext):
        pass


    # Enter a parse tree produced by LangParser#params.
    def enterParams(self, ctx:LangParser.ParamsContext):
        pass

    # Exit a parse tree produced by LangParser#params.
    def exitParams(self, ctx:LangParser.ParamsContext):
        pass


    # Enter a parse tree produced by LangParser#lineStmt.
    def enterLineStmt(self, ctx:LangParser.LineStmtContext):
        pass

    # Exit a parse tree produced by LangParser#lineStmt.
    def exitLineStmt(self, ctx:LangParser.LineStmtContext):
        pass


    # Enter a parse tree produced by LangParser#lineIf.
    def enterLineIf(self, ctx:LangParser.LineIfContext):
        pass

    # Exit a parse tree produced by LangParser#lineIf.
    def exitLineIf(self, ctx:LangParser.LineIfContext):
        pass


    # Enter a parse tree produced by LangParser#lineWhile.
    def enterLineWhile(self, ctx:LangParser.LineWhileContext):
        pass

    # Exit a parse tree produced by LangParser#lineWhile.
    def exitLineWhile(self, ctx:LangParser.LineWhileContext):
        pass


    # Enter a parse tree produced by LangParser#lineFor.
    def enterLineFor(self, ctx:LangParser.LineForContext):
        pass

    # Exit a parse tree produced by LangParser#lineFor.
    def exitLineFor(self, ctx:LangParser.LineForContext):
        pass


    # Enter a parse tree produced by LangParser#lineEOL.
    def enterLineEOL(self, ctx:LangParser.LineEOLContext):
        pass

    # Exit a parse tree produced by LangParser#lineEOL.
    def exitLineEOL(self, ctx:LangParser.LineEOLContext):
        pass


    # Enter a parse tree produced by LangParser#funcInvocLine.
    def enterFuncInvocLine(self, ctx:LangParser.FuncInvocLineContext):
        pass

    # Exit a parse tree produced by LangParser#funcInvocLine.
    def exitFuncInvocLine(self, ctx:LangParser.FuncInvocLineContext):
        pass


    # Enter a parse tree produced by LangParser#stmtAtrib.
    def enterStmtAtrib(self, ctx:LangParser.StmtAtribContext):
        pass

    # Exit a parse tree produced by LangParser#stmtAtrib.
    def exitStmtAtrib(self, ctx:LangParser.StmtAtribContext):
        pass


    # Enter a parse tree produced by LangParser#stmtInput.
    def enterStmtInput(self, ctx:LangParser.StmtInputContext):
        pass

    # Exit a parse tree produced by LangParser#stmtInput.
    def exitStmtInput(self, ctx:LangParser.StmtInputContext):
        pass


    # Enter a parse tree produced by LangParser#stmtOutput.
    def enterStmtOutput(self, ctx:LangParser.StmtOutputContext):
        pass

    # Exit a parse tree produced by LangParser#stmtOutput.
    def exitStmtOutput(self, ctx:LangParser.StmtOutputContext):
        pass


    # Enter a parse tree produced by LangParser#lineFuncInvoc.
    def enterLineFuncInvoc(self, ctx:LangParser.LineFuncInvocContext):
        pass

    # Exit a parse tree produced by LangParser#lineFuncInvoc.
    def exitLineFuncInvoc(self, ctx:LangParser.LineFuncInvocContext):
        pass


    # Enter a parse tree produced by LangParser#inputRead.
    def enterInputRead(self, ctx:LangParser.InputReadContext):
        pass

    # Exit a parse tree produced by LangParser#inputRead.
    def exitInputRead(self, ctx:LangParser.InputReadContext):
        pass


    # Enter a parse tree produced by LangParser#outputWriteVar.
    def enterOutputWriteVar(self, ctx:LangParser.OutputWriteVarContext):
        pass

    # Exit a parse tree produced by LangParser#outputWriteVar.
    def exitOutputWriteVar(self, ctx:LangParser.OutputWriteVarContext):
        pass


    # Enter a parse tree produced by LangParser#outputWriteStr.
    def enterOutputWriteStr(self, ctx:LangParser.OutputWriteStrContext):
        pass

    # Exit a parse tree produced by LangParser#outputWriteStr.
    def exitOutputWriteStr(self, ctx:LangParser.OutputWriteStrContext):
        pass


    # Enter a parse tree produced by LangParser#outputWriteExpr.
    def enterOutputWriteExpr(self, ctx:LangParser.OutputWriteExprContext):
        pass

    # Exit a parse tree produced by LangParser#outputWriteExpr.
    def exitOutputWriteExpr(self, ctx:LangParser.OutputWriteExprContext):
        pass


    # Enter a parse tree produced by LangParser#tipoNumero.
    def enterTipoNumero(self, ctx:LangParser.TipoNumeroContext):
        pass

    # Exit a parse tree produced by LangParser#tipoNumero.
    def exitTipoNumero(self, ctx:LangParser.TipoNumeroContext):
        pass


    # Enter a parse tree produced by LangParser#tipoTexto.
    def enterTipoTexto(self, ctx:LangParser.TipoTextoContext):
        pass

    # Exit a parse tree produced by LangParser#tipoTexto.
    def exitTipoTexto(self, ctx:LangParser.TipoTextoContext):
        pass


    # Enter a parse tree produced by LangParser#ifstIf.
    def enterIfstIf(self, ctx:LangParser.IfstIfContext):
        pass

    # Exit a parse tree produced by LangParser#ifstIf.
    def exitIfstIf(self, ctx:LangParser.IfstIfContext):
        pass


    # Enter a parse tree produced by LangParser#ifstIfElse.
    def enterIfstIfElse(self, ctx:LangParser.IfstIfElseContext):
        pass

    # Exit a parse tree produced by LangParser#ifstIfElse.
    def exitIfstIfElse(self, ctx:LangParser.IfstIfElseContext):
        pass


    # Enter a parse tree produced by LangParser#whilestWhile.
    def enterWhilestWhile(self, ctx:LangParser.WhilestWhileContext):
        pass

    # Exit a parse tree produced by LangParser#whilestWhile.
    def exitWhilestWhile(self, ctx:LangParser.WhilestWhileContext):
        pass


    # Enter a parse tree produced by LangParser#whilestDoWhile.
    def enterWhilestDoWhile(self, ctx:LangParser.WhilestDoWhileContext):
        pass

    # Exit a parse tree produced by LangParser#whilestDoWhile.
    def exitWhilestDoWhile(self, ctx:LangParser.WhilestDoWhileContext):
        pass


    # Enter a parse tree produced by LangParser#forstFor.
    def enterForstFor(self, ctx:LangParser.ForstForContext):
        pass

    # Exit a parse tree produced by LangParser#forstFor.
    def exitForstFor(self, ctx:LangParser.ForstForContext):
        pass


    # Enter a parse tree produced by LangParser#blockLine.
    def enterBlockLine(self, ctx:LangParser.BlockLineContext):
        pass

    # Exit a parse tree produced by LangParser#blockLine.
    def exitBlockLine(self, ctx:LangParser.BlockLineContext):
        pass


    # Enter a parse tree produced by LangParser#condRelop.
    def enterCondRelop(self, ctx:LangParser.CondRelopContext):
        pass

    # Exit a parse tree produced by LangParser#condRelop.
    def exitCondRelop(self, ctx:LangParser.CondRelopContext):
        pass


    # Enter a parse tree produced by LangParser#condExpr.
    def enterCondExpr(self, ctx:LangParser.CondExprContext):
        pass

    # Exit a parse tree produced by LangParser#condExpr.
    def exitCondExpr(self, ctx:LangParser.CondExprContext):
        pass


    # Enter a parse tree produced by LangParser#condAnd.
    def enterCondAnd(self, ctx:LangParser.CondAndContext):
        pass

    # Exit a parse tree produced by LangParser#condAnd.
    def exitCondAnd(self, ctx:LangParser.CondAndContext):
        pass


    # Enter a parse tree produced by LangParser#condOr.
    def enterCondOr(self, ctx:LangParser.CondOrContext):
        pass

    # Exit a parse tree produced by LangParser#condOr.
    def exitCondOr(self, ctx:LangParser.CondOrContext):
        pass


    # Enter a parse tree produced by LangParser#condNot.
    def enterCondNot(self, ctx:LangParser.CondNotContext):
        pass

    # Exit a parse tree produced by LangParser#condNot.
    def exitCondNot(self, ctx:LangParser.CondNotContext):
        pass


    # Enter a parse tree produced by LangParser#atribVar.
    def enterAtribVar(self, ctx:LangParser.AtribVarContext):
        pass

    # Exit a parse tree produced by LangParser#atribVar.
    def exitAtribVar(self, ctx:LangParser.AtribVarContext):
        pass


    # Enter a parse tree produced by LangParser#atribVarStr.
    def enterAtribVarStr(self, ctx:LangParser.AtribVarStrContext):
        pass

    # Exit a parse tree produced by LangParser#atribVarStr.
    def exitAtribVarStr(self, ctx:LangParser.AtribVarStrContext):
        pass


    # Enter a parse tree produced by LangParser#exprPlus.
    def enterExprPlus(self, ctx:LangParser.ExprPlusContext):
        pass

    # Exit a parse tree produced by LangParser#exprPlus.
    def exitExprPlus(self, ctx:LangParser.ExprPlusContext):
        pass


    # Enter a parse tree produced by LangParser#exprMinus.
    def enterExprMinus(self, ctx:LangParser.ExprMinusContext):
        pass

    # Exit a parse tree produced by LangParser#exprMinus.
    def exitExprMinus(self, ctx:LangParser.ExprMinusContext):
        pass


    # Enter a parse tree produced by LangParser#exprTerm.
    def enterExprTerm(self, ctx:LangParser.ExprTermContext):
        pass

    # Exit a parse tree produced by LangParser#exprTerm.
    def exitExprTerm(self, ctx:LangParser.ExprTermContext):
        pass


    # Enter a parse tree produced by LangParser#termMult.
    def enterTermMult(self, ctx:LangParser.TermMultContext):
        pass

    # Exit a parse tree produced by LangParser#termMult.
    def exitTermMult(self, ctx:LangParser.TermMultContext):
        pass


    # Enter a parse tree produced by LangParser#termDiv.
    def enterTermDiv(self, ctx:LangParser.TermDivContext):
        pass

    # Exit a parse tree produced by LangParser#termDiv.
    def exitTermDiv(self, ctx:LangParser.TermDivContext):
        pass


    # Enter a parse tree produced by LangParser#termFactor.
    def enterTermFactor(self, ctx:LangParser.TermFactorContext):
        pass

    # Exit a parse tree produced by LangParser#termFactor.
    def exitTermFactor(self, ctx:LangParser.TermFactorContext):
        pass


    # Enter a parse tree produced by LangParser#factorExpr.
    def enterFactorExpr(self, ctx:LangParser.FactorExprContext):
        pass

    # Exit a parse tree produced by LangParser#factorExpr.
    def exitFactorExpr(self, ctx:LangParser.FactorExprContext):
        pass


    # Enter a parse tree produced by LangParser#factorVar.
    def enterFactorVar(self, ctx:LangParser.FactorVarContext):
        pass

    # Exit a parse tree produced by LangParser#factorVar.
    def exitFactorVar(self, ctx:LangParser.FactorVarContext):
        pass


    # Enter a parse tree produced by LangParser#factorNum.
    def enterFactorNum(self, ctx:LangParser.FactorNumContext):
        pass

    # Exit a parse tree produced by LangParser#factorNum.
    def exitFactorNum(self, ctx:LangParser.FactorNumContext):
        pass



del LangParser