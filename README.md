<div align="center">

# Trabalho Final Compiladores 🖥️
Implementação de um **processador de código** usando *ANTLR* em ***Python***.


[![MER](https://img.shields.io/badge/MERLANG-.mer-orange.svg?logo=data:image/jpeg;base64,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&logoColor=f5f5f5&style=for-the-badge)]()

</div>

---

## Funcionamento ⚙️

- Para compilar a *Merlang* você precisa dos seguintes comandos:
```
python3 merlang.py seu_codigo.mer
```


## Sintaxe 🛠️
A *Merlang* tem as seguintes estruturas de comando:
- Declaração de **função**:
```
function function_name(arguments){
//code block
}
```

- Declaração de **tipos**:
```
int number = 5;
string text = "texto";
```

- Comandos de **entrada/saída**:
```
x = scan();
print(x);
```

- Estruturas de **decisão**:
```
if(condition){
//code
} else {
//code
}
```

- Estruturas de **repetição**:
```
while(condition){
//code
}
```


## Exemplo ***</>***
```
function checkPalindromo(input) {

    int str_len = input.length;

    int i = 0;

    while (i < str_len / 2) {
        if (input[i] != input[str_len - 1 - i]) {
            return 'nao e um palindromo';
        }
        i++;
    }

    return 'e um palindromo';
}

string str = "subinoonibus";

string value = checkPalindromo(str);

print(str, value);

print("abcdef", checkPalindromo("abcdef"));
```

## Conclusão 📄
Com a Linguagem ***Merlang*** é possível desenvolver programas em uma linguagem de programação customizada com estruturas básicas de controle. A ***Merlang*** permite compilar esses programas e gerar código executável.

#
