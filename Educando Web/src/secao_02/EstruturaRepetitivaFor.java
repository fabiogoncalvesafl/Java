package secao_02;

import java.util.Scanner;

public class EstruturaRepetitivaFor {

	public static void main(String[] args) {

		/*
		 * Digitar um número N e depois N valores inteiros. 
		 * Mostrar a soma dos N valores digitados.
		 * 3 | 10 7 8  
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("How many integer numbers are you going to enter: ");
		int n = sc.nextInt();
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			System.out.print("Value #" + i + ": ");
			int x = sc.nextInt();
			sum += x;
		}
		System.out.println("Sum = " + sum);
		sc.close();
	}

}
