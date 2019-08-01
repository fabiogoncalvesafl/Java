package exercicios.complementares;

import java.util.Locale;
import java.util.Scanner;

public class EstruturaSequencialExercicio02 {

	public static void main(String[] args) {
		/* Faça um programa para ler o valor do raio de um círculo, 
		 * e depois mostrar o valor da área deste círculo com quatro
		 * casas decimais conforme exemplos.
		 * Fórmula da área: area = π . raio 2
		 * Considere o valor de π = 3.14159
		 * Resposta: https://github.com/acenelio/nivelamento-java/blob/master/src/uri1002.java
		 */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double raio = sc.nextDouble();
		double pi = 3.14159;
		double area = pi * (raio * raio);
		
		System.out.printf("A = %.4f%n", area);
		
		sc.close();
	}
}
