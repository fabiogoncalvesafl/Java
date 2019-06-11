package exercicios_de_reforco;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		/*
		 * Leia números inteiros até que um 0 (zero) seja lido.
		 * Para cada valor lido, o programa deve mostrar 
		 * o quadrado do valor.
		 * 4 | 1 | 10 | 0
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter an integer value: ");
		int numero = sc.nextInt();
					
		while(numero != 0) {
			int square = numero * numero;
			System.out.println(square);
			System.out.print("Enter an integer value: ");
			numero = sc.nextInt();
		}
		sc.close();
	}

}
