package br.com.dev.introducao;
public class ImprimindoVariaveisII{
	public static void main(String[] args){
		
		int idade = 36;
		double salarioDouble = 3000;
		float salarioFloat = 3000;
		byte idadeByte = 12;
		short idadeShort = 32767;
		boolean verdadeiro = true;
		boolean falso = false;
		long numeroGrande = 1000L;
		char caractere = 'A'; //2 bytes
		char caractereDois = '\u0041'; //tabela unicode
		char caracteretres = 82;
		String nome = "Fabio"; 
		
		
		System.out.println(idade);
		System.out.println(salarioDouble);
		System.out.println(salarioFloat);
		System.out.println(idadeByte);
		System.out.println(idadeShort);
		System.out.println(verdadeiro);
		System.out.println(falso);
		System.out.println(numeroGrande);
		System.out.println(caractere);
		System.out.println(caractereDois);
		System.out.println(caracteretres);
		System.out.println(nome);
	}
}