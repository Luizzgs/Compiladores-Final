from antlr4 import FileStream, CommonTokenStream
from grammar.LangLexer import LangLexer
from grammar.LangParser import LangParser

def main():
    # Substitua com o caminho real para seu código-fonte
    codigo_fonte_path = "cod.txt"

    # Carregue o código-fonte da linguagem
    lexer = LangLexer(FileStream(codigo_fonte_path, encoding="utf8"))
    tokens = CommonTokenStream(lexer)

    # Crie o parser
    parser = LangParser(tokens)
    
    # Execute o parser na regra inicial
    tree = parser.start_()

    # Exiba a árvore de análise (opcional)
    print(tree)


if __name__ == '__main__':
    main()