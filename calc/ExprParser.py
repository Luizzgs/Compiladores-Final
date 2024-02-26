# Generated from Expr.g4 by ANTLR 4.13.1
# encoding: utf-8
from antlr4 import *
from io import StringIO
import sys
if sys.version_info[1] > 5:
	from typing import TextIO
else:
	from typing.io import TextIO



def serializedATN():
    return [
        4,1,11,45,2,0,7,0,2,1,7,1,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,
        0,1,0,3,0,16,8,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,3,1,28,
        8,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,5,1,40,8,1,10,1,12,1,
        43,9,1,1,1,0,1,2,2,0,2,0,2,1,0,4,5,1,0,6,7,48,0,15,1,0,0,0,2,27,
        1,0,0,0,4,5,3,2,1,0,5,6,5,10,0,0,6,7,6,0,-1,0,7,16,1,0,0,0,8,9,5,
        8,0,0,9,10,5,1,0,0,10,11,3,2,1,0,11,12,5,10,0,0,12,13,6,0,-1,0,13,
        16,1,0,0,0,14,16,5,10,0,0,15,4,1,0,0,0,15,8,1,0,0,0,15,14,1,0,0,
        0,16,1,1,0,0,0,17,18,6,1,-1,0,18,19,5,9,0,0,19,28,6,1,-1,0,20,21,
        5,8,0,0,21,28,6,1,-1,0,22,23,5,2,0,0,23,24,3,2,1,0,24,25,5,3,0,0,
        25,26,6,1,-1,0,26,28,1,0,0,0,27,17,1,0,0,0,27,20,1,0,0,0,27,22,1,
        0,0,0,28,41,1,0,0,0,29,30,10,5,0,0,30,31,7,0,0,0,31,32,3,2,1,6,32,
        33,6,1,-1,0,33,40,1,0,0,0,34,35,10,4,0,0,35,36,7,1,0,0,36,37,3,2,
        1,5,37,38,6,1,-1,0,38,40,1,0,0,0,39,29,1,0,0,0,39,34,1,0,0,0,40,
        43,1,0,0,0,41,39,1,0,0,0,41,42,1,0,0,0,42,3,1,0,0,0,43,41,1,0,0,
        0,4,15,27,39,41
    ]

class ExprParser ( Parser ):

    grammarFileName = "Expr.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [ "<INVALID>", "'='", "'('", "')'", "'*'", "'/'", "'+'", 
                     "'-'" ]

    symbolicNames = [ "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "MUL", "DIV", "ADD", "SUB", "ID", "INT", "NEWLINE", 
                      "WS" ]

    RULE_stat = 0
    RULE_e = 1

    ruleNames =  [ "stat", "e" ]

    EOF = Token.EOF
    T__0=1
    T__1=2
    T__2=3
    MUL=4
    DIV=5
    ADD=6
    SUB=7
    ID=8
    INT=9
    NEWLINE=10
    WS=11

    def __init__(self, input:TokenStream, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.13.1")
        self._interp = ParserATNSimulator(self, self.atn, self.decisionsToDFA, self.sharedContextCache)
        self._predicates = None



    @property
    def memory(self):
        if not hasattr(self, '_map'):
            setattr(self, '_map', {})
        return self._map
        
    @memory.setter
    def memory_setter(self, value):
        if not hasattr(self, '_map'):
            setattr(self, '_map', {})
        self._map = value
        
    def eval(self, left, op, right):
        if   ExprParser.MUL == op.type:
            return left * right
        elif ExprParser.DIV == op.type:
            return left / right
        elif ExprParser.ADD == op.type:
            return left + right
        elif ExprParser.SUB == op.type:
            return left - right
        else:
            return 0



    class StatContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser
            self._e = None # EContext
            self._ID = None # Token

        def e(self):
            return self.getTypedRuleContext(ExprParser.EContext,0)


        def NEWLINE(self):
            return self.getToken(ExprParser.NEWLINE, 0)

        def ID(self):
            return self.getToken(ExprParser.ID, 0)

        def getRuleIndex(self):
            return ExprParser.RULE_stat

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterStat" ):
                listener.enterStat(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitStat" ):
                listener.exitStat(self)




    def stat(self):

        localctx = ExprParser.StatContext(self, self._ctx, self.state)
        self.enterRule(localctx, 0, self.RULE_stat)
        try:
            self.state = 15
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,0,self._ctx)
            if la_ == 1:
                self.enterOuterAlt(localctx, 1)
                self.state = 4
                localctx._e = self.e(0)
                self.state = 5
                self.match(ExprParser.NEWLINE)
                print(localctx._e.v);
                pass

            elif la_ == 2:
                self.enterOuterAlt(localctx, 2)
                self.state = 8
                localctx._ID = self.match(ExprParser.ID)
                self.state = 9
                self.match(ExprParser.T__0)
                self.state = 10
                localctx._e = self.e(0)
                self.state = 11
                self.match(ExprParser.NEWLINE)
                self.memory[(None if localctx._ID is None else localctx._ID.text)] = localctx._e.v
                pass

            elif la_ == 3:
                self.enterOuterAlt(localctx, 3)
                self.state = 14
                self.match(ExprParser.NEWLINE)
                pass


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class EContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser
            self.v = None
            self.a = None # EContext
            self._INT = None # Token
            self._ID = None # Token
            self._e = None # EContext
            self.op = None # Token
            self.b = None # EContext

        def INT(self):
            return self.getToken(ExprParser.INT, 0)

        def ID(self):
            return self.getToken(ExprParser.ID, 0)

        def e(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(ExprParser.EContext)
            else:
                return self.getTypedRuleContext(ExprParser.EContext,i)


        def MUL(self):
            return self.getToken(ExprParser.MUL, 0)

        def DIV(self):
            return self.getToken(ExprParser.DIV, 0)

        def ADD(self):
            return self.getToken(ExprParser.ADD, 0)

        def SUB(self):
            return self.getToken(ExprParser.SUB, 0)

        def getRuleIndex(self):
            return ExprParser.RULE_e

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterE" ):
                listener.enterE(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitE" ):
                listener.exitE(self)



    def e(self, _p:int=0):
        _parentctx = self._ctx
        _parentState = self.state
        localctx = ExprParser.EContext(self, self._ctx, _parentState)
        _prevctx = localctx
        _startState = 2
        self.enterRecursionRule(localctx, 2, self.RULE_e, _p)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 27
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [9]:
                self.state = 18
                localctx._INT = self.match(ExprParser.INT)
                localctx.v = (0 if localctx._INT is None else int(localctx._INT.text))
                pass
            elif token in [8]:
                self.state = 20
                localctx._ID = self.match(ExprParser.ID)

                id = (None if localctx._ID is None else localctx._ID.text)
                localctx.v = self.memory.get(id, 0)
                      
                pass
            elif token in [2]:
                self.state = 22
                self.match(ExprParser.T__1)
                self.state = 23
                localctx._e = self.e(0)
                self.state = 24
                self.match(ExprParser.T__2)
                localctx.v = localctx._e.v
                pass
            else:
                raise NoViableAltException(self)

            self._ctx.stop = self._input.LT(-1)
            self.state = 41
            self._errHandler.sync(self)
            _alt = self._interp.adaptivePredict(self._input,3,self._ctx)
            while _alt!=2 and _alt!=ATN.INVALID_ALT_NUMBER:
                if _alt==1:
                    if self._parseListeners is not None:
                        self.triggerExitRuleEvent()
                    _prevctx = localctx
                    self.state = 39
                    self._errHandler.sync(self)
                    la_ = self._interp.adaptivePredict(self._input,2,self._ctx)
                    if la_ == 1:
                        localctx = ExprParser.EContext(self, _parentctx, _parentState)
                        localctx.a = _prevctx
                        self.pushNewRecursionContext(localctx, _startState, self.RULE_e)
                        self.state = 29
                        if not self.precpred(self._ctx, 5):
                            from antlr4.error.Errors import FailedPredicateException
                            raise FailedPredicateException(self, "self.precpred(self._ctx, 5)")
                        self.state = 30
                        localctx.op = self._input.LT(1)
                        _la = self._input.LA(1)
                        if not(_la==4 or _la==5):
                            localctx.op = self._errHandler.recoverInline(self)
                        else:
                            self._errHandler.reportMatch(self)
                            self.consume()
                        self.state = 31
                        localctx.b = localctx._e = self.e(6)
                        localctx.v = self.eval(localctx.a.v, localctx.op, localctx.b.v)
                        pass

                    elif la_ == 2:
                        localctx = ExprParser.EContext(self, _parentctx, _parentState)
                        localctx.a = _prevctx
                        self.pushNewRecursionContext(localctx, _startState, self.RULE_e)
                        self.state = 34
                        if not self.precpred(self._ctx, 4):
                            from antlr4.error.Errors import FailedPredicateException
                            raise FailedPredicateException(self, "self.precpred(self._ctx, 4)")
                        self.state = 35
                        localctx.op = self._input.LT(1)
                        _la = self._input.LA(1)
                        if not(_la==6 or _la==7):
                            localctx.op = self._errHandler.recoverInline(self)
                        else:
                            self._errHandler.reportMatch(self)
                            self.consume()
                        self.state = 36
                        localctx.b = localctx._e = self.e(5)
                        localctx.v = self.eval(localctx.a.v, localctx.op, localctx.b.v)
                        pass

             
                self.state = 43
                self._errHandler.sync(self)
                _alt = self._interp.adaptivePredict(self._input,3,self._ctx)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.unrollRecursionContexts(_parentctx)
        return localctx



    def sempred(self, localctx:RuleContext, ruleIndex:int, predIndex:int):
        if self._predicates == None:
            self._predicates = dict()
        self._predicates[1] = self.e_sempred
        pred = self._predicates.get(ruleIndex, None)
        if pred is None:
            raise Exception("No predicate with index:" + str(ruleIndex))
        else:
            return pred(localctx, predIndex)

    def e_sempred(self, localctx:EContext, predIndex:int):
            if predIndex == 0:
                return self.precpred(self._ctx, 5)
         

            if predIndex == 1:
                return self.precpred(self._ctx, 4)
         




