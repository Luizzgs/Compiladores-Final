import sys
from antlr4 import *
from grammar.MerLangListener import MerLangListener
from grammar.MerLangParser import MerLangParser
from grammar.MerLangLexer import MerLangLexer
from MerLangCodeListener import MerLangCodeListener


def main(argv):
    input = FileStream(argv[1], encoding='utf-8')
    lexer = MerLangLexer(input)
    stream = CommonTokenStream(lexer)
    parser = MerLangParser(stream)
    tree = parser.program()

    with open("output.py","w") as output:
        MerlangListen = MerLangCodeListener(output)
        walker = ParseTreeWalker()
        walker.walk(MerlangListen, tree)
        
    output.close()      

if __name__ == '__main__':
    main(sys.argv)