# Dicas Eclipse

### Layout apropriado para projetos Java
- Window / Perspective / Open Perspective / Other / Selecione Java
- Window / Show View / Console

### Zerar o layout no Eclipse

- Window -> Perspective -> Reset Perspective

### Alterar Tema para Dark

- Window -> Preferences -> General -> Appearance -> Theme: selecione Dark

### Mudar o tamanho da fonte no Eclipse
- CTRL +
- CTRL -

### Dicas de alto completar o código Java no Eclipse

- sysout Ctrl + Barra de espaço = System.out.println();

### Dica de auto completar comandos e variáveis
 
Após digitar algum comando ou variável basta pressionar

- Crtl + Barra de Espaço

que vai completar o comando ou variável

### Edentação automática do código
- CTRL + SHIFT + F

### Executar o Programa
- CTRL + F11

### Retornar um espaço do código

Selecione o trecho do código que quer retornar e pressione

- SHIFT + Tab

### Importar bibliotecas no projeto sem ter sido declarada
 
- Ctrl + Shift + o

### Criar um projeto Java

- File / New / Java Project

### Debugging com Eclipse
 
- CTRL+SHIFT+B - marcar/desmarcar breakpoint

- iniciar/continuar o debug
  - F6 - executar um passo (pula função)
  - F5 - executar um passo (entra na função)
  - F7 - sair do método em execução
- parar debug
- Perspectiva Debug
- Aba importante: Variables

### Gerando automaticamente construtores, getters e setters com Eclipse

Dentro da Classe clique:

- Botão direito -> Source -> Generate Constructor using Fields
- Botão direito -> Source -> Generate Getters and Setters

# Java - Convenções e Dicas

- Entry Point = Ponto de Entrada = public static void main(String[] args){}

### Tipos Primitivos
- Padrão para long: sufixo "L"
- Padrão para float: sufixo "f"
- Padrão para char: aspas simples
- Padrão para string: aspas duplas

### Valores Padrão

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

### Restrição e Convenções para Nomes

#### Restrições para Nomes de variáveis

- não pode começar com dígito (use uma letra ou _)
- não usar acentos e til
- não pode deixar espaço em branco entre as letras ou palavras
- sugestão: use nomes que tem significados

### Convenções

#### Camel Case: lastName
- pacotes
- atributos
- métodos
- variáveis e parâmetros

#### Pascal Case: ProductService
- classes

#### Constantes: 
- Nomes em Maiúsculo e se for composto deverá ser separado com _ 
- Constantes (PI) ou (NET_SALARY)
- Declaração: public static final double PI = 3.14159; => onde o final indica que é uma constante.

#### String e Object
- String: Uma cadeia de caracteres Unicode IMUTÁVEL (segurança, simplicidade, thread safe)
- Object: Um objeto genérico (toda classe em Java é subclasse de object) exemplos: getClass, equals, hashCode, toString

### Dicas de Saída (printf)

    %.2f = pega duas casas depois da virgula (, ou .)
    %.4f = pega quatro casas depois da virgula (, ou .)
    %s = pega a String declarada
    %d = pega o inteiro declarado
    %c = pega o char declarado
    %n = quebra de linha no Java
    \n = quebra de linha no C

#### Exemplo

    char gender = 'F';
    int age = 32;
    double balance = 10.35784;
    String name = "Maria";

    System.out.printf("%.2f%n", balance); 
    System.out.printf("%.4f%n", balance); 
    System.out.printf("%s is %d years old, gender %c, and got balance = %.2f bitcoins%n", name, age,gender, balance);

#### Resposta no console

    10,36
    10,3578
    Maria is 32 years old, gender F, and got balance = 10,36 bitcoins

### Como utilizar o ponto em vez da virgula para as casas decimais

    import java.util.Locale;
    Locale.setDefault(Locale.US);

#### Exemplo
    import java.util.Locale;

    public static void main(String[] args){

       double balance = 10.35784;

       Locale.setDefault(Locale.US);
       System.out.printf("%.4f%n", balance); 
    }
#### Resposta no console
10.36

### Para ler um texto ATÉ A QUEBRA DE LINHA

s1 = sc.nextLine();

### Limpeza de stream de entrada (flush)

Antes de fazer um nextLine()
- Se antes foi dada uma quebra de linha na stream de entrada sem o nextLine()
- Então é preciso fazer um nextLine() extra para "limpar" a quebra de linha que
fica pendente na stream

    int n1 = sc.nextInt();
    sc.nextLine();

### Algumas funções matemáticas em Java

- sqrt – raiz quadrada
    A = Math.sqrt(x); \\Variável A recebe a raiz quadrada de x
- pow – potenciação
    A = Math.pow(x, y); \\ Variável A recebe o resultado de x elevado a y
- abs – valor absoluto
    A = Math.abs(x); \\ Variável A recebe o valor absoluto de x

### Operadores Lógicos

    ! negação (Inverte a a condição)
    && E (Quando as duas condições são verdadeiras) 
    || OU (Quando pelo menos uma condição é verdadeira)
 
- Precedência: ! (Negação) -> && (E)-> || (OU)
- Pode-se usar parêntesis à vontade
         Ex: 2 > 3 && 4 != 5 Resultado: true
         Ex: !(2>3) || 4 != 5 Resultado: true

### Operadores Bitwise

- Normalmente utilizados para programação de baixo nivel.
- Geralmente é um micro controlador, programação com interface de rede e arduino.

    & => Operação "E" bit a bit
    | => Operação "OU" bit a bit
    ^ => Operação "OU-exclusivo" bit a bit

### Operadores de Atribuição Cumulativa

    a += b;  => a = a + b;
    a -= b; => a = a - b;
    a *= b; => a = a * b;
    a /= b; => a = a / b;
    a %= b; => a = a % b;

### Estruturas Condicionais

    if-else (se-senão)

    Simples
    REGRA:
    V: executa o bloco de comandos
    F: pula o bloco de comandos
  
    if (condição){
        comando 
    }

    Composta
    REGRA:
    V: executa somente o bloco do if
    F: executa somente o bloco do else

    if (condição){
        comando 1
    }
    else {
        comando 2
    }

    Encadeamentos

    if (condição){
        comando 1
    }
    else if (condição){
        comando 2
    }
    else {
        comando 3
    }

### Funções interessantes para String

- Formatar: toLowerCase(), toUpperCase(), trim()
- Recortar: substring(inicio), substring(inicio, fim)
- Substituir: Replace(char, char), Replace(string, string)
- Buscar: IndexOf, LastIndexOf
- str.Split(" ")

### Manipular char

    char caracter = sc.next().charAt(0);

### Operação split

    String s = "potato apple lemon";
    String[] vect = s.split(" ");
    String word1 = vect[0];
    String word2 = vect[1];
    String word3 = vect[2];

### switch-case

- Estrutura opcional a vários if-else encadeados, quando a condição envolve o teste do valor de uma variável.

#### Sintaxe:
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

### Expressão condicional ternária

- Estrutura opcional ao if-else quando se deseja decidir um VALOR com base em uma condição.

- Sintaxe:
    ( condição ) ? valor_se_verdadeiro : valor_se_falso
    Exemplos:
    ( 2 > 4 ) ? 50 : 80 
    ( 10 != 3 ) ? "Maria" : "Alex"
    80
    "Maria"

### Escopo e inicialização

- Escopo de uma variável: é a região do programa onde a variável é válida, ou seja, onde ela pode ser referenciada.
- Uma variável não pode ser usada se não for iniciada.

### Funções

- Representam um processamento que possui um significado
   Math.sqrt(double)
   System.out.println(string)
- Principais vantagens: modularização, delegação e reaproveitamento
- Dados de entrada e saída
   Funções podem receber dados de entrada (parâmetros ou argumentos)
   Funções podem ou não retornar uma saída
- Em orientação a objetos, funções em classes recebem o nome de "métodos"

- public static void nome_da_funcao (parametro)

- public => fica disponivel para outras classes.
- static => pode ser chamada independente de ter sido criado um objeto.
- void => executa uma ação e não retorna um valor (void = vazio).

#### Exemplo:

    public static void showResult(int value){
        System.out.println("Higher = " + value)
    }

### Estrutura repetitiva while

- É uma estrutura de controle que repete um bloco de comandos enquanto uma condição for verdadeira.
- Quando usar: quando não se sabe previamente a quantidade de repetições que será realizada.

    Estrutura "enquanto"
    Regra: 
    V: executa e volta
    F: pula fora

    while ( condição ) {
       comando 1
       comando 2
    }

### Estrutura repetitiva for ("para")

É uma estrutura de controle que repete um bloco de comandos para um certo intervalo de valores.
Quando usar: quando se sabe previamente a quantidade de repetições, ou o intervalo de valores.
    
    for ( início ; condição ; incremento) {
        comando 1
        comando 2
    }

### Estrutura repetitiva "faça-enquanto"

- Menos utilizada, mas em alguns casos se encaixa melhor ao problema.
- O bloco de comandos executa pelo menos uma vez, pois a condição é verificada no final.

    Regra:
    V: volta
    F: pula fora

- Sintaxe / regra

    do {
        comando 1
        comando 2
    } while ( condição );

### Vetores

- Um vetor corresponde a uma coleção de dados de tamanho fixo, indexada, unidimensional e homogênea

- Indexada: os elementos são acessados por meio de índices
- Unidimensional: uma dimensão
- Homogênea: todos dados são do mesmo tipo

### Vetores são também chamados de arranjos unidimensionais ( em inglês arranjos é array)

- Em Java a primeira posição e um vetor é a posição 0
- Um arranjo deve ser alocado previamente, antes de ser utilizado.
- Uma vez alocado, sua quantidade de elementos é fixa.

- Declaração: double[] B;
- Instanciação: B = new double[5];
- Acesso: B[3] = 20;

#### Exemplo de declaração e instanciação na mesma linha:

    double[] b = new double[5];

    Regra de 3 (como montar)

    int n = sc.nextInt();
    int[] idades = new int[n];

    for (int i = 0; i < n; i++) {
         idades[i] = sc.nextInt();
    }

    int cont = 0;
    for (int i = 0; i < n; i++) {
        if (idades[i] < 16) {
            cont = cont + 1;
        }
    }

    double x = (double) cont * 100 / n;

#### Sintaxe opcional: "para cada"

    int N = sc.nextInt();
    String[] nomes = new String[N];

    for (int i=0; i<N; i++) {
         nomes[i] = sc.next();
    }
    System.out.println("Nomes lidos:");

    for (String s : nomes) {
         System.out.println(s);
    }

### Utilizando length
#### Atribuindo um vetor da classe

- length = quantidade de elementos.
```Java
    int n = sc.nextInt();
    Vetores[] vect = new Vetores[n];

    for(int i=0; i<vect.length; i++) {
        sc.nextLine();
        String name = sc.nextLine();
        double price = sc.nextDouble();
        vect[i] = new Vetores(name, price); 
    }

### Matrizes

- Em programação, "matriz" é o nome dado a arranjos bidimensionais
  - Atenção: "vetor de vetores"

- Arranjo (array) é uma estrutura de dados:
  - Homogênea (dados do mesmo tipo)
  - Ordenada (elementos acessados por meio de posições)
  - Alocada de uma vez só, em um bloco contíguo de memória

- Vantagens:
  - Acesso imediato aos elementos pela sua posição

- Desvantagens:
  - Tamanho fixo
  - Dificuldade para se realizar inserções e deleções

#### Uma matriz corresponde a uma coleção de dados de tamanho fixo, indexada, bidimensional e homogênea

- Indexada: os elementos são acessados por meio de índices
- bidimensional: duas dimensões
- Homogênea: todos dados são do mesmo tipo

#### Matrizes são também chamadas de arranjos bidimensionais

- Em Java a primeira posição de uma matriz é a posição 0, 0 (linha 0, coluna 0)
- Um arranjo deve ser alocado previamente, antes de ser utilizado. Uma vez alocado, sua quantidade de elementos é fixa

#### Como criar uma matriz?

    declaração => double[][] A;
    instanciação => A = new double[3][4];

#### Exemplo de declaração e instanciação na mesma linha:

    double[][] A = new double[3][4];

#### Como acessar os elementos de uma matriz?

    A[1][2] = 10;

### Programação Orientada a Objetos com Java

#### Classes, atributos, métodos, membros estáticos

### Classe

- É um tipo estruturado que pode conter (membros):
  - Atributos (dados / campos)
  - Métodos (funções / operações)

- A classe também pode prover muitos outros recursos, tais como:
  - Construtores
  - Sobrecarga
  - Encapsulamento
  - Herança
  - Polimorfismo

- Exemplos:
  - Entidades: Produto, Cliente, Triangulo
  - Serviços: ProdutoService, ClienteService, EmailService, StorageService
  - Controladores: ProdutoController, ClienteController
  - Utilitários: Calculadora, Compactador
  - Outros (views, repositórios, gerenciadores, etc.)

### Classes, objetos, atributos

- Classe: é a definição do tipo
- Objetos: são instâncias da classe

    package course; \\ Pacote da Classe

    public class Triangle { \\ Nome da Classe
    
    public double a; \\ Atributos da Classe
    public double b; \\ Atributos da Classe
    public double c; \\ Atributos da Classe
    // Metodo
    public \\ O prefixo "public" indica que o atributo ou método pode ser usado em outros arquivos    
    double \\ Tipo do dado que o método retorna (se o método não retorna nada, usa-se a palavra "void")
    area \\ Nome do método
    () \\ Lista de parâmetros do método
    public double area() {  
        double p = (a + b + c) / 2.0;                                   
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
    

#### Observação: Quando os membros da classe não são estáticos, você é obrigado a instancia-los para poder utiliza-la.

#### Discussão

Quais são os benefícios de se calcular a área de um triângulo por meio de um MÉTODO dentro da CLASSE Triangle?

 - Reaproveitamento de código: nós eliminamos o código repetido (cálculo das áreas dos triângulos x e y) no programa principal.
 - Delegação de responsabilidades: quem deve ser responsável por saber como calcular a área de um triângulo é o próprio triângulo.
 - A lógica do cálculo da área não deve estar em outro lugar.

### Membros estáticos

#### membros = atributos e métodos

- Também chamados membros de classe
  - Em oposição a membros e instância

- São membros que fazem sentido independentemente de objetos.
  - Não precisam de objeto para serem chamados.
  - São chamados a partir do próprio nome da classe.

- Aplicações comuns:
  - Classes utilitárias => Math.sqrt(double)
  - Declaração de constantes 

- Uma classe que possui somente membros estáticos, pode ser uma classe estática também.
  - Esta classe não poderá ser instanciada.

- Constante
  - Declaração: 

    public static final double PI = 3.14159; => onde o final indica que é uma constante.

- Construtor
  - É uma operação especial da classe, que executa no momento da instanciação do objeto

- Usos comuns:
  - Iniciar valores dos atributos
  - Permitir ou obrigar que o objeto receba dados / dependências no momento de sua instanciação (injeção de dependência)

- Se um construtor customizado não for especificado, a classe disponibiliza o construtor padrão:
  
    Product p = new Product();

- É possível especificar mais de um construtor na mesma classe (sobrecarga)

### Por convenção  o construtor vem depois dos atributos
#### a palavra this faz referencia aos atributos 

    public String name;
    public double price;
    public int quantity;
    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
     
#### atribuição de variáveis (name, price e quantity) faz referencia aos paramentos do construtor

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

### Palavra this

- É uma referência para o próprio objeto
- Usos comuns:
  - Diferenciar atributos de variáveis locais
  - Passar o próprio objeto como argumento na chamada de um método ou construtor

### Sobrecarga

- É um recurso que uma classe possui de oferecer mais de uma operação com o mesmo nome,
porém com diferentes listas de parâmetros.

### Encapsulamento

- É um princípio que consiste em esconder detalhes de implementação de uma classe, expondo apenas
operações seguras e que mantenham os objetos em um estado consistente.
- Regra de ouro: o objeto deve sempre estar em um estado consistente, e a própria classe deve garantir isso.

#### Regra geral básica

- Um objeto NÃO deve expor nenhum atributo (modificador de acesso private)
- Os atributos devem ser acessados por meio de métodos get e set
- Padrão JavaBeans: https://en.wikipedia.org/wiki/JavaBeans     

Padrão para implementação de getters e setters

### Por convenção a declaração de getters e setters vem depois dos construtores

    private String name;
    private double price;
    public String getName() {
         return name;
    }
    public void setName(String name) {
         this.name = name;
    }
    public double getPrice() {
         return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

### Modificadores de acesso

- https://docs.oracle.com/javase/tutorial/java/javaOO/accesscontrol.html
- private: o membro só pode ser acessado na própria classe
- (nada): o membro só pode ser acessado nas classes do mesmo pacote
- protected: o membro só pode ser acessado no mesmo pacote, bem como em subclasses de pacotes diferentes
- public: o membro é acessado por todas classes (ao menos que ele resida em um módulo diferente que não exporte o pacote onde ele está)

### Tipos referência vs. tipos valor

- Classes são tipos referência
- Variáveis cujo tipo são classes não devem ser entendidas como caixas, mas sim
“tentáculos” (ponteiros) para caixas

### Tipos primitivos são tipos valor
- Em Java, tipos primitivos são tipos valor. Tipos valor são CAIXAS e não ponteiros.


#### Desalocação de memória - garbage collector e escopo local

### Garbage collector

- É um processo que automatiza o gerenciamento de memória de um programa em execução
- O garbage collector monitora os objetos alocados dinamicamente pelo programa (no heap),
desalocando aqueles que não estão mais sendo utilizados.

#### Resumo

- Objetos alocados dinamicamente, quando não possuem mais referência para eles,
serão desalocados pelo garbage collector.

- Variáveis locais são desalocadas imediatamente assim que seu escopo local sai de execução

### Boxing, unboxing e wrapper classes


### Laço "for each"
- Sintaxe opcional e simplificada para percorrer coleções

- Sintaxe:
    
    for (Tipo apelido : coleção) {
         <comando 1>
         <comando 2>
    }

- Leitura: "para cada objeto 'obj' contido em vect, faça:"

    String[] vect = new String[] {"Maria", "Bob", "Alex"};

    for (int i=0; i< vect.length; i++) {
         System.out.println(vect[i]);
    }

    for (String obj : vect) {
         System.out.println(obj);
    }

### Listas 

- Conceito de lista
- Tipo List - Declaração, instanciação
- Demo
- Referência: https://docs.oracle.com/javase/10/docs/api/java/util/List.html
- Assuntos pendentes:
  - interfaces
  - generics
  - predicados (lambda)

- Lista é uma estrutura de dados: 
  - Homogênea (dados do mesmo tipo)
  - Ordenada (elementos acessados por meio de posições)
  - Inicia vazia, e seus elementos são alocados sob demanda
  - Cada elemento ocupa um "nó" (ou nodo) da lista

- Tipo (interface): List
- Classes que implementam: ArrayList, LinkedList, etc.

- Vantagens:
  - Tamanho variável
  - Facilidade para se realizar inserções e deleções

- Desvantagens:
  - Acesso sequencial aos elementos *

- Tamanho da lista: size()
- Obter o elemento de uma posição: get(position)
- Inserir elemento na lista: add(obj), add(int, obj)
- Remover elementos da lista: remove(obj), remove(int), removeIf(Predicate)
- Encontrar posição de elemento: indexOf(obj), lastIndexOf(obj)
- Filtrar lista com base em predicado:
  - List<Integer> result = list.stream().filter(x -> x > 4).collect(Collectors.toList());
- Encontrar primeira ocorrência com base em predicado:
  - Integer result = list.stream().filter(x -> x > 4).findFirst().orElse(null);

- Assuntos pendentes:
  - interfaces
  - generics
  - predicados (lambda)

### Date

Representa um INSTANTE

#### Pacote java.util

- https://docs.oracle.com/javase/10/docs/api/java/util/Date.html

- Um objeto Date internamente armazena:
   - O número de milissegundos desde a meia noite do dia 1 de janeiro de 1970 GMT (UTC)
   - GMT: Greenwich Mean Time (time zone)
   - UTC: Coordinated Universal Time (time standard)

#### SimpleDateFormat

- https://docs.oracle.com/javase/10/docs/api/java/text/SimpleDateFormat.html

- Define formatos para conversão entre Date e String
  - dd/MM/yyyy -> 23/07/2018
  - dd/MM/yyyy HH:mm:ss -> 23/07/2018 15:42:07

#### Padrão ISO 8601 e classe Instant

- Formato: yyyy-MM-ddTHH:mm:ssZ
- Exemplo: "2018-06-25T15:42:07Z"
- Date y3 = Date.from(Instant.parse("2018-06-25T15:42:07Z"));

#### Demostração:

    SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
    SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));
    Date x1 = new Date();
    Date x2 = new Date(System.currentTimeMillis());
    Date x3 = new Date(0L);
    Date x4 = new Date(1000L * 60L * 60L * 5L);
    Date y1 = sdf1.parse("25/06/2018");
    Date y2 = sdf2.parse("25/06/2018 15:42:07");
    Date y3 = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
    System.out.println("x1: " + x1);
    System.out.println("x2: " + x2);
    System.out.println("x3: " + x3);
    System.out.println("x4: " + x4);
    System.out.println("y1: " + y1);
    System.out.println("y2: " + y2);
    System.out.println("y3: " + y3);
    System.out.println("-------------");
    System.out.println("x1: " + sdf2.format(x1));
    System.out.println("x2: " + sdf2.format(x2));
    System.out.println("x3: " + sdf2.format(x3));
    System.out.println("x4: " + sdf2.format(x4));
    System.out.println("y1: " + sdf2.format(y1));
    System.out.println("y2: " + sdf2.format(y2));
    System.out.println("y3: " + sdf2.format(y3));
    System.out.println("-------------");
    System.out.println("x1: " + sdf3.format(x1));
    System.out.println("x2: " + sdf3.format(x2));
    System.out.println("x3: " + sdf3.format(x3));
    System.out.println("x4: " + sdf3.format(x4));
    System.out.println("y1: " + sdf3.format(y1));
    System.out.println("y2: " + sdf3.format(y2));
    System.out.println("y3: " + sdf3.format(y3));

### Manipulando uma data com Calendar

#### Somando uma unidade de tempo

    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));

    System.out.println(sdf.format(d));

    Calendar cal = Calendar.getInstance();
    cal.setTime(d);
    cal.add(Calendar.HOUR_OF_DAY, 4);
    d = cal.getTime();

    System.out.println(sdf.format(d));

### Obtendo uma unidade de tempo

    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));

    System.out.println(sdf.format(d));

    Calendar cal = Calendar.getInstance();
    cal.setTime(d);
    int minutes = cal.get(Calendar.MINUTE);
    int month = 1 + cal.get(Calendar.MONTH);

    System.out.println("Minutes: " + minutes);
    System.out.println("Month: " + month);


