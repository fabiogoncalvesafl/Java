package secao02;

public class OperadoresLogicos {
	
	public static void main(String[] args) {
		
		/*
		 * ! -> negação
		 * && -> E (Quando as duas condições são verdadeiras) 
		 * || -> OU (Quando pelo menos uma condição é verdadeira)
		 * 
		 * Precedência: ! -> && -> ||
		 * Pode-se usar parêntesis à vontade
		 * Ex: 2 > 3 && 4 != 5 Resultado: true
		 * Ex: !(2>3) || 4 != 5 Resultado: true 
		 */
		
		boolean c1 = 2 > 3 || 4 != 5;
		boolean c2 = !(2 > 3) && 4 != 5;
		
		System.out.println(c1);
		System.out.println(c2);
		
		System.out.println("--------------");
		
		boolean c3 = 10 < 5;
		boolean c4 = c1 || c2 && c3;
		
		System.out.println(c4);
	}

}
