from grammar.MerLangLexer import MerLangLexer
from grammar.MerLangListener import MerLangListener
from grammar.MerLangParser import MerLangParser

class MerLangCodeListener(MerLangListener) :
    def __init__(self, output):
        self.output = output
        self.indentCount = 0

    # Enter a parse tree produced by MerLangParser#line.
    def enterLine(self, ctx:MerLangParser.LineContext):
        self.output.write("%s" % ("\t"*self.indentCount))

    # Exit a parse tree produced by MerLangParser#line.
    def exitLine(self, ctx:MerLangParser.LineContext):
        self.output.write("\n")

    # Enter a parse tree produced by MerLangParser#unary_arithmetic.
    def enterUnary_arithmetic(self, ctx:MerLangParser.Unary_arithmeticContext):
        if ctx.UNARY_ADD() != None:
            self.output.write("%s += 1" % (ctx.VARIABLE()))
        elif ctx.UNARY_MINUS() != None:
            self.output.write("%s -= 1" % (ctx.VARIABLE()))

    # Enter a parse tree produced by MerLangParser#condition.
    def exitExpression(self, ctx:MerLangParser.ExpressionContext):
        text = ""
        for index in range(0,len(ctx.children)):
            if hasattr(ctx.children[index],'text'):
                text += ctx.children[index].text
            else:
                text += ctx.children[index].getText()
        if not isinstance(ctx.parentCtx,MerLangParser.Ternary_statementContext):
            self.output.write(text)

    # Enter a parse tree produced by MerLangParser#value.
    def enterValue(self, ctx:MerLangParser.ValueContext):
        if ctx.array_length() != None:
            ctx.text = f"len({ctx.array_length().VARIABLE()})"

    # Enter a parse tree produced by MerLangParser#condition.
    def exitCondition(self, ctx:MerLangParser.ConditionContext):
        self.output.write(":\n")

    def exitValue(self, ctx:MerLangParser.ValueContext):
        if ctx.array_length():
            ctx.text = f"len({ctx.array_length().VARIABLE()})"

    # Enter a parse tree produced by MerLangParser#conditional_statement.
    def enterConditional_statement(self, ctx:MerLangParser.Conditional_statementContext):
        self.output.write("%s " % (ctx.IF()))
        
        self.indentCount += 1

    # Exit a parse tree produced by MerLangParser#conditional_statement.
    def exitConditional_statement(self, ctx:MerLangParser.Conditional_statementContext):
        self.indentCount -= 1


    # Enter a parse tree produced by MerLangParser#ternary_statement.
    def enterTernary_statement(self, ctx:MerLangParser.Ternary_statementContext):
        self.output.write("%s if %s else %s" % (
            ctx.statement()[0].getText().replace("push","append"),
            ctx.expression().getText(),
            ctx.statement()[1].getText().replace("push","append")))

    # Exit a parse tree produced by MerLangParser#ternary_statement.
    def exitTernary_statement(self, ctx:MerLangParser.Ternary_statementContext):
        self.output.write("\n")

    # Enter a parse tree produced by MerLangParser#assignment.
    def enterAssignment(self, ctx:MerLangParser.AssignmentContext):
        if ctx.value().array_length() != None:
            self.output.write("%s = %s" % (ctx.VARIABLE(),f"len({ctx.value().array_length().VARIABLE()})"))
        else:
            self.output.write("%s = %s" % (ctx.VARIABLE(),ctx.value().getText()))

    # Enter a parse tree produced by MerLangParser#array_concat.
    def enterArray_concat(self, ctx:MerLangParser.Array_concatContext):
        concatStr = ""
        for i in range(2,-1,-1):
            concatStr = ctx.value()[i].getText() + concatStr
            if i != 0:
                concatStr = '+' + concatStr
        self.output.write("%s" % (concatStr))


    def enterFunction(self, ctx:MerLangParser.FunctionContext):
        self.output.write("%sdef " % ('\t' * self.indentCount))

        self.output.write("%s(" % (ctx.VARIABLE()))

        self.output.write("%s" % (ctx.value()[0].getText()))

        self.output.write("):\n")
        
        self.indentCount += 1
        

    
    def exitFunction(self, ctx:MerLangParser.FunctionContext):        
        self.indentCount -= 1

    
    def enterFunction_return(self, ctx:MerLangParser.Function_returnContext):
        self.output.write("%s " % (ctx.RETURN()))
        if(ctx.value()):
            self.output.write("%s\n" % (ctx.value().getText()))
        else:
            pass

    
    def enterWhile_loop(self, ctx:MerLangParser.While_loopContext):
        self.output.write("while ")
        self.indentCount += 1

    
    def exitWhile_loop(self, ctx:MerLangParser.While_loopContext):
        self.indentCount -= 1

    def enterPrint(self, ctx:MerLangParser.PrintContext):
        valueNodes = ctx.value()
        printedContent = ""
        first = True
        for node in valueNodes:
            if not first:
                printedContent += ','
            first = False
            printedContent += node.getText()

        self.output.write("%sprint(%s)\n" % ('\t' * self.indentCount, printedContent))
    

    def enterScan_statement(self, ctx:MerLangParser.Scan_statementContext):
        self.output.write("%s = input()\n" % (ctx.VARIABLE()))

    
    def intAssigment(self, ctx:MerLangParser.AssignmentContext):
        self.output.write("%s = %s\n" % (ctx.VARIABLE(), ctx.INT()))