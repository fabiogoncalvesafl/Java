package br.com.dev.introducao.operadores;
public class OperadoresLogicos{
	/**
	* && -> AND (e)
	* || OR (ou)
	*/
	public static void main(String[] args){
		
		int idade = 18;
		float salario = 1000;
			
		System.out.println(idade >= 18 && salario >= 1000);
		System.out.println(idade >= 18 && salario >= 3000);
		System.out.println(idade >= 18 || salario >= 1000);
		System.out.println(idade >= 17 || salario >= 1000);
	}	
}
