package br.com.dev.introducao.exercicios;
public class Exercicio02{
	/**
	* Criar um algoritmo que possua as variaveis nome,
	* salario, sexo(M e F), idade, estado civil 
	*
	* Imprima da seguinte forma: 
	*
	* O trabalhador(a) <nome> do sexo <sexo>, idade <idade>, 
	* estado civil <estado civil> e salario <salario> encontra-se
	* empregado neste estabelecimento.
	*/
	
	public static void main(String[] args){
		
		String nome = "Bruce Wayne";
		char sexo = 'M';
		byte idade = 36;
		int salario = 4500;
		String estadoCivil = "Alone";
		
		System.out.println();
		System.out.println("O trabalhador(a) "+nome+" do sexo "+sexo+", idade "+idade+" anos,");
		System.out.println("estado civil "+estadoCivil+" e salario "+salario+" encontra-se");
		System.out.println("empregado neste estabelecimento.");
	}
}