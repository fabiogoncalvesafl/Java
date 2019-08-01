package exercicios.reforco;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		/*
		 * O curso de Computação Gráfica do IFTM é trimestral, sendo que as notas do ano
		 * são divididas em três partes: 30, 35 e 35, totalizando 100 pontos no ano. O
		 * professor de programação está querendo automatizar o processo de fechamento
		 * de notas. Faça um programa para somar as notas dos três trimestres de todos
		 * alunos da turma. 3 | 20.00 31.00 30.00 | 25.00 31.10 30.22 | 19.25 29.00
		 * 18.31
		 */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of students: ");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			System.out.print("Student #" + i + ": ");
			double score1 = sc.nextDouble();
			double score2 = sc.nextDouble();
			double score3 = sc.nextDouble();
			double finalScore = score1 + score2 + score3;
			System.out.printf("Final score: %.2f%n", finalScore);
		}
		
		sc.close();
	}

}
