# Generated from Expr.g4 by ANTLR 4.13.1
from antlr4 import *
if "." in __name__:
    from .ExprParser import ExprParser
else:
    from ExprParser import ExprParser



# This class defines a complete listener for a parse tree produced by ExprParser.
class ExprListener(ParseTreeListener):

    # Enter a parse tree produced by ExprParser#stat.
    def enterStat(self, ctx:ExprParser.StatContext):
        pass

    # Exit a parse tree produced by ExprParser#stat.
    def exitStat(self, ctx:ExprParser.StatContext):
        pass


    # Enter a parse tree produced by ExprParser#e.
    def enterE(self, ctx:ExprParser.EContext):
        pass

    # Exit a parse tree produced by ExprParser#e.
    def exitE(self, ctx:ExprParser.EContext):
        pass



del ExprParser