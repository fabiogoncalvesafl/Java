# Java - Dicas e Orientações

Layout apropriado para projetos Java
- Window / Perspective / Open Perspective / Other / Selecione Java
- Window / Show View / Console

Zerar o layout no Eclipse
- Window -> Perspective -> Reset Perspective

Mudar o tamanho da fonte no Eclipse
• CTRL +
• CTRL -

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

Para ler um texto ATÉ A QUEBRA DE LINHA

s1 = sc.nextLine();

Limpeza de stream de entrada (flush)

Antes de fazer um nextLine()
• Se antes foi dada uma quebra de linha na stream de entrada sem o nextLine()
• Então é preciso fazer um nextLine() extra para "limpar" a quebra de linha que
fica pendente na stream

int n1 = sc.nextInt();
sc.nextLine();

Algumas funções matemáticas em Java

• sqrt – raiz quadrada
A = Math.sqrt(x); => Variável A recebe a raiz quadrada de x
• pow – potenciação
A = Math.pow(x, y); => Variável A recebe o resultado de x elevado a y
• abs – valor absoluto
A = Math.abs(x); => Variável A recebe o valor absoluto de x

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

Operadores de Atribuição Cumulativa


a += b;  => a = a + b;
a -= b; => a = a - b;
a *= b; => a = a * b;
a /= b; => a = a / b;
a %= b; => a = a % b;

Estruturas Condicionais

if-else (se-senão)

- Simples
REGRA:
V: executa o bloco de comandos
F: pula o bloco de comandos
  
if (condição){
    comando 
}

- Composta
REGRA:
V: executa somente o bloco do if
F: executa somente o bloco do else

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

Funções interessantes para String

• Formatar: toLowerCase(), toUpperCase(), trim()
• Recortar: substring(inicio), substring(inicio, fim)
• Substituir: Replace(char, char), Replace(string, string)
• Buscar: IndexOf, LastIndexOf
• str.Split(" ")

Operação split

String s = "potato apple lemon";
String[] vect = s.split(" ");
String word1 = vect[0];
String word2 = vect[1];
String word3 = vect[2];

switch-case

Estrutura opcional a vários if-else encadeados, quando a condição envolve o teste do valor de uma variável.

Sintaxe:
var minhaVariavel = (...);
switch (minhaVariavel) {
case 1:
System.out.println("Caso 1");
break;
case 2:
System.out.println("Caso 2");
break;
default:
System.out.println("Caso padrão");
}

Expressão condicional ternária

Estrutura opcional ao if-else quando se deseja decidir um VALOR com base em uma condição.

Sintaxe:
( condição ) ? valor_se_verdadeiro : valor_se_falso
Exemplos:
( 2 > 4 ) ? 50 : 80 
( 10 != 3 ) ? "Maria" : "Alex"
80
"Maria"

Escopo e inicialização

• Escopo de uma variável: é a região do programa onde a variável é válida, ou seja, onde ela pode ser referenciada.
• Uma variável não pode ser usada se não for iniciada.

Funções

• Representam um processamento que possui um significado
   Math.sqrt(double)
   System.out.println(string)
• Principais vantagens: modularização, delegação e reaproveitamento
• Dados de entrada e saída
   Funções podem receber dados de entrada (parâmetros ou argumentos)
   Funções podem ou não retornar uma saída
• Em orientação a objetos, funções em classes recebem o nome de "métodos"

public static void nome_da_funcao (parametro)

public => fica disponivel para outras classes.
static => pode ser chamada independente de ter sido criado um objeto.
void => executa uma ação e não retorna um valor (void = vazio).

Exemplo:

public static void showResult(int value){
    System.out.println("Higher = " + value)
}

Debugging com Eclipse

• Teclas

CTRL+SHIFT+B - marcar/desmarcar breakpoint
- iniciar/continuar o debug
F6 - executar um passo (pula função)
F5 - executar um passo (entra na função)
F7 - sair do método em execução
- parar debug
• Perspectiva Debug
• Aba importante: Variables

Estrutura repetitiva while

É uma estrutura de controle que repete um bloco de comandos enquanto uma condição for verdadeira.
Quando usar: quando não se sabe previamente a quantidade de repetições que será realizada.

Estrutura "enquanto"
Regra: 
V: executa e volta
F: pula fora

while ( condição ) {
comando 1
comando 2
}

Estrutura repetitiva for ("para")
    
for ( início ; condição ; incremento) {
comando 1
comando 2
}

Reflexão: você vai dar preferência para estrutura for quando souber previamente a quantidade de repetições
