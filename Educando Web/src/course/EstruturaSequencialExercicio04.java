package course;

import java.util.Locale;
import java.util.Scanner;

public class EstruturaSequencialExercicio04 {
	
	public static void main(String[] args) {
		/*
		 * Fazer um programa que leia o número de um funcionário, 
		 * seu número de horas trabalhadas, o valor que recebe por
		 * hora e calcula o salário desse funcionário. 
		 * A seguir, mostre o número e o salário do funcionário, 
		 * com duas casas decimais.
		 * Resposta: https://github.com/acenelio/nivelamento-java/blob/master/src/uri1008.java
		 */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int numero = sc.nextInt();
		int horasTrabalhadas = sc.nextInt();
		double valorHora = sc.nextDouble();
		double salario = valorHora * horasTrabalhadas;
		System.out.println("NUMBER = " + numero);
		System.out.printf("SALARY = U$ %.2f%n", salario);
		
		sc.close();
	}

}
