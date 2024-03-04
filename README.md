<div align="center">

# Trabalho Final Compiladores 🖥️
Implementação de um **processador de código** usando *ANTLR* em ***Python***.

[![MER](https://img.shields.io/badge/MERLANG-.mer-orange.svg?logo=Moodle&logoColor=f5f5f5&style=for-the-badge)]()

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



#
