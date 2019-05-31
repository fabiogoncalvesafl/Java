package course;

import java.util.Scanner;

public class EstruturaCondicionalExercicio05 {

	public static void main(String[] args) {
		
		/*
		 * Com base na tabela abaixo, escreva um programa que leia 
		 * o código de um item e a quantidade deste item. 
		 * A seguir, calcule e mostre o valor da conta a pagar.
		 * 3 2 | 2 3
		 * Resposta: https://github.com/acenelio/nivelamento-java/blob/master/src/uri1038.java
		 */
		Scanner sc = new Scanner(System.in);
		
		int codigo = sc.nextInt();
		int quantidade = sc.nextInt();
		double valor;
		
		if(codigo == 1) {
			valor = quantidade * 4.00;
			System.out.printf("Total: R$ %.2f%n", valor);
		}
		else if(codigo == 2) {
			valor = quantidade * 4.50;
			System.out.printf("Total: R$ %.2f%n", valor);
		}else if(codigo == 3) {
			valor = quantidade * 5.00;
			System.out.printf("Total: R$ %.2f%n", valor);
		}else if(codigo == 4) {
			valor = quantidade * 2.00;
			System.out.printf("Total: R$ %.2f%n", valor);
		}else if(codigo == 5) {
			valor = quantidade * 1.50;
			System.out.printf("Total: R$ %.2f%n", valor);
		}else {
			System.out.println("Codigo Invalido");
		}
		
		sc.close();
	}

}
