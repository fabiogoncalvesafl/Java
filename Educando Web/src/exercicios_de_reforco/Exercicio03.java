package exercicios_de_reforco;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		/*
		 * Fazer um programa para ler dois números inteiros
		 * e mostrar a soma de todos os números ímpares entre eles,
		 * inclusive eles próprios.
		 * -10 2 | 14 3
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two integer numbers:");
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		int begin = x, end = y;
		
		if(y < x) {
			begin = y;
			end = x;
		}
		int sum = 0;
		for(int i = begin; i <= end; i++) {
			if(i % 2!= 0) {
				sum += i;
			}
		}
		System.out.println("Sum of odd numbers = " + sum);
		
		sc.close();
	}

}
