package secao_02;

import java.util.Locale;
import java.util.Scanner;

public class EstruturaRepetitivaDoWhile {

	public static void main(String[] args) {
		/*
		 * Digitar um número e mostrar sua raiz quadrada, depois perguntar ao
		 * usuário se ele deseja repetir o procedimento (y/n). Caso ele responda
		 * 'y', repetir o procedimento.
		 * 9 | y | 10 | n
		 */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		char resp;
		do {
			System.out.print("Enter a number: ");
			double n = sc.nextDouble();
			double sq = Math.sqrt(n);
			System.out.printf("Square root = %.3f%n", sq);
			System.out.print("Repeat (y/n)? ");
			resp = sc.next().charAt(0);
		} while (resp != 'n');
		sc.close();
	}

}
