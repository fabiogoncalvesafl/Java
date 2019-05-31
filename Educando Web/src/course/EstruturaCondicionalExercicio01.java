package course;

import java.util.Scanner;

public class EstruturaCondicionalExercicio01 {

	public static void main(String[] args) {
		
		/*
		 * Fazer um programa para ler um número inteiro, 
		 * e depois dizer se este número é negativo ou não.
		 * -10 | 8 | 0
		 * Resposta: Correção: https://github.com/acenelio/nivelamento-java/blob/master/src/cond01.java
		 */
		Scanner sc = new Scanner(System.in);
		int numero = sc.nextInt();
		
		if(numero >= 0) {
			System.out.println("NAO NEGATIVO");
		}
		else {
			System.out.println("NEGATIVO");
		}
		
		sc.close();
	}

}
