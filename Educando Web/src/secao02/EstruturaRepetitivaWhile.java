package secao02;

import java.util.Scanner;

public class EstruturaRepetitivaWhile {

	public static void main(String[] args) {

		/*
		 * Digitar um número e mostrar sua raiz quadrada com três casas decimais, depois
		 * repetir o procedimento. Quando o usuário digitar um número negativo (podendo
		 * inclusive ser na primeira vez), mostrar uma mensagem "Negative number" e
		 * terminar o programa. 25 | 10 | 9 | -4
		 */
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number: ");
		double n = sc.nextDouble();

		while (n >= 0.0) {
			double sr = Math.sqrt(n);
			System.out.printf("%.3f%n", sr);
			System.out.print("Enter another number: ");
			n = sc.nextDouble();
		}
		System.out.println("Negative number");

		sc.close();
	}

}
