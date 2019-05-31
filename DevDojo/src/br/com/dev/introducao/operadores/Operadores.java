package br.com.dev.introducao.operadores;
public class Operadores{
	/*
	* ! negação
	* 0 Cast
	* % resto da divisão
	*/
	
	public static void main(String[] args){
		
		int numero1 = 10;
		int numero2 = 20;
		
		System.out.println(numero1+numero2);
		//Vai concatenar tudo e não vai somar
		System.out.println("O resultado da soma é: "+ numero1 + numero2);
		// Colocando entre parentese vai dar certo
		System.out.println("O resultado da soma é: "+ (numero1 + numero2));
		System.out.println("O resultado da subtração é: "+ (numero1 - numero2));
		System.out.println("O resultado da multiplicação é: "+ (numero1 * numero2));
		System.out.println("O resultado da divisão é: "+ (numero1 / numero2));
		System.out.println("O resto da divisão entre 21 por 2 é: "+(21%2));
		System.out.println("O resto da divisão entre 20 por 2 é: "+(20%2));
	}
}
