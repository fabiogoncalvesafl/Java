# Java

Layout apropriado para projetos Java
- Window / Perspective / Open Perspective / Other / Selecione Java
- Window / Show View / Console

Dicas de alto completar o código Java no Eclipse

sysout Ctrl + Barra de espaço = System.out.println();

Dica de auto completar comandos e variaveis

Após digitar algum comando ou variavel basta presionar

Crtl + Barra de Espaço

que vai completar o comando ou variavel

Identação automática do código
- CTRL + SHIFT + F

Executar o Programa
- CTRL + F11

Retornar um espaço do código
- Selecione o trecho do códico que quer retornar e pressione
- SHIFT + Tab

Importar bibliotecas no projeto sem ter sido declarado 

Ctrl + Shift + o

Criar um projeto Java
- File / New / Java Project

Padronização de Nome

Pacote = inicia com minúscula = course
Classe = Pascal Case = Program

Entry Point = Ponto de Entrada = public static void main(String[] args){}

Tipos Primitivos
- Padrão para long: sufixo "L"
- Padrão para float: sufixo "f"
- Padrão para char: aspas simples
- Padrão para string: aspas duplas

Valores Padrão

Quando criamos um array ou um objeto com os seguintes atributos, esses são os valores padrão inicialmente.

- byte = 0
- short = 0
- int = 0
- long = 0L
- float = 0.0f
- double = 0.0d
- char = '\u0000'
- String = null
- Object = null
- boolean = false

Restrição e Convenções para Nomes

Restrições para Nomes de variáveis

- não pode começar com dígito (use uma letra ou _)
- não usar acentos e til
- não pode deixar espaço em branco entre as letras ou palavras
- sugestão: use nomes que tem significados

Convenções

Camel Case: lastName
- pacotes
- atributos
- métodos
- variáveis e parâmetros

Pascal Case: ProductService
- classes

String e Object
- String: Uma cadeia de caracteres Unicode IMUTÁVEL (segurança, simplicidade, thread safe)
- Object: Um objeto genérico (toda classe em Java é subclasse de object) exemplos: getClass, equals, hashCode, toString

Dicas de Saída (printf)

%.2f = pega duas casas depois da virgula (, ou .)
%.4f = pega quatro casas depois da virgula (, ou .)
%s = pega a String declarada
%d = pega o inteiro declarado
%c = pega o char declarado
%n = quebra de linha no Java
\n = quebra de linha no C

Exemplo

char gender = 'F';
int age = 32;
double balance = 10.35784;
String name = "Maria";

System.out.printf("%.2f%n", balance); 
System.out.printf("%.4f%n", balance); 
System.out.printf("%s is %d years old, gender %c, and got balance = %.2f bitcoins%n", name, age,gender, balance);

Resposta no console

10,36
10,3578
Maria is 32 years old, gender F, and got balance = 10,36 bitcoins

Como utilizar o ponto em vez da virgula para as casas decimais

import java.util.Locale;
Locale.setDefault(Locale.US);

Exemplo
import java.util.Locale;

public static void main(String[] args){

   double balance = 10.35784;

   Locale.setDefault(Locale.US);
   System.out.printf("%.4f%n", balance); 
}
Resposta no console
10.36

Limpeza de stream de entrada (flush)

Antes de fazer um nextLine()
• Se antes foi dada uma quebra de linha na stream de entrada sem o nextLine()
• Então é preciso fazer um nextLine() extra para "limpar" a quebra de linha que
fica pendente na stream

int n1 = sc.nextInt();
sc.nextLine();

Operadores Lógicos

! -> negação (Inverte a a condição)
&& -> E (Quando as duas condições são verdadeiras) 
|| -> OU (Quando pelo menos uma condição é verdadeira)
 
- Precedência: ! (Negação) -> && (E)-> || (OU)
- Pode-se usar parêntesis à vontade
         Ex: 2 > 3 && 4 != 5 Resultado: true
         Ex: !(2>3) || 4 != 5 Resultado: true

Operadores Bitwise

Normalmente utilizados para programação de baixo nivel.
Geralmente é um micro controlador, programação com interface de rede e arduino.

& => Operação "E" bit a bit
| => Operação "OU" bit a bit
^ => Operação "OU-exclusivo" bit a bit

Estruturas Condicionais

if-else (se-senão)

- Simples
  
if (condição){
    comando 
}

- Composta

if (condição){
    comando 1
}
else {
    comando 2
}

- Encadeamentos

if (condição){
    comando 1
}
else if (condição){
    comando 2
}
else {
comando 3
}
