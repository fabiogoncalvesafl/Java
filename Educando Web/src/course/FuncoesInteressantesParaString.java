package course;

public class FuncoesInteressantesParaString {

	public static void main(String[] args) {

		String original = "abcde FGHIJ ABC abc DEFG    ";
		String s01 = original.toLowerCase(); // muda para minusculas
		String s02 = original.toUpperCase(); // muda para maisculas
		String s03 = original.trim(); // tira os espaços em branco
		String s04 = original.substring(2); // recorta a string da posição 2
		String s05 = original.substring(2, 9); //recorda a string de 2 até 9
		String s06 = original.replace('a', 'x'); // substitui a por x
		String s07 = original.replace("abc", "xy"); //substitiu abc por xy
		int i = original.indexOf("bc"); // informa o primeiro indice bc e armazena sua posição na variavel i 
		int j = original.lastIndexOf("bc"); // informa o ultimo indice bc e armazena sua posição na variavel j

		System.out.println("Original: -" + original + "-");
		System.out.println("toLowerCase: -" + s01 + "-");
		System.out.println("toUpperCase: -" + s02 + "-");
		System.out.println("trim: -" + s03 + "-");
		System.out.println("substring(2): -" + s04 + "-");
		System.out.println("substring(2, 9): -" + s05 + "-");
		System.out.println("replace('a', 'x'): -" + s06 + "-");
		System.out.println("replace('abc', 'xy'): -" + s07 + "-");
		System.out.println("Index of 'bc': " + i);
		System.out.println("Last index of 'bc': " + j);
		System.out.println("----------------------------------");
		String s = "potato apple lemon";
		String[] vect = s.split(" "); // recorta uma string e armazena em um vetor utilizando " " como separador
		String word1 = vect[0];
		String word2 = vect[1];
		String word3 = vect[2]; 
		System.out.println(s);
		System.out.println("-----------------------------------");
		System.out.println("vect[0] : " + vect[0]);
		System.out.println("vect[1] : " + vect[1]);
		System.out.println("vect[2] : " + vect[2]);
		System.out.println("-----------------------------------");
		System.out.println("word1 : " + word1);
		System.out.println("word2 : " + word2);
		System.out.println("word3 : " + word3);
	}

}
