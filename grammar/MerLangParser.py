# Generated from MerLang.g4 by ANTLR 4.13.1
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
        4,1,53,372,2,0,7,0,2,1,7,1,2,2,7,2,2,3,7,3,2,4,7,4,2,5,7,5,2,6,7,
        6,2,7,7,7,2,8,7,8,2,9,7,9,2,10,7,10,2,11,7,11,2,12,7,12,2,13,7,13,
        2,14,7,14,2,15,7,15,2,16,7,16,2,17,7,17,2,18,7,18,2,19,7,19,2,20,
        7,20,2,21,7,21,2,22,7,22,2,23,7,23,2,24,7,24,1,0,1,0,1,0,4,0,54,
        8,0,11,0,12,0,55,1,0,1,0,1,1,1,1,1,1,3,1,63,8,1,1,1,3,1,66,8,1,1,
        1,4,1,69,8,1,11,1,12,1,70,1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,2,1,2,3,
        2,82,8,2,1,3,1,3,1,3,1,3,1,3,1,3,1,3,1,4,1,4,1,4,1,4,5,4,95,8,4,
        10,4,12,4,98,9,4,1,5,1,5,1,5,1,5,1,5,1,5,5,5,106,8,5,10,5,12,5,109,
        9,5,1,5,4,5,112,8,5,11,5,12,5,113,1,5,1,5,1,6,1,6,1,6,1,6,1,6,1,
        6,1,7,1,7,1,7,1,7,1,7,1,7,1,7,1,7,3,7,132,8,7,1,8,1,8,1,8,1,8,1,
        8,1,9,1,9,3,9,141,8,9,1,9,1,9,5,9,145,8,9,10,9,12,9,148,9,9,1,9,
        1,9,1,9,5,9,153,8,9,10,9,12,9,156,9,9,1,9,4,9,159,8,9,11,9,12,9,
        160,1,9,1,9,3,9,165,8,9,1,9,4,9,168,8,9,11,9,12,9,169,1,10,1,10,
        1,10,5,10,175,8,10,10,10,12,10,178,9,10,1,10,1,10,1,11,1,11,1,11,
        3,11,185,8,11,1,12,1,12,1,13,1,13,1,13,1,14,1,14,1,14,1,14,1,14,
        1,14,5,14,198,8,14,10,14,12,14,201,9,14,1,14,3,14,204,8,14,1,15,
        1,15,1,16,1,16,3,16,210,8,16,1,16,1,16,1,16,3,16,215,8,16,1,17,1,
        17,1,17,1,17,3,17,221,8,17,1,17,1,17,1,18,1,18,1,18,1,18,1,19,1,
        19,3,19,231,8,19,1,19,1,19,5,19,235,8,19,10,19,12,19,238,9,19,1,
        19,1,19,1,20,1,20,1,20,1,20,1,20,1,20,4,20,248,8,20,11,20,12,20,
        249,1,20,1,20,1,21,1,21,1,21,1,21,1,21,1,21,3,21,260,8,21,1,21,1,
        21,1,21,3,21,265,8,21,5,21,267,8,21,10,21,12,21,270,9,21,1,21,1,
        21,1,22,1,22,1,22,1,22,1,22,5,22,279,8,22,10,22,12,22,282,9,22,1,
        22,1,22,1,22,1,22,1,22,1,22,1,22,5,22,291,8,22,10,22,12,22,294,9,
        22,1,22,1,22,1,22,1,22,1,22,1,22,1,22,1,22,1,22,1,22,1,22,1,22,1,
        22,1,22,1,22,1,22,1,22,1,22,1,22,1,22,1,22,1,22,1,22,1,22,1,22,1,
        22,1,22,1,22,1,22,1,22,3,22,326,8,22,1,23,1,23,1,23,1,23,1,23,1,
        23,5,23,334,8,23,10,23,12,23,337,9,23,1,23,4,23,340,8,23,11,23,12,
        23,341,1,23,1,23,3,23,346,8,23,1,23,1,23,1,24,1,24,1,24,1,24,1,24,
        1,24,1,24,1,24,1,24,1,24,5,24,360,8,24,10,24,12,24,363,9,24,1,24,
        4,24,366,8,24,11,24,12,24,367,1,24,1,24,1,24,0,0,25,0,2,4,6,8,10,
        12,14,16,18,20,22,24,26,28,30,32,34,36,38,40,42,44,46,48,0,5,1,0,
        20,22,1,0,43,46,1,0,47,48,1,0,34,39,1,0,14,15,405,0,53,1,0,0,0,2,
        62,1,0,0,0,4,81,1,0,0,0,6,83,1,0,0,0,8,90,1,0,0,0,10,99,1,0,0,0,
        12,117,1,0,0,0,14,131,1,0,0,0,16,133,1,0,0,0,18,138,1,0,0,0,20,171,
        1,0,0,0,22,181,1,0,0,0,24,186,1,0,0,0,26,188,1,0,0,0,28,203,1,0,
        0,0,30,205,1,0,0,0,32,209,1,0,0,0,34,216,1,0,0,0,36,224,1,0,0,0,
        38,228,1,0,0,0,40,241,1,0,0,0,42,253,1,0,0,0,44,325,1,0,0,0,46,327,
        1,0,0,0,48,349,1,0,0,0,50,54,3,2,1,0,51,54,3,18,9,0,52,54,3,6,3,
        0,53,50,1,0,0,0,53,51,1,0,0,0,53,52,1,0,0,0,54,55,1,0,0,0,55,53,
        1,0,0,0,55,56,1,0,0,0,56,57,1,0,0,0,57,58,5,0,0,1,58,1,1,0,0,0,59,
        63,3,12,6,0,60,63,3,4,2,0,61,63,3,10,5,0,62,59,1,0,0,0,62,60,1,0,
        0,0,62,61,1,0,0,0,63,65,1,0,0,0,64,66,5,1,0,0,65,64,1,0,0,0,65,66,
        1,0,0,0,66,68,1,0,0,0,67,69,5,52,0,0,68,67,1,0,0,0,69,70,1,0,0,0,
        70,68,1,0,0,0,70,71,1,0,0,0,71,3,1,0,0,0,72,82,3,16,8,0,73,82,3,
        40,20,0,74,82,3,42,21,0,75,82,3,22,11,0,76,82,3,20,10,0,77,82,3,
        28,14,0,78,82,3,44,22,0,79,82,3,46,23,0,80,82,3,48,24,0,81,72,1,
        0,0,0,81,73,1,0,0,0,81,74,1,0,0,0,81,75,1,0,0,0,81,76,1,0,0,0,81,
        77,1,0,0,0,81,78,1,0,0,0,81,79,1,0,0,0,81,80,1,0,0,0,82,5,1,0,0,
        0,83,84,5,49,0,0,84,85,5,2,0,0,85,86,5,41,0,0,86,87,5,3,0,0,87,88,
        5,4,0,0,88,89,5,1,0,0,89,7,1,0,0,0,90,96,3,32,16,0,91,92,3,30,15,
        0,92,93,3,32,16,0,93,95,1,0,0,0,94,91,1,0,0,0,95,98,1,0,0,0,96,94,
        1,0,0,0,96,97,1,0,0,0,97,9,1,0,0,0,98,96,1,0,0,0,99,100,5,32,0,0,
        100,101,5,3,0,0,101,102,3,8,4,0,102,103,5,4,0,0,103,107,5,5,0,0,
        104,106,5,52,0,0,105,104,1,0,0,0,106,109,1,0,0,0,107,105,1,0,0,0,
        107,108,1,0,0,0,108,111,1,0,0,0,109,107,1,0,0,0,110,112,3,2,1,0,
        111,110,1,0,0,0,112,113,1,0,0,0,113,111,1,0,0,0,113,114,1,0,0,0,
        114,115,1,0,0,0,115,116,5,6,0,0,116,11,1,0,0,0,117,118,3,32,16,0,
        118,119,5,7,0,0,119,120,3,4,2,0,120,121,5,8,0,0,121,122,3,4,2,0,
        122,13,1,0,0,0,123,132,5,49,0,0,124,132,5,50,0,0,125,132,5,53,0,
        0,126,132,3,20,10,0,127,132,3,34,17,0,128,132,3,36,18,0,129,132,
        3,38,19,0,130,132,3,16,8,0,131,123,1,0,0,0,131,124,1,0,0,0,131,125,
        1,0,0,0,131,126,1,0,0,0,131,127,1,0,0,0,131,128,1,0,0,0,131,129,
        1,0,0,0,131,130,1,0,0,0,132,15,1,0,0,0,133,134,7,0,0,0,134,135,5,
        49,0,0,135,136,5,2,0,0,136,137,3,14,7,0,137,17,1,0,0,0,138,140,5,
        25,0,0,139,141,5,49,0,0,140,139,1,0,0,0,140,141,1,0,0,0,141,142,
        1,0,0,0,142,146,5,3,0,0,143,145,3,14,7,0,144,143,1,0,0,0,145,148,
        1,0,0,0,146,144,1,0,0,0,146,147,1,0,0,0,147,149,1,0,0,0,148,146,
        1,0,0,0,149,150,5,4,0,0,150,154,5,5,0,0,151,153,5,52,0,0,152,151,
        1,0,0,0,153,156,1,0,0,0,154,152,1,0,0,0,154,155,1,0,0,0,155,158,
        1,0,0,0,156,154,1,0,0,0,157,159,3,2,1,0,158,157,1,0,0,0,159,160,
        1,0,0,0,160,158,1,0,0,0,160,161,1,0,0,0,161,162,1,0,0,0,162,164,
        5,6,0,0,163,165,5,1,0,0,164,163,1,0,0,0,164,165,1,0,0,0,165,167,
        1,0,0,0,166,168,5,52,0,0,167,166,1,0,0,0,168,169,1,0,0,0,169,167,
        1,0,0,0,169,170,1,0,0,0,170,19,1,0,0,0,171,172,5,49,0,0,172,176,
        5,3,0,0,173,175,3,14,7,0,174,173,1,0,0,0,175,178,1,0,0,0,176,174,
        1,0,0,0,176,177,1,0,0,0,177,179,1,0,0,0,178,176,1,0,0,0,179,180,
        5,4,0,0,180,21,1,0,0,0,181,184,5,26,0,0,182,185,3,14,7,0,183,185,
        3,42,21,0,184,182,1,0,0,0,184,183,1,0,0,0,185,23,1,0,0,0,186,187,
        7,1,0,0,187,25,1,0,0,0,188,189,5,49,0,0,189,190,7,2,0,0,190,27,1,
        0,0,0,191,192,3,14,7,0,192,193,3,24,12,0,193,199,3,14,7,0,194,195,
        3,24,12,0,195,196,3,14,7,0,196,198,1,0,0,0,197,194,1,0,0,0,198,201,
        1,0,0,0,199,197,1,0,0,0,199,200,1,0,0,0,200,204,1,0,0,0,201,199,
        1,0,0,0,202,204,3,26,13,0,203,191,1,0,0,0,203,202,1,0,0,0,204,29,
        1,0,0,0,205,206,7,3,0,0,206,31,1,0,0,0,207,210,3,14,7,0,208,210,
        3,28,14,0,209,207,1,0,0,0,209,208,1,0,0,0,210,211,1,0,0,0,211,214,
        3,30,15,0,212,215,3,14,7,0,213,215,3,28,14,0,214,212,1,0,0,0,214,
        213,1,0,0,0,215,33,1,0,0,0,216,217,5,49,0,0,217,220,5,9,0,0,218,
        221,3,14,7,0,219,221,3,28,14,0,220,218,1,0,0,0,220,219,1,0,0,0,221,
        222,1,0,0,0,222,223,5,10,0,0,223,35,1,0,0,0,224,225,5,49,0,0,225,
        226,5,11,0,0,226,227,5,12,0,0,227,37,1,0,0,0,228,230,5,9,0,0,229,
        231,3,14,7,0,230,229,1,0,0,0,230,231,1,0,0,0,231,236,1,0,0,0,232,
        233,5,13,0,0,233,235,3,14,7,0,234,232,1,0,0,0,235,238,1,0,0,0,236,
        234,1,0,0,0,236,237,1,0,0,0,237,239,1,0,0,0,238,236,1,0,0,0,239,
        240,5,10,0,0,240,39,1,0,0,0,241,242,5,49,0,0,242,243,5,11,0,0,243,
        244,7,4,0,0,244,247,5,3,0,0,245,248,3,14,7,0,246,248,3,34,17,0,247,
        245,1,0,0,0,247,246,1,0,0,0,248,249,1,0,0,0,249,247,1,0,0,0,249,
        250,1,0,0,0,250,251,1,0,0,0,251,252,5,4,0,0,252,41,1,0,0,0,253,254,
        3,14,7,0,254,255,5,11,0,0,255,256,5,16,0,0,256,259,5,3,0,0,257,260,
        3,14,7,0,258,260,3,34,17,0,259,257,1,0,0,0,259,258,1,0,0,0,260,268,
        1,0,0,0,261,264,5,13,0,0,262,265,3,14,7,0,263,265,3,34,17,0,264,
        262,1,0,0,0,264,263,1,0,0,0,265,267,1,0,0,0,266,261,1,0,0,0,267,
        270,1,0,0,0,268,266,1,0,0,0,268,269,1,0,0,0,269,271,1,0,0,0,270,
        268,1,0,0,0,271,272,5,4,0,0,272,43,1,0,0,0,273,274,5,40,0,0,274,
        275,5,3,0,0,275,280,3,14,7,0,276,277,5,13,0,0,277,279,3,14,7,0,278,
        276,1,0,0,0,279,282,1,0,0,0,280,278,1,0,0,0,280,281,1,0,0,0,281,
        283,1,0,0,0,282,280,1,0,0,0,283,284,5,4,0,0,284,326,1,0,0,0,285,
        286,5,40,0,0,286,287,5,3,0,0,287,292,5,53,0,0,288,289,5,13,0,0,289,
        291,3,14,7,0,290,288,1,0,0,0,291,294,1,0,0,0,292,290,1,0,0,0,292,
        293,1,0,0,0,293,295,1,0,0,0,294,292,1,0,0,0,295,326,5,4,0,0,296,
        297,5,40,0,0,297,298,5,3,0,0,298,299,5,53,0,0,299,326,5,4,0,0,300,
        301,5,40,0,0,301,302,5,3,0,0,302,303,3,16,8,0,303,304,5,4,0,0,304,
        326,1,0,0,0,305,306,5,40,0,0,306,307,5,3,0,0,307,308,3,32,16,0,308,
        309,5,4,0,0,309,326,1,0,0,0,310,311,5,40,0,0,311,312,5,3,0,0,312,
        313,3,38,19,0,313,314,5,4,0,0,314,326,1,0,0,0,315,316,5,40,0,0,316,
        317,5,3,0,0,317,318,3,34,17,0,318,319,5,4,0,0,319,326,1,0,0,0,320,
        321,5,40,0,0,321,322,5,3,0,0,322,323,3,36,18,0,323,324,5,4,0,0,324,
        326,1,0,0,0,325,273,1,0,0,0,325,285,1,0,0,0,325,296,1,0,0,0,325,
        300,1,0,0,0,325,305,1,0,0,0,325,310,1,0,0,0,325,315,1,0,0,0,325,
        320,1,0,0,0,326,45,1,0,0,0,327,328,5,27,0,0,328,329,5,3,0,0,329,
        330,3,8,4,0,330,331,5,4,0,0,331,335,5,5,0,0,332,334,5,52,0,0,333,
        332,1,0,0,0,334,337,1,0,0,0,335,333,1,0,0,0,335,336,1,0,0,0,336,
        345,1,0,0,0,337,335,1,0,0,0,338,340,3,2,1,0,339,338,1,0,0,0,340,
        341,1,0,0,0,341,339,1,0,0,0,341,342,1,0,0,0,342,346,1,0,0,0,343,
        344,5,42,0,0,344,346,5,52,0,0,345,339,1,0,0,0,345,343,1,0,0,0,346,
        347,1,0,0,0,347,348,5,6,0,0,348,47,1,0,0,0,349,350,5,28,0,0,350,
        351,5,3,0,0,351,352,3,16,8,0,352,353,5,1,0,0,353,354,3,8,4,0,354,
        355,5,1,0,0,355,356,3,16,8,0,356,357,5,4,0,0,357,361,5,5,0,0,358,
        360,5,52,0,0,359,358,1,0,0,0,360,363,1,0,0,0,361,359,1,0,0,0,361,
        362,1,0,0,0,362,365,1,0,0,0,363,361,1,0,0,0,364,366,3,2,1,0,365,
        364,1,0,0,0,366,367,1,0,0,0,367,365,1,0,0,0,367,368,1,0,0,0,368,
        369,1,0,0,0,369,370,5,6,0,0,370,49,1,0,0,0,38,53,55,62,65,70,81,
        96,107,113,131,140,146,154,160,164,169,176,184,199,203,209,214,220,
        230,236,247,249,259,264,268,280,292,325,335,341,345,361,367
    ]

class MerLangParser ( Parser ):

    grammarFileName = "MerLang.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [ "<INVALID>", "';'", "'='", "'('", "')'", "'{'", "'}'", 
                     "'?'", "':'", "'['", "']'", "'.'", "'length'", "','", 
                     "'push'", "'pop'", "'concat'", "<INVALID>", "<INVALID>", 
                     "<INVALID>", "'int'", "'string'", "'boolean'", "'True'", 
                     "'False'", "'function'", "'return'", "'while'", "'for'", 
                     "'var'", "'const'", "'let'", "'if'", "'else'", "'<'", 
                     "'<='", "'>'", "'>='", "'=='", "'!='", "'print'", "'scan'", 
                     "'break'", "'+'", "'-'", "'*'", "'/'", "'++'", "'--'" ]

    symbolicNames = [ "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "<INVALID>", "<INVALID>", "<INVALID>", 
                      "<INVALID>", "BOOLEAN_ASSIGNMENT", "INT_ASSIGNMENT", 
                      "STRING_ASSIGNMENT", "INT", "STRING", "BOOLEAN", "TRUE", 
                      "FALSE", "FUNCTION", "RETURN", "WHILE", "FOR", "VAR", 
                      "CONST", "LET", "IF", "ELSE", "LT", "LTE", "GT", "GTE", 
                      "EQ", "NEQ", "PRINT", "SCAN_KEYWORD", "BREAK", "ADD_OP", 
                      "SUB_OP", "MUL_OP", "DIV_OP", "UNARY_ADD", "UNARY_MINUS", 
                      "VARIABLE", "NUMBER", "WHITESPACE", "NEWLINE", "TEXT" ]

    RULE_program = 0
    RULE_line = 1
    RULE_statement = 2
    RULE_scan_statement = 3
    RULE_condition = 4
    RULE_conditional_statement = 5
    RULE_ternary_statement = 6
    RULE_value = 7
    RULE_assignment = 8
    RULE_function = 9
    RULE_function_call = 10
    RULE_function_return = 11
    RULE_op = 12
    RULE_unary_arithmetic = 13
    RULE_arithmetic = 14
    RULE_relop = 15
    RULE_expression = 16
    RULE_array_item = 17
    RULE_array_length = 18
    RULE_array = 19
    RULE_array_ops = 20
    RULE_array_concat = 21
    RULE_print = 22
    RULE_while_loop = 23
    RULE_for_loop = 24

    ruleNames =  [ "program", "line", "statement", "scan_statement", "condition", 
                   "conditional_statement", "ternary_statement", "value", 
                   "assignment", "function", "function_call", "function_return", 
                   "op", "unary_arithmetic", "arithmetic", "relop", "expression", 
                   "array_item", "array_length", "array", "array_ops", "array_concat", 
                   "print", "while_loop", "for_loop" ]

    EOF = Token.EOF
    T__0=1
    T__1=2
    T__2=3
    T__3=4
    T__4=5
    T__5=6
    T__6=7
    T__7=8
    T__8=9
    T__9=10
    T__10=11
    T__11=12
    T__12=13
    T__13=14
    T__14=15
    T__15=16
    BOOLEAN_ASSIGNMENT=17
    INT_ASSIGNMENT=18
    STRING_ASSIGNMENT=19
    INT=20
    STRING=21
    BOOLEAN=22
    TRUE=23
    FALSE=24
    FUNCTION=25
    RETURN=26
    WHILE=27
    FOR=28
    VAR=29
    CONST=30
    LET=31
    IF=32
    ELSE=33
    LT=34
    LTE=35
    GT=36
    GTE=37
    EQ=38
    NEQ=39
    PRINT=40
    SCAN_KEYWORD=41
    BREAK=42
    ADD_OP=43
    SUB_OP=44
    MUL_OP=45
    DIV_OP=46
    UNARY_ADD=47
    UNARY_MINUS=48
    VARIABLE=49
    NUMBER=50
    WHITESPACE=51
    NEWLINE=52
    TEXT=53

    def __init__(self, input:TokenStream, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.13.1")
        self._interp = ParserATNSimulator(self, self.atn, self.decisionsToDFA, self.sharedContextCache)
        self._predicates = None




    class ProgramContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def EOF(self):
            return self.getToken(MerLangParser.EOF, 0)

        def line(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(MerLangParser.LineContext)
            else:
                return self.getTypedRuleContext(MerLangParser.LineContext,i)


        def function(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(MerLangParser.FunctionContext)
            else:
                return self.getTypedRuleContext(MerLangParser.FunctionContext,i)


        def scan_statement(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(MerLangParser.Scan_statementContext)
            else:
                return self.getTypedRuleContext(MerLangParser.Scan_statementContext,i)


        def getRuleIndex(self):
            return MerLangParser.RULE_program

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterProgram" ):
                listener.enterProgram(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitProgram" ):
                listener.exitProgram(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitProgram" ):
                return visitor.visitProgram(self)
            else:
                return visitor.visitChildren(self)




    def program(self):

        localctx = MerLangParser.ProgramContext(self, self._ctx, self.state)
        self.enterRule(localctx, 0, self.RULE_program)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 53 
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while True:
                self.state = 53
                self._errHandler.sync(self)
                la_ = self._interp.adaptivePredict(self._input,0,self._ctx)
                if la_ == 1:
                    self.state = 50
                    self.line()
                    pass

                elif la_ == 2:
                    self.state = 51
                    self.function()
                    pass

                elif la_ == 3:
                    self.state = 52
                    self.scan_statement()
                    pass


                self.state = 55 
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if not ((((_la) & ~0x3f) == 0 and ((1 << _la) & 10697153432257024) != 0)):
                    break

            self.state = 57
            self.match(MerLangParser.EOF)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class LineContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def ternary_statement(self):
            return self.getTypedRuleContext(MerLangParser.Ternary_statementContext,0)


        def statement(self):
            return self.getTypedRuleContext(MerLangParser.StatementContext,0)


        def conditional_statement(self):
            return self.getTypedRuleContext(MerLangParser.Conditional_statementContext,0)


        def NEWLINE(self, i:int=None):
            if i is None:
                return self.getTokens(MerLangParser.NEWLINE)
            else:
                return self.getToken(MerLangParser.NEWLINE, i)

        def getRuleIndex(self):
            return MerLangParser.RULE_line

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterLine" ):
                listener.enterLine(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitLine" ):
                listener.exitLine(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitLine" ):
                return visitor.visitLine(self)
            else:
                return visitor.visitChildren(self)




    def line(self):

        localctx = MerLangParser.LineContext(self, self._ctx, self.state)
        self.enterRule(localctx, 2, self.RULE_line)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 62
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,2,self._ctx)
            if la_ == 1:
                self.state = 59
                self.ternary_statement()
                pass

            elif la_ == 2:
                self.state = 60
                self.statement()
                pass

            elif la_ == 3:
                self.state = 61
                self.conditional_statement()
                pass


            self.state = 65
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==1:
                self.state = 64
                self.match(MerLangParser.T__0)


            self.state = 68 
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while True:
                self.state = 67
                self.match(MerLangParser.NEWLINE)
                self.state = 70 
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if not (_la==52):
                    break

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class StatementContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def assignment(self):
            return self.getTypedRuleContext(MerLangParser.AssignmentContext,0)


        def array_ops(self):
            return self.getTypedRuleContext(MerLangParser.Array_opsContext,0)


        def array_concat(self):
            return self.getTypedRuleContext(MerLangParser.Array_concatContext,0)


        def function_return(self):
            return self.getTypedRuleContext(MerLangParser.Function_returnContext,0)


        def function_call(self):
            return self.getTypedRuleContext(MerLangParser.Function_callContext,0)


        def arithmetic(self):
            return self.getTypedRuleContext(MerLangParser.ArithmeticContext,0)


        def print_(self):
            return self.getTypedRuleContext(MerLangParser.PrintContext,0)


        def while_loop(self):
            return self.getTypedRuleContext(MerLangParser.While_loopContext,0)


        def for_loop(self):
            return self.getTypedRuleContext(MerLangParser.For_loopContext,0)


        def getRuleIndex(self):
            return MerLangParser.RULE_statement

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterStatement" ):
                listener.enterStatement(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitStatement" ):
                listener.exitStatement(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitStatement" ):
                return visitor.visitStatement(self)
            else:
                return visitor.visitChildren(self)




    def statement(self):

        localctx = MerLangParser.StatementContext(self, self._ctx, self.state)
        self.enterRule(localctx, 4, self.RULE_statement)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 81
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,5,self._ctx)
            if la_ == 1:
                self.state = 72
                self.assignment()
                pass

            elif la_ == 2:
                self.state = 73
                self.array_ops()
                pass

            elif la_ == 3:
                self.state = 74
                self.array_concat()
                pass

            elif la_ == 4:
                self.state = 75
                self.function_return()
                pass

            elif la_ == 5:
                self.state = 76
                self.function_call()
                pass

            elif la_ == 6:
                self.state = 77
                self.arithmetic()
                pass

            elif la_ == 7:
                self.state = 78
                self.print_()
                pass

            elif la_ == 8:
                self.state = 79
                self.while_loop()
                pass

            elif la_ == 9:
                self.state = 80
                self.for_loop()
                pass


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Scan_statementContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def VARIABLE(self):
            return self.getToken(MerLangParser.VARIABLE, 0)

        def SCAN_KEYWORD(self):
            return self.getToken(MerLangParser.SCAN_KEYWORD, 0)

        def getRuleIndex(self):
            return MerLangParser.RULE_scan_statement

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterScan_statement" ):
                listener.enterScan_statement(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitScan_statement" ):
                listener.exitScan_statement(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitScan_statement" ):
                return visitor.visitScan_statement(self)
            else:
                return visitor.visitChildren(self)




    def scan_statement(self):

        localctx = MerLangParser.Scan_statementContext(self, self._ctx, self.state)
        self.enterRule(localctx, 6, self.RULE_scan_statement)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 83
            self.match(MerLangParser.VARIABLE)
            self.state = 84
            self.match(MerLangParser.T__1)
            self.state = 85
            self.match(MerLangParser.SCAN_KEYWORD)
            self.state = 86
            self.match(MerLangParser.T__2)
            self.state = 87
            self.match(MerLangParser.T__3)
            self.state = 88
            self.match(MerLangParser.T__0)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ConditionContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def expression(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(MerLangParser.ExpressionContext)
            else:
                return self.getTypedRuleContext(MerLangParser.ExpressionContext,i)


        def relop(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(MerLangParser.RelopContext)
            else:
                return self.getTypedRuleContext(MerLangParser.RelopContext,i)


        def getRuleIndex(self):
            return MerLangParser.RULE_condition

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterCondition" ):
                listener.enterCondition(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitCondition" ):
                listener.exitCondition(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitCondition" ):
                return visitor.visitCondition(self)
            else:
                return visitor.visitChildren(self)




    def condition(self):

        localctx = MerLangParser.ConditionContext(self, self._ctx, self.state)
        self.enterRule(localctx, 8, self.RULE_condition)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 90
            self.expression()
            self.state = 96
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while (((_la) & ~0x3f) == 0 and ((1 << _la) & 1082331758592) != 0):
                self.state = 91
                self.relop()
                self.state = 92
                self.expression()
                self.state = 98
                self._errHandler.sync(self)
                _la = self._input.LA(1)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Conditional_statementContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def IF(self):
            return self.getToken(MerLangParser.IF, 0)

        def condition(self):
            return self.getTypedRuleContext(MerLangParser.ConditionContext,0)


        def NEWLINE(self, i:int=None):
            if i is None:
                return self.getTokens(MerLangParser.NEWLINE)
            else:
                return self.getToken(MerLangParser.NEWLINE, i)

        def line(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(MerLangParser.LineContext)
            else:
                return self.getTypedRuleContext(MerLangParser.LineContext,i)


        def getRuleIndex(self):
            return MerLangParser.RULE_conditional_statement

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterConditional_statement" ):
                listener.enterConditional_statement(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitConditional_statement" ):
                listener.exitConditional_statement(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitConditional_statement" ):
                return visitor.visitConditional_statement(self)
            else:
                return visitor.visitChildren(self)




    def conditional_statement(self):

        localctx = MerLangParser.Conditional_statementContext(self, self._ctx, self.state)
        self.enterRule(localctx, 10, self.RULE_conditional_statement)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 99
            self.match(MerLangParser.IF)
            self.state = 100
            self.match(MerLangParser.T__2)
            self.state = 101
            self.condition()
            self.state = 102
            self.match(MerLangParser.T__3)
            self.state = 103
            self.match(MerLangParser.T__4)
            self.state = 107
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==52:
                self.state = 104
                self.match(MerLangParser.NEWLINE)
                self.state = 109
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 111 
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while True:
                self.state = 110
                self.line()
                self.state = 113 
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if not ((((_la) & ~0x3f) == 0 and ((1 << _la) & 10697153398702592) != 0)):
                    break

            self.state = 115
            self.match(MerLangParser.T__5)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Ternary_statementContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def expression(self):
            return self.getTypedRuleContext(MerLangParser.ExpressionContext,0)


        def statement(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(MerLangParser.StatementContext)
            else:
                return self.getTypedRuleContext(MerLangParser.StatementContext,i)


        def getRuleIndex(self):
            return MerLangParser.RULE_ternary_statement

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterTernary_statement" ):
                listener.enterTernary_statement(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitTernary_statement" ):
                listener.exitTernary_statement(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitTernary_statement" ):
                return visitor.visitTernary_statement(self)
            else:
                return visitor.visitChildren(self)




    def ternary_statement(self):

        localctx = MerLangParser.Ternary_statementContext(self, self._ctx, self.state)
        self.enterRule(localctx, 12, self.RULE_ternary_statement)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 117
            self.expression()
            self.state = 118
            self.match(MerLangParser.T__6)
            self.state = 119
            self.statement()
            self.state = 120
            self.match(MerLangParser.T__7)
            self.state = 121
            self.statement()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ValueContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def VARIABLE(self):
            return self.getToken(MerLangParser.VARIABLE, 0)

        def NUMBER(self):
            return self.getToken(MerLangParser.NUMBER, 0)

        def TEXT(self):
            return self.getToken(MerLangParser.TEXT, 0)

        def function_call(self):
            return self.getTypedRuleContext(MerLangParser.Function_callContext,0)


        def array_item(self):
            return self.getTypedRuleContext(MerLangParser.Array_itemContext,0)


        def array_length(self):
            return self.getTypedRuleContext(MerLangParser.Array_lengthContext,0)


        def array(self):
            return self.getTypedRuleContext(MerLangParser.ArrayContext,0)


        def assignment(self):
            return self.getTypedRuleContext(MerLangParser.AssignmentContext,0)


        def getRuleIndex(self):
            return MerLangParser.RULE_value

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterValue" ):
                listener.enterValue(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitValue" ):
                listener.exitValue(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitValue" ):
                return visitor.visitValue(self)
            else:
                return visitor.visitChildren(self)




    def value(self):

        localctx = MerLangParser.ValueContext(self, self._ctx, self.state)
        self.enterRule(localctx, 14, self.RULE_value)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 131
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,9,self._ctx)
            if la_ == 1:
                self.state = 123
                self.match(MerLangParser.VARIABLE)
                pass

            elif la_ == 2:
                self.state = 124
                self.match(MerLangParser.NUMBER)
                pass

            elif la_ == 3:
                self.state = 125
                self.match(MerLangParser.TEXT)
                pass

            elif la_ == 4:
                self.state = 126
                self.function_call()
                pass

            elif la_ == 5:
                self.state = 127
                self.array_item()
                pass

            elif la_ == 6:
                self.state = 128
                self.array_length()
                pass

            elif la_ == 7:
                self.state = 129
                self.array()
                pass

            elif la_ == 8:
                self.state = 130
                self.assignment()
                pass


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class AssignmentContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def VARIABLE(self):
            return self.getToken(MerLangParser.VARIABLE, 0)

        def value(self):
            return self.getTypedRuleContext(MerLangParser.ValueContext,0)


        def INT(self):
            return self.getToken(MerLangParser.INT, 0)

        def STRING(self):
            return self.getToken(MerLangParser.STRING, 0)

        def BOOLEAN(self):
            return self.getToken(MerLangParser.BOOLEAN, 0)

        def getRuleIndex(self):
            return MerLangParser.RULE_assignment

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterAssignment" ):
                listener.enterAssignment(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitAssignment" ):
                listener.exitAssignment(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitAssignment" ):
                return visitor.visitAssignment(self)
            else:
                return visitor.visitChildren(self)




    def assignment(self):

        localctx = MerLangParser.AssignmentContext(self, self._ctx, self.state)
        self.enterRule(localctx, 16, self.RULE_assignment)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 133
            _la = self._input.LA(1)
            if not((((_la) & ~0x3f) == 0 and ((1 << _la) & 7340032) != 0)):
                self._errHandler.recoverInline(self)
            else:
                self._errHandler.reportMatch(self)
                self.consume()
            self.state = 134
            self.match(MerLangParser.VARIABLE)
            self.state = 135
            self.match(MerLangParser.T__1)
            self.state = 136
            self.value()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class FunctionContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def FUNCTION(self):
            return self.getToken(MerLangParser.FUNCTION, 0)

        def VARIABLE(self):
            return self.getToken(MerLangParser.VARIABLE, 0)

        def value(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(MerLangParser.ValueContext)
            else:
                return self.getTypedRuleContext(MerLangParser.ValueContext,i)


        def NEWLINE(self, i:int=None):
            if i is None:
                return self.getTokens(MerLangParser.NEWLINE)
            else:
                return self.getToken(MerLangParser.NEWLINE, i)

        def line(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(MerLangParser.LineContext)
            else:
                return self.getTypedRuleContext(MerLangParser.LineContext,i)


        def getRuleIndex(self):
            return MerLangParser.RULE_function

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterFunction" ):
                listener.enterFunction(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitFunction" ):
                listener.exitFunction(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitFunction" ):
                return visitor.visitFunction(self)
            else:
                return visitor.visitChildren(self)




    def function(self):

        localctx = MerLangParser.FunctionContext(self, self._ctx, self.state)
        self.enterRule(localctx, 18, self.RULE_function)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 138
            self.match(MerLangParser.FUNCTION)
            self.state = 140
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==49:
                self.state = 139
                self.match(MerLangParser.VARIABLE)


            self.state = 142
            self.match(MerLangParser.T__2)
            self.state = 146
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while (((_la) & ~0x3f) == 0 and ((1 << _la) & 10696049122345472) != 0):
                self.state = 143
                self.value()
                self.state = 148
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 149
            self.match(MerLangParser.T__3)
            self.state = 150
            self.match(MerLangParser.T__4)
            self.state = 154
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==52:
                self.state = 151
                self.match(MerLangParser.NEWLINE)
                self.state = 156
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 158 
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while True:
                self.state = 157
                self.line()
                self.state = 160 
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if not ((((_la) & ~0x3f) == 0 and ((1 << _la) & 10697153398702592) != 0)):
                    break

            self.state = 162
            self.match(MerLangParser.T__5)
            self.state = 164
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==1:
                self.state = 163
                self.match(MerLangParser.T__0)


            self.state = 167 
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while True:
                self.state = 166
                self.match(MerLangParser.NEWLINE)
                self.state = 169 
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if not (_la==52):
                    break

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Function_callContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def VARIABLE(self):
            return self.getToken(MerLangParser.VARIABLE, 0)

        def value(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(MerLangParser.ValueContext)
            else:
                return self.getTypedRuleContext(MerLangParser.ValueContext,i)


        def getRuleIndex(self):
            return MerLangParser.RULE_function_call

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterFunction_call" ):
                listener.enterFunction_call(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitFunction_call" ):
                listener.exitFunction_call(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitFunction_call" ):
                return visitor.visitFunction_call(self)
            else:
                return visitor.visitChildren(self)




    def function_call(self):

        localctx = MerLangParser.Function_callContext(self, self._ctx, self.state)
        self.enterRule(localctx, 20, self.RULE_function_call)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 171
            self.match(MerLangParser.VARIABLE)
            self.state = 172
            self.match(MerLangParser.T__2)
            self.state = 176
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while (((_la) & ~0x3f) == 0 and ((1 << _la) & 10696049122345472) != 0):
                self.state = 173
                self.value()
                self.state = 178
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 179
            self.match(MerLangParser.T__3)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Function_returnContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def RETURN(self):
            return self.getToken(MerLangParser.RETURN, 0)

        def value(self):
            return self.getTypedRuleContext(MerLangParser.ValueContext,0)


        def array_concat(self):
            return self.getTypedRuleContext(MerLangParser.Array_concatContext,0)


        def getRuleIndex(self):
            return MerLangParser.RULE_function_return

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterFunction_return" ):
                listener.enterFunction_return(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitFunction_return" ):
                listener.exitFunction_return(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitFunction_return" ):
                return visitor.visitFunction_return(self)
            else:
                return visitor.visitChildren(self)




    def function_return(self):

        localctx = MerLangParser.Function_returnContext(self, self._ctx, self.state)
        self.enterRule(localctx, 22, self.RULE_function_return)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 181
            self.match(MerLangParser.RETURN)
            self.state = 184
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,17,self._ctx)
            if la_ == 1:
                self.state = 182
                self.value()
                pass

            elif la_ == 2:
                self.state = 183
                self.array_concat()
                pass


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class OpContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def ADD_OP(self):
            return self.getToken(MerLangParser.ADD_OP, 0)

        def SUB_OP(self):
            return self.getToken(MerLangParser.SUB_OP, 0)

        def MUL_OP(self):
            return self.getToken(MerLangParser.MUL_OP, 0)

        def DIV_OP(self):
            return self.getToken(MerLangParser.DIV_OP, 0)

        def getRuleIndex(self):
            return MerLangParser.RULE_op

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterOp" ):
                listener.enterOp(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitOp" ):
                listener.exitOp(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitOp" ):
                return visitor.visitOp(self)
            else:
                return visitor.visitChildren(self)




    def op(self):

        localctx = MerLangParser.OpContext(self, self._ctx, self.state)
        self.enterRule(localctx, 24, self.RULE_op)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 186
            _la = self._input.LA(1)
            if not((((_la) & ~0x3f) == 0 and ((1 << _la) & 131941395333120) != 0)):
                self._errHandler.recoverInline(self)
            else:
                self._errHandler.reportMatch(self)
                self.consume()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Unary_arithmeticContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def VARIABLE(self):
            return self.getToken(MerLangParser.VARIABLE, 0)

        def UNARY_ADD(self):
            return self.getToken(MerLangParser.UNARY_ADD, 0)

        def UNARY_MINUS(self):
            return self.getToken(MerLangParser.UNARY_MINUS, 0)

        def getRuleIndex(self):
            return MerLangParser.RULE_unary_arithmetic

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterUnary_arithmetic" ):
                listener.enterUnary_arithmetic(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitUnary_arithmetic" ):
                listener.exitUnary_arithmetic(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitUnary_arithmetic" ):
                return visitor.visitUnary_arithmetic(self)
            else:
                return visitor.visitChildren(self)




    def unary_arithmetic(self):

        localctx = MerLangParser.Unary_arithmeticContext(self, self._ctx, self.state)
        self.enterRule(localctx, 26, self.RULE_unary_arithmetic)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 188
            self.match(MerLangParser.VARIABLE)
            self.state = 189
            _la = self._input.LA(1)
            if not(_la==47 or _la==48):
                self._errHandler.recoverInline(self)
            else:
                self._errHandler.reportMatch(self)
                self.consume()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ArithmeticContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def unary_arithmetic(self):
            return self.getTypedRuleContext(MerLangParser.Unary_arithmeticContext,0)


        def value(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(MerLangParser.ValueContext)
            else:
                return self.getTypedRuleContext(MerLangParser.ValueContext,i)


        def op(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(MerLangParser.OpContext)
            else:
                return self.getTypedRuleContext(MerLangParser.OpContext,i)


        def getRuleIndex(self):
            return MerLangParser.RULE_arithmetic

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterArithmetic" ):
                listener.enterArithmetic(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitArithmetic" ):
                listener.exitArithmetic(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitArithmetic" ):
                return visitor.visitArithmetic(self)
            else:
                return visitor.visitChildren(self)




    def arithmetic(self):

        localctx = MerLangParser.ArithmeticContext(self, self._ctx, self.state)
        self.enterRule(localctx, 28, self.RULE_arithmetic)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 203
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,19,self._ctx)
            if la_ == 1:
                self.state = 191
                self.value()
                self.state = 192
                self.op()
                self.state = 193
                self.value()
                self.state = 199
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                while (((_la) & ~0x3f) == 0 and ((1 << _la) & 131941395333120) != 0):
                    self.state = 194
                    self.op()
                    self.state = 195
                    self.value()
                    self.state = 201
                    self._errHandler.sync(self)
                    _la = self._input.LA(1)

                pass

            elif la_ == 2:
                self.state = 202
                self.unary_arithmetic()
                pass


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class RelopContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def LT(self):
            return self.getToken(MerLangParser.LT, 0)

        def LTE(self):
            return self.getToken(MerLangParser.LTE, 0)

        def GT(self):
            return self.getToken(MerLangParser.GT, 0)

        def GTE(self):
            return self.getToken(MerLangParser.GTE, 0)

        def EQ(self):
            return self.getToken(MerLangParser.EQ, 0)

        def NEQ(self):
            return self.getToken(MerLangParser.NEQ, 0)

        def getRuleIndex(self):
            return MerLangParser.RULE_relop

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterRelop" ):
                listener.enterRelop(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitRelop" ):
                listener.exitRelop(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitRelop" ):
                return visitor.visitRelop(self)
            else:
                return visitor.visitChildren(self)




    def relop(self):

        localctx = MerLangParser.RelopContext(self, self._ctx, self.state)
        self.enterRule(localctx, 30, self.RULE_relop)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 205
            _la = self._input.LA(1)
            if not((((_la) & ~0x3f) == 0 and ((1 << _la) & 1082331758592) != 0)):
                self._errHandler.recoverInline(self)
            else:
                self._errHandler.reportMatch(self)
                self.consume()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ExpressionContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def relop(self):
            return self.getTypedRuleContext(MerLangParser.RelopContext,0)


        def value(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(MerLangParser.ValueContext)
            else:
                return self.getTypedRuleContext(MerLangParser.ValueContext,i)


        def arithmetic(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(MerLangParser.ArithmeticContext)
            else:
                return self.getTypedRuleContext(MerLangParser.ArithmeticContext,i)


        def getRuleIndex(self):
            return MerLangParser.RULE_expression

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterExpression" ):
                listener.enterExpression(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitExpression" ):
                listener.exitExpression(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitExpression" ):
                return visitor.visitExpression(self)
            else:
                return visitor.visitChildren(self)




    def expression(self):

        localctx = MerLangParser.ExpressionContext(self, self._ctx, self.state)
        self.enterRule(localctx, 32, self.RULE_expression)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 209
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,20,self._ctx)
            if la_ == 1:
                self.state = 207
                self.value()
                pass

            elif la_ == 2:
                self.state = 208
                self.arithmetic()
                pass


            self.state = 211
            self.relop()
            self.state = 214
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,21,self._ctx)
            if la_ == 1:
                self.state = 212
                self.value()
                pass

            elif la_ == 2:
                self.state = 213
                self.arithmetic()
                pass


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Array_itemContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def VARIABLE(self):
            return self.getToken(MerLangParser.VARIABLE, 0)

        def value(self):
            return self.getTypedRuleContext(MerLangParser.ValueContext,0)


        def arithmetic(self):
            return self.getTypedRuleContext(MerLangParser.ArithmeticContext,0)


        def getRuleIndex(self):
            return MerLangParser.RULE_array_item

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterArray_item" ):
                listener.enterArray_item(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitArray_item" ):
                listener.exitArray_item(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitArray_item" ):
                return visitor.visitArray_item(self)
            else:
                return visitor.visitChildren(self)




    def array_item(self):

        localctx = MerLangParser.Array_itemContext(self, self._ctx, self.state)
        self.enterRule(localctx, 34, self.RULE_array_item)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 216
            self.match(MerLangParser.VARIABLE)
            self.state = 217
            self.match(MerLangParser.T__8)
            self.state = 220
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,22,self._ctx)
            if la_ == 1:
                self.state = 218
                self.value()
                pass

            elif la_ == 2:
                self.state = 219
                self.arithmetic()
                pass


            self.state = 222
            self.match(MerLangParser.T__9)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Array_lengthContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def VARIABLE(self):
            return self.getToken(MerLangParser.VARIABLE, 0)

        def getRuleIndex(self):
            return MerLangParser.RULE_array_length

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterArray_length" ):
                listener.enterArray_length(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitArray_length" ):
                listener.exitArray_length(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitArray_length" ):
                return visitor.visitArray_length(self)
            else:
                return visitor.visitChildren(self)




    def array_length(self):

        localctx = MerLangParser.Array_lengthContext(self, self._ctx, self.state)
        self.enterRule(localctx, 36, self.RULE_array_length)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 224
            self.match(MerLangParser.VARIABLE)
            self.state = 225
            self.match(MerLangParser.T__10)
            self.state = 226
            self.match(MerLangParser.T__11)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ArrayContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def value(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(MerLangParser.ValueContext)
            else:
                return self.getTypedRuleContext(MerLangParser.ValueContext,i)


        def getRuleIndex(self):
            return MerLangParser.RULE_array

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterArray" ):
                listener.enterArray(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitArray" ):
                listener.exitArray(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitArray" ):
                return visitor.visitArray(self)
            else:
                return visitor.visitChildren(self)




    def array(self):

        localctx = MerLangParser.ArrayContext(self, self._ctx, self.state)
        self.enterRule(localctx, 38, self.RULE_array)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 228
            self.match(MerLangParser.T__8)
            self.state = 230
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if (((_la) & ~0x3f) == 0 and ((1 << _la) & 10696049122345472) != 0):
                self.state = 229
                self.value()


            self.state = 236
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==13:
                self.state = 232
                self.match(MerLangParser.T__12)
                self.state = 233
                self.value()
                self.state = 238
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 239
            self.match(MerLangParser.T__9)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Array_opsContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def VARIABLE(self):
            return self.getToken(MerLangParser.VARIABLE, 0)

        def value(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(MerLangParser.ValueContext)
            else:
                return self.getTypedRuleContext(MerLangParser.ValueContext,i)


        def array_item(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(MerLangParser.Array_itemContext)
            else:
                return self.getTypedRuleContext(MerLangParser.Array_itemContext,i)


        def getRuleIndex(self):
            return MerLangParser.RULE_array_ops

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterArray_ops" ):
                listener.enterArray_ops(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitArray_ops" ):
                listener.exitArray_ops(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitArray_ops" ):
                return visitor.visitArray_ops(self)
            else:
                return visitor.visitChildren(self)




    def array_ops(self):

        localctx = MerLangParser.Array_opsContext(self, self._ctx, self.state)
        self.enterRule(localctx, 40, self.RULE_array_ops)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 241
            self.match(MerLangParser.VARIABLE)
            self.state = 242
            self.match(MerLangParser.T__10)
            self.state = 243
            _la = self._input.LA(1)
            if not(_la==14 or _la==15):
                self._errHandler.recoverInline(self)
            else:
                self._errHandler.reportMatch(self)
                self.consume()
            self.state = 244
            self.match(MerLangParser.T__2)
            self.state = 247 
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while True:
                self.state = 247
                self._errHandler.sync(self)
                la_ = self._interp.adaptivePredict(self._input,25,self._ctx)
                if la_ == 1:
                    self.state = 245
                    self.value()
                    pass

                elif la_ == 2:
                    self.state = 246
                    self.array_item()
                    pass


                self.state = 249 
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if not ((((_la) & ~0x3f) == 0 and ((1 << _la) & 10696049122345472) != 0)):
                    break

            self.state = 251
            self.match(MerLangParser.T__3)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class Array_concatContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def value(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(MerLangParser.ValueContext)
            else:
                return self.getTypedRuleContext(MerLangParser.ValueContext,i)


        def array_item(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(MerLangParser.Array_itemContext)
            else:
                return self.getTypedRuleContext(MerLangParser.Array_itemContext,i)


        def getRuleIndex(self):
            return MerLangParser.RULE_array_concat

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterArray_concat" ):
                listener.enterArray_concat(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitArray_concat" ):
                listener.exitArray_concat(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitArray_concat" ):
                return visitor.visitArray_concat(self)
            else:
                return visitor.visitChildren(self)




    def array_concat(self):

        localctx = MerLangParser.Array_concatContext(self, self._ctx, self.state)
        self.enterRule(localctx, 42, self.RULE_array_concat)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 253
            self.value()
            self.state = 254
            self.match(MerLangParser.T__10)
            self.state = 255
            self.match(MerLangParser.T__15)
            self.state = 256
            self.match(MerLangParser.T__2)
            self.state = 259
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,27,self._ctx)
            if la_ == 1:
                self.state = 257
                self.value()
                pass

            elif la_ == 2:
                self.state = 258
                self.array_item()
                pass


            self.state = 268
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==13:
                self.state = 261
                self.match(MerLangParser.T__12)
                self.state = 264
                self._errHandler.sync(self)
                la_ = self._interp.adaptivePredict(self._input,28,self._ctx)
                if la_ == 1:
                    self.state = 262
                    self.value()
                    pass

                elif la_ == 2:
                    self.state = 263
                    self.array_item()
                    pass


                self.state = 270
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 271
            self.match(MerLangParser.T__3)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class PrintContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def PRINT(self):
            return self.getToken(MerLangParser.PRINT, 0)

        def value(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(MerLangParser.ValueContext)
            else:
                return self.getTypedRuleContext(MerLangParser.ValueContext,i)


        def TEXT(self):
            return self.getToken(MerLangParser.TEXT, 0)

        def assignment(self):
            return self.getTypedRuleContext(MerLangParser.AssignmentContext,0)


        def expression(self):
            return self.getTypedRuleContext(MerLangParser.ExpressionContext,0)


        def array(self):
            return self.getTypedRuleContext(MerLangParser.ArrayContext,0)


        def array_item(self):
            return self.getTypedRuleContext(MerLangParser.Array_itemContext,0)


        def array_length(self):
            return self.getTypedRuleContext(MerLangParser.Array_lengthContext,0)


        def getRuleIndex(self):
            return MerLangParser.RULE_print

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterPrint" ):
                listener.enterPrint(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitPrint" ):
                listener.exitPrint(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitPrint" ):
                return visitor.visitPrint(self)
            else:
                return visitor.visitChildren(self)




    def print_(self):

        localctx = MerLangParser.PrintContext(self, self._ctx, self.state)
        self.enterRule(localctx, 44, self.RULE_print)
        self._la = 0 # Token type
        try:
            self.state = 325
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,32,self._ctx)
            if la_ == 1:
                self.enterOuterAlt(localctx, 1)
                self.state = 273
                self.match(MerLangParser.PRINT)
                self.state = 274
                self.match(MerLangParser.T__2)
                self.state = 275
                self.value()
                self.state = 280
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                while _la==13:
                    self.state = 276
                    self.match(MerLangParser.T__12)
                    self.state = 277
                    self.value()
                    self.state = 282
                    self._errHandler.sync(self)
                    _la = self._input.LA(1)

                self.state = 283
                self.match(MerLangParser.T__3)
                pass

            elif la_ == 2:
                self.enterOuterAlt(localctx, 2)
                self.state = 285
                self.match(MerLangParser.PRINT)
                self.state = 286
                self.match(MerLangParser.T__2)
                self.state = 287
                self.match(MerLangParser.TEXT)
                self.state = 292
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                while _la==13:
                    self.state = 288
                    self.match(MerLangParser.T__12)
                    self.state = 289
                    self.value()
                    self.state = 294
                    self._errHandler.sync(self)
                    _la = self._input.LA(1)

                self.state = 295
                self.match(MerLangParser.T__3)
                pass

            elif la_ == 3:
                self.enterOuterAlt(localctx, 3)
                self.state = 296
                self.match(MerLangParser.PRINT)
                self.state = 297
                self.match(MerLangParser.T__2)
                self.state = 298
                self.match(MerLangParser.TEXT)
                self.state = 299
                self.match(MerLangParser.T__3)
                pass

            elif la_ == 4:
                self.enterOuterAlt(localctx, 4)
                self.state = 300
                self.match(MerLangParser.PRINT)
                self.state = 301
                self.match(MerLangParser.T__2)
                self.state = 302
                self.assignment()
                self.state = 303
                self.match(MerLangParser.T__3)
                pass

            elif la_ == 5:
                self.enterOuterAlt(localctx, 5)
                self.state = 305
                self.match(MerLangParser.PRINT)
                self.state = 306
                self.match(MerLangParser.T__2)
                self.state = 307
                self.expression()
                self.state = 308
                self.match(MerLangParser.T__3)
                pass

            elif la_ == 6:
                self.enterOuterAlt(localctx, 6)
                self.state = 310
                self.match(MerLangParser.PRINT)
                self.state = 311
                self.match(MerLangParser.T__2)
                self.state = 312
                self.array()
                self.state = 313
                self.match(MerLangParser.T__3)
                pass

            elif la_ == 7:
                self.enterOuterAlt(localctx, 7)
                self.state = 315
                self.match(MerLangParser.PRINT)
                self.state = 316
                self.match(MerLangParser.T__2)
                self.state = 317
                self.array_item()
                self.state = 318
                self.match(MerLangParser.T__3)
                pass

            elif la_ == 8:
                self.enterOuterAlt(localctx, 8)
                self.state = 320
                self.match(MerLangParser.PRINT)
                self.state = 321
                self.match(MerLangParser.T__2)
                self.state = 322
                self.array_length()
                self.state = 323
                self.match(MerLangParser.T__3)
                pass


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class While_loopContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def WHILE(self):
            return self.getToken(MerLangParser.WHILE, 0)

        def condition(self):
            return self.getTypedRuleContext(MerLangParser.ConditionContext,0)


        def NEWLINE(self, i:int=None):
            if i is None:
                return self.getTokens(MerLangParser.NEWLINE)
            else:
                return self.getToken(MerLangParser.NEWLINE, i)

        def BREAK(self):
            return self.getToken(MerLangParser.BREAK, 0)

        def line(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(MerLangParser.LineContext)
            else:
                return self.getTypedRuleContext(MerLangParser.LineContext,i)


        def getRuleIndex(self):
            return MerLangParser.RULE_while_loop

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterWhile_loop" ):
                listener.enterWhile_loop(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitWhile_loop" ):
                listener.exitWhile_loop(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitWhile_loop" ):
                return visitor.visitWhile_loop(self)
            else:
                return visitor.visitChildren(self)




    def while_loop(self):

        localctx = MerLangParser.While_loopContext(self, self._ctx, self.state)
        self.enterRule(localctx, 46, self.RULE_while_loop)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 327
            self.match(MerLangParser.WHILE)
            self.state = 328
            self.match(MerLangParser.T__2)
            self.state = 329
            self.condition()
            self.state = 330
            self.match(MerLangParser.T__3)
            self.state = 331
            self.match(MerLangParser.T__4)
            self.state = 335
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==52:
                self.state = 332
                self.match(MerLangParser.NEWLINE)
                self.state = 337
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 345
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [9, 20, 21, 22, 26, 27, 28, 32, 40, 49, 50, 53]:
                self.state = 339 
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                while True:
                    self.state = 338
                    self.line()
                    self.state = 341 
                    self._errHandler.sync(self)
                    _la = self._input.LA(1)
                    if not ((((_la) & ~0x3f) == 0 and ((1 << _la) & 10697153398702592) != 0)):
                        break

                pass
            elif token in [42]:
                self.state = 343
                self.match(MerLangParser.BREAK)
                self.state = 344
                self.match(MerLangParser.NEWLINE)
                pass
            else:
                raise NoViableAltException(self)

            self.state = 347
            self.match(MerLangParser.T__5)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class For_loopContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def FOR(self):
            return self.getToken(MerLangParser.FOR, 0)

        def assignment(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(MerLangParser.AssignmentContext)
            else:
                return self.getTypedRuleContext(MerLangParser.AssignmentContext,i)


        def condition(self):
            return self.getTypedRuleContext(MerLangParser.ConditionContext,0)


        def NEWLINE(self, i:int=None):
            if i is None:
                return self.getTokens(MerLangParser.NEWLINE)
            else:
                return self.getToken(MerLangParser.NEWLINE, i)

        def line(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(MerLangParser.LineContext)
            else:
                return self.getTypedRuleContext(MerLangParser.LineContext,i)


        def getRuleIndex(self):
            return MerLangParser.RULE_for_loop

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterFor_loop" ):
                listener.enterFor_loop(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitFor_loop" ):
                listener.exitFor_loop(self)

        def accept(self, visitor:ParseTreeVisitor):
            if hasattr( visitor, "visitFor_loop" ):
                return visitor.visitFor_loop(self)
            else:
                return visitor.visitChildren(self)




    def for_loop(self):

        localctx = MerLangParser.For_loopContext(self, self._ctx, self.state)
        self.enterRule(localctx, 48, self.RULE_for_loop)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 349
            self.match(MerLangParser.FOR)
            self.state = 350
            self.match(MerLangParser.T__2)
            self.state = 351
            self.assignment()
            self.state = 352
            self.match(MerLangParser.T__0)
            self.state = 353
            self.condition()
            self.state = 354
            self.match(MerLangParser.T__0)
            self.state = 355
            self.assignment()
            self.state = 356
            self.match(MerLangParser.T__3)
            self.state = 357
            self.match(MerLangParser.T__4)
            self.state = 361
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==52:
                self.state = 358
                self.match(MerLangParser.NEWLINE)
                self.state = 363
                self._errHandler.sync(self)
                _la = self._input.LA(1)

            self.state = 365 
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while True:
                self.state = 364
                self.line()
                self.state = 367 
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if not ((((_la) & ~0x3f) == 0 and ((1 << _la) & 10697153398702592) != 0)):
                    break

            self.state = 369
            self.match(MerLangParser.T__5)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx





