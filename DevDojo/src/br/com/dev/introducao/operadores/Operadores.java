package br.com.dev.introducao.operadores;
public class Operadores{
	/*
	* ! nega��o
	* 0 Cast
	* % resto da divis�o
	*/
	
	public static void main(String[] args){
		
		int numero1 = 10;
		int numero2 = 20;
		
		System.out.println(numero1+numero2);
		//Vai concatenar tudo e n�o vai somar
		System.out.println("O resultado da soma �: "+ numero1 + numero2);
		// Colocando entre parentese vai dar certo
		System.out.println("O resultado da soma �: "+ (numero1 + numero2));
		System.out.println("O resultado da subtra��o �: "+ (numero1 - numero2));
		System.out.println("O resultado da multiplica��o �: "+ (numero1 * numero2));
		System.out.println("O resultado da divis�o �: "+ (numero1 / numero2));
		System.out.println("O resto da divis�o entre 21 por 2 �: "+(21%2));
		System.out.println("O resto da divis�o entre 20 por 2 �: "+(20%2));
	}
}
