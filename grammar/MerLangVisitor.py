# Generated from MerLang.g4 by ANTLR 4.13.1
from antlr4 import *
if "." in __name__:
    from .MerLangParser import MerLangParser
else:
    from MerLangParser import MerLangParser

# This class defines a complete generic visitor for a parse tree produced by MerLangParser.

class MerLangVisitor(ParseTreeVisitor):

    # Visit a parse tree produced by MerLangParser#program.
    def visitProgram(self, ctx:MerLangParser.ProgramContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MerLangParser#line.
    def visitLine(self, ctx:MerLangParser.LineContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MerLangParser#statement.
    def visitStatement(self, ctx:MerLangParser.StatementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MerLangParser#scan_statement.
    def visitScan_statement(self, ctx:MerLangParser.Scan_statementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MerLangParser#condition.
    def visitCondition(self, ctx:MerLangParser.ConditionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MerLangParser#conditional_statement.
    def visitConditional_statement(self, ctx:MerLangParser.Conditional_statementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MerLangParser#ternary_statement.
    def visitTernary_statement(self, ctx:MerLangParser.Ternary_statementContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MerLangParser#value.
    def visitValue(self, ctx:MerLangParser.ValueContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MerLangParser#assignment.
    def visitAssignment(self, ctx:MerLangParser.AssignmentContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MerLangParser#function.
    def visitFunction(self, ctx:MerLangParser.FunctionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MerLangParser#function_call.
    def visitFunction_call(self, ctx:MerLangParser.Function_callContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MerLangParser#function_return.
    def visitFunction_return(self, ctx:MerLangParser.Function_returnContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MerLangParser#op.
    def visitOp(self, ctx:MerLangParser.OpContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MerLangParser#unary_arithmetic.
    def visitUnary_arithmetic(self, ctx:MerLangParser.Unary_arithmeticContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MerLangParser#arithmetic.
    def visitArithmetic(self, ctx:MerLangParser.ArithmeticContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MerLangParser#relop.
    def visitRelop(self, ctx:MerLangParser.RelopContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MerLangParser#expression.
    def visitExpression(self, ctx:MerLangParser.ExpressionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MerLangParser#array_item.
    def visitArray_item(self, ctx:MerLangParser.Array_itemContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MerLangParser#array_length.
    def visitArray_length(self, ctx:MerLangParser.Array_lengthContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MerLangParser#array.
    def visitArray(self, ctx:MerLangParser.ArrayContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MerLangParser#array_ops.
    def visitArray_ops(self, ctx:MerLangParser.Array_opsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MerLangParser#array_concat.
    def visitArray_concat(self, ctx:MerLangParser.Array_concatContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MerLangParser#print.
    def visitPrint(self, ctx:MerLangParser.PrintContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MerLangParser#while_loop.
    def visitWhile_loop(self, ctx:MerLangParser.While_loopContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MerLangParser#for_loop.
    def visitFor_loop(self, ctx:MerLangParser.For_loopContext):
        return self.visitChildren(ctx)



del MerLangParser