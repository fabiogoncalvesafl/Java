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
		System.out.println("O resultado de 10 > 20 é: "+ dezMaiorQueVinte);
		System.out.println("O resultado de 10 < 20 é: "+ dezMenorVinte);
		System.out.println("O resultado de 5 == 5 é: "+(5 == 5));
		System.out.println("O resultado de 5 != 5 é: "+(5 != 5));
	}
}
