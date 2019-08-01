package exercicios.fixacao;

import java.util.Scanner;

public class ExercicioDeFixacao_4 {

	public static void main(String[] args) {
		/*
		 * Fazer um programa para ler um número N (se for digitado um valor não
		 * positivo, mostrar uma mensagem e ler novamente). Em seguida, N valores
		 * inteiros. Mostrar o maior dentre os N números digitados. Veja exemplo: 0 | -2
		 * | 4 | 5 4 10 2
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter N: ");
		int n = sc.nextInt();
		while (n <= 0) {
			System.out.print("N must be positive! Try again: ");
			n = sc.nextInt();
		}
		int higher = Integer.MIN_VALUE;
		for (int i = 1; i <= n; i++) {
			System.out.print("Value #" + i + ": ");
			int x = sc.nextInt();
			if (x > higher) {
				higher = x;
			}
		}
		System.out.println("Higher = " + higher);
		sc.close();
	}

}
