# Generated from Lang.g4 by ANTLR 4.13.1
from antlr4 import *
if "." in __name__:
    from .LangParser import LangParser
else:
    from LangParser import LangParser

# This class defines a complete generic visitor for a parse tree produced by LangParser.

class LangVisitor(ParseTreeVisitor):

    # Visit a parse tree produced by LangParser#progLine.
    def visitProgLine(self, ctx:LangParser.ProgLineContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LangParser#start_.
    def visitStart_(self, ctx:LangParser.Start_Context):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LangParser#functions.
    def visitFunctions(self, ctx:LangParser.FunctionsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LangParser#function.
    def visitFunction(self, ctx:LangParser.FunctionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LangParser#fnBlockLine.
    def visitFnBlockLine(self, ctx:LangParser.FnBlockLineContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LangParser#fnBodyLine.
    def visitFnBodyLine(self, ctx:LangParser.FnBodyLineContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LangParser#fnBodyLineMore.
    def visitFnBodyLineMore(self, ctx:LangParser.FnBodyLineMoreContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LangParser#fnReturnExprLine.
    def visitFnReturnExprLine(self, ctx:LangParser.FnReturnExprLineContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LangParser#fnReturnLine.
    def visitFnReturnLine(self, ctx:LangParser.FnReturnLineContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LangParser#params.
    def visitParams(self, ctx:LangParser.ParamsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LangParser#lineStmt.
    def visitLineStmt(self, ctx:LangParser.LineStmtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LangParser#lineIf.
    def visitLineIf(self, ctx:LangParser.LineIfContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LangParser#lineWhile.
    def visitLineWhile(self, ctx:LangParser.LineWhileContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LangParser#lineFor.
    def visitLineFor(self, ctx:LangParser.LineForContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LangParser#lineEOL.
    def visitLineEOL(self, ctx:LangParser.LineEOLContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LangParser#funcInvocLine.
    def visitFuncInvocLine(self, ctx:LangParser.FuncInvocLineContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LangParser#stmtAtrib.
    def visitStmtAtrib(self, ctx:LangParser.StmtAtribContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LangParser#stmtInput.
    def visitStmtInput(self, ctx:LangParser.StmtInputContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LangParser#stmtOutput.
    def visitStmtOutput(self, ctx:LangParser.StmtOutputContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LangParser#lineFuncInvoc.
    def visitLineFuncInvoc(self, ctx:LangParser.LineFuncInvocContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LangParser#inputRead.
    def visitInputRead(self, ctx:LangParser.InputReadContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LangParser#outputWriteVar.
    def visitOutputWriteVar(self, ctx:LangParser.OutputWriteVarContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LangParser#outputWriteStr.
    def visitOutputWriteStr(self, ctx:LangParser.OutputWriteStrContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LangParser#outputWriteExpr.
    def visitOutputWriteExpr(self, ctx:LangParser.OutputWriteExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LangParser#tipoNumero.
    def visitTipoNumero(self, ctx:LangParser.TipoNumeroContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LangParser#tipoTexto.
    def visitTipoTexto(self, ctx:LangParser.TipoTextoContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LangParser#ifstIf.
    def visitIfstIf(self, ctx:LangParser.IfstIfContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LangParser#ifstIfElse.
    def visitIfstIfElse(self, ctx:LangParser.IfstIfElseContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LangParser#whilestWhile.
    def visitWhilestWhile(self, ctx:LangParser.WhilestWhileContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LangParser#whilestDoWhile.
    def visitWhilestDoWhile(self, ctx:LangParser.WhilestDoWhileContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LangParser#forstFor.
    def visitForstFor(self, ctx:LangParser.ForstForContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LangParser#blockLine.
    def visitBlockLine(self, ctx:LangParser.BlockLineContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LangParser#condRelop.
    def visitCondRelop(self, ctx:LangParser.CondRelopContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LangParser#condExpr.
    def visitCondExpr(self, ctx:LangParser.CondExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LangParser#condAnd.
    def visitCondAnd(self, ctx:LangParser.CondAndContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LangParser#condOr.
    def visitCondOr(self, ctx:LangParser.CondOrContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LangParser#condNot.
    def visitCondNot(self, ctx:LangParser.CondNotContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LangParser#atribVar.
    def visitAtribVar(self, ctx:LangParser.AtribVarContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LangParser#atribVarStr.
    def visitAtribVarStr(self, ctx:LangParser.AtribVarStrContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LangParser#exprPlus.
    def visitExprPlus(self, ctx:LangParser.ExprPlusContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LangParser#exprMinus.
    def visitExprMinus(self, ctx:LangParser.ExprMinusContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LangParser#exprTerm.
    def visitExprTerm(self, ctx:LangParser.ExprTermContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LangParser#termMult.
    def visitTermMult(self, ctx:LangParser.TermMultContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LangParser#termDiv.
    def visitTermDiv(self, ctx:LangParser.TermDivContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LangParser#termFactor.
    def visitTermFactor(self, ctx:LangParser.TermFactorContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LangParser#factorExpr.
    def visitFactorExpr(self, ctx:LangParser.FactorExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LangParser#factorVar.
    def visitFactorVar(self, ctx:LangParser.FactorVarContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by LangParser#factorNum.
    def visitFactorNum(self, ctx:LangParser.FactorNumContext):
        return self.visitChildren(ctx)



del LangParser