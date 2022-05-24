package funcoesInteressenteString;

public class Exemplo2 {

	public static void main(String[] args) {

		String s = "potato apple lemon";
		
		String[] vect = s.split(" ");
		
		String word1 = vect[0];
		String word2 = vect[1];
		String word3 = vect[2];
		
		System.out.println(vect[0]);
		System.out.println(vect[1]);
		System.out.println(vect[2]);
		System.out.println();
		System.out.println(word1);
		System.out.println(word2);
		System.out.println(word3);
	}

}
