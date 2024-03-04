# Generated from MerLang.g4 by ANTLR 4.13.1
from antlr4 import *
if "." in __name__:
    from .MerLangParser import MerLangParser
else:
    from MerLangParser import MerLangParser

# This class defines a complete listener for a parse tree produced by MerLangParser.
class MerLangListener(ParseTreeListener):

    # Enter a parse tree produced by MerLangParser#program.
    def enterProgram(self, ctx:MerLangParser.ProgramContext):
        pass

    # Exit a parse tree produced by MerLangParser#program.
    def exitProgram(self, ctx:MerLangParser.ProgramContext):
        pass


    # Enter a parse tree produced by MerLangParser#line.
    def enterLine(self, ctx:MerLangParser.LineContext):
        pass

    # Exit a parse tree produced by MerLangParser#line.
    def exitLine(self, ctx:MerLangParser.LineContext):
        pass


    # Enter a parse tree produced by MerLangParser#statement.
    def enterStatement(self, ctx:MerLangParser.StatementContext):
        pass

    # Exit a parse tree produced by MerLangParser#statement.
    def exitStatement(self, ctx:MerLangParser.StatementContext):
        pass


    # Enter a parse tree produced by MerLangParser#scan_statement.
    def enterScan_statement(self, ctx:MerLangParser.Scan_statementContext):
        pass

    # Exit a parse tree produced by MerLangParser#scan_statement.
    def exitScan_statement(self, ctx:MerLangParser.Scan_statementContext):
        pass


    # Enter a parse tree produced by MerLangParser#condition.
    def enterCondition(self, ctx:MerLangParser.ConditionContext):
        pass

    # Exit a parse tree produced by MerLangParser#condition.
    def exitCondition(self, ctx:MerLangParser.ConditionContext):
        pass


    # Enter a parse tree produced by MerLangParser#conditional_statement.
    def enterConditional_statement(self, ctx:MerLangParser.Conditional_statementContext):
        pass

    # Exit a parse tree produced by MerLangParser#conditional_statement.
    def exitConditional_statement(self, ctx:MerLangParser.Conditional_statementContext):
        pass


    # Enter a parse tree produced by MerLangParser#ternary_statement.
    def enterTernary_statement(self, ctx:MerLangParser.Ternary_statementContext):
        pass

    # Exit a parse tree produced by MerLangParser#ternary_statement.
    def exitTernary_statement(self, ctx:MerLangParser.Ternary_statementContext):
        pass


    # Enter a parse tree produced by MerLangParser#value.
    def enterValue(self, ctx:MerLangParser.ValueContext):
        pass

    # Exit a parse tree produced by MerLangParser#value.
    def exitValue(self, ctx:MerLangParser.ValueContext):
        pass


    # Enter a parse tree produced by MerLangParser#assignment.
    def enterAssignment(self, ctx:MerLangParser.AssignmentContext):
        pass

    # Exit a parse tree produced by MerLangParser#assignment.
    def exitAssignment(self, ctx:MerLangParser.AssignmentContext):
        pass


    # Enter a parse tree produced by MerLangParser#function.
    def enterFunction(self, ctx:MerLangParser.FunctionContext):
        pass

    # Exit a parse tree produced by MerLangParser#function.
    def exitFunction(self, ctx:MerLangParser.FunctionContext):
        pass


    # Enter a parse tree produced by MerLangParser#function_call.
    def enterFunction_call(self, ctx:MerLangParser.Function_callContext):
        pass

    # Exit a parse tree produced by MerLangParser#function_call.
    def exitFunction_call(self, ctx:MerLangParser.Function_callContext):
        pass


    # Enter a parse tree produced by MerLangParser#function_return.
    def enterFunction_return(self, ctx:MerLangParser.Function_returnContext):
        pass

    # Exit a parse tree produced by MerLangParser#function_return.
    def exitFunction_return(self, ctx:MerLangParser.Function_returnContext):
        pass


    # Enter a parse tree produced by MerLangParser#op.
    def enterOp(self, ctx:MerLangParser.OpContext):
        pass

    # Exit a parse tree produced by MerLangParser#op.
    def exitOp(self, ctx:MerLangParser.OpContext):
        pass


    # Enter a parse tree produced by MerLangParser#unary_arithmetic.
    def enterUnary_arithmetic(self, ctx:MerLangParser.Unary_arithmeticContext):
        pass

    # Exit a parse tree produced by MerLangParser#unary_arithmetic.
    def exitUnary_arithmetic(self, ctx:MerLangParser.Unary_arithmeticContext):
        pass


    # Enter a parse tree produced by MerLangParser#arithmetic.
    def enterArithmetic(self, ctx:MerLangParser.ArithmeticContext):
        pass

    # Exit a parse tree produced by MerLangParser#arithmetic.
    def exitArithmetic(self, ctx:MerLangParser.ArithmeticContext):
        pass


    # Enter a parse tree produced by MerLangParser#relop.
    def enterRelop(self, ctx:MerLangParser.RelopContext):
        pass

    # Exit a parse tree produced by MerLangParser#relop.
    def exitRelop(self, ctx:MerLangParser.RelopContext):
        pass


    # Enter a parse tree produced by MerLangParser#expression.
    def enterExpression(self, ctx:MerLangParser.ExpressionContext):
        pass

    # Exit a parse tree produced by MerLangParser#expression.
    def exitExpression(self, ctx:MerLangParser.ExpressionContext):
        pass


    # Enter a parse tree produced by MerLangParser#array_item.
    def enterArray_item(self, ctx:MerLangParser.Array_itemContext):
        pass

    # Exit a parse tree produced by MerLangParser#array_item.
    def exitArray_item(self, ctx:MerLangParser.Array_itemContext):
        pass


    # Enter a parse tree produced by MerLangParser#array_length.
    def enterArray_length(self, ctx:MerLangParser.Array_lengthContext):
        pass

    # Exit a parse tree produced by MerLangParser#array_length.
    def exitArray_length(self, ctx:MerLangParser.Array_lengthContext):
        pass


    # Enter a parse tree produced by MerLangParser#array.
    def enterArray(self, ctx:MerLangParser.ArrayContext):
        pass

    # Exit a parse tree produced by MerLangParser#array.
    def exitArray(self, ctx:MerLangParser.ArrayContext):
        pass


    # Enter a parse tree produced by MerLangParser#array_ops.
    def enterArray_ops(self, ctx:MerLangParser.Array_opsContext):
        pass

    # Exit a parse tree produced by MerLangParser#array_ops.
    def exitArray_ops(self, ctx:MerLangParser.Array_opsContext):
        pass


    # Enter a parse tree produced by MerLangParser#array_concat.
    def enterArray_concat(self, ctx:MerLangParser.Array_concatContext):
        pass

    # Exit a parse tree produced by MerLangParser#array_concat.
    def exitArray_concat(self, ctx:MerLangParser.Array_concatContext):
        pass


    # Enter a parse tree produced by MerLangParser#print.
    def enterPrint(self, ctx:MerLangParser.PrintContext):
        pass

    # Exit a parse tree produced by MerLangParser#print.
    def exitPrint(self, ctx:MerLangParser.PrintContext):
        pass


    # Enter a parse tree produced by MerLangParser#while_loop.
    def enterWhile_loop(self, ctx:MerLangParser.While_loopContext):
        pass

    # Exit a parse tree produced by MerLangParser#while_loop.
    def exitWhile_loop(self, ctx:MerLangParser.While_loopContext):
        pass


    # Enter a parse tree produced by MerLangParser#for_loop.
    def enterFor_loop(self, ctx:MerLangParser.For_loopContext):
        pass

    # Exit a parse tree produced by MerLangParser#for_loop.
    def exitFor_loop(self, ctx:MerLangParser.For_loopContext):
        pass



del MerLangParser