package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class EstruturaSequencialExercicio05 {

	public static void main(String[] args) {
		
		/*
		 * Fazer um programa para ler o código de uma peça 1,
		 * o número de peças 1, o valor unitário de cada peça 1,
		 * o código de uma peça 2, o número de peças 2
		 * e o valor unitário de cada peça 2. 
		 * Calcule e mostre o valor a ser pago.
		 * 
		 * Resposta: https://github.com/acenelio/nivelamento-java/blob/master/src/uri1010.java
		 */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int codPeca1 = sc.nextInt();
		int numePeca1 = sc.nextInt();
		double valorUnitarioPeca1 = sc.nextDouble();
		
		int codPeca2 = sc.nextInt();
		int numePeca2 = sc.nextInt();
		double valorUnitarioPeca2 = sc.nextDouble();
		
		double valorPago = (numePeca1 * valorUnitarioPeca1) + (numePeca2 * valorUnitarioPeca2);
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", valorPago);
		sc.close();
	}

}
