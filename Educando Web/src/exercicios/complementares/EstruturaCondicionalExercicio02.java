package exercicios.complementares;

import java.util.Scanner;

public class EstruturaCondicionalExercicio02 {

	public static void main(String[] args) {
		
		/*
		 * Fazer um programa para ler um número inteiro 
		 * e dizer se este número é par ou ímpar.
		 * 12 | -27 | 0
		 * Resposta: Correção: https://github.com/acenelio/nivelamento-java/blob/master/src/cond02.java
		 */
		Scanner sc = new Scanner(System.in);
		
		int numero = sc.nextInt();
		
		if(numero % 2 == 0) {
			System.out.println("PAR");
		}
		else {
			System.out.println("IMPAR");
		}
		
		sc.close();
	}

}
