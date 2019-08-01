package exercicios.reforco;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		/*
		 * Deseja-se fazer um programa para calcular a nota final de um estudante, considerando as
		 * três notas que ele tirou nos três trimestres de seu curso. Caso a nota final do estudante seja
		 * menor que 60.00, deve-se mostrar uma mensagem "FAILED" também.
		 * 22.00 30.10 25.50 | 15.00 20.00 20.00 
		 */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three student scores:");
		double nota1 = sc.nextDouble();
		double nota2 = sc.nextDouble();
		double nota3 = sc.nextDouble();
		double notaFinal = nota1 + nota2 + nota3;
		System.out.printf("Final score = %.2f%n", notaFinal);
		if(notaFinal < 60.00) {
			System.out.println("FAILED");
		}
		
		sc.close();
	}

}
