package br.com.dev.introducao.operadores;
public class OperadoresDeComparacao{
	
	/**
	* < menor que
	* > maior que
	* <= menor igual
	* >= maior igual
	* == igualdade
	* != diferente
	*/	
	
	public static void main(String[] args){
		
		boolean dezMaiorQueVinte = 10 > 20;
		boolean dezMenorVinte = 10 < 20;
		
		System.out.println();
		System.out.println("O resultado de 10 > 20 �: "+ dezMaiorQueVinte);
		System.out.println("O resultado de 10 < 20 �: "+ dezMenorVinte);
		System.out.println("O resultado de 5 == 5 �: "+(5 == 5));
		System.out.println("O resultado de 5 != 5 �: "+(5 != 5));
	}
}
