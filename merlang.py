import sys
from antlr4 import FileStream, CommonTokenStream, ParseTreeWalker
from grammar.MerLangParser import  MerLangParser
from grammar.MerLangLexer import MerLangLexer
from MerLangCodeListener import MerLangCodeListener
from io import StringIO

def main(argv):
    input = FileStream(argv[1])
    lexer = MerLangLexer(input)
    stream = CommonTokenStream(lexer)
    parser = MerLangParser(stream)
    tree = parser.program()

    global_locals = {}
    output_buffer = StringIO()

    MerlangListen = MerLangCodeListener(output_buffer)
    walker = ParseTreeWalker()
    walker.walk(MerlangListen, tree)

    
    python_code = output_buffer.getvalue()

    exec(python_code, global_locals, global_locals)

if __name__ == '__main__':
    main(sys.argv)
