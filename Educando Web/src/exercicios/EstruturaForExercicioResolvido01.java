package exercicios;

import java.util.Scanner;

public class EstruturaForExercicioResolvido01 {

	public static void main(String[] args) {
		//URI 1078
		/*
		 * Leia 1 valor inteiro N (2 < N < 1000).
		 * A seguir, mostre a tabuada de N:
		 * 140
		 */
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i = 1; i <= 10; i++) {
			int produto = i * n;
			System.out.println(i + " x " + n + " = " + produto);
		}
		
		sc.close();
	}

}
