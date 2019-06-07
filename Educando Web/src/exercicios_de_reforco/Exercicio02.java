package exercicios_de_reforco;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		/*
		 * Fazer um programa para ler a quantidade
		 * de glicose no sangue de uma pessoa e depois
		 * mostrar na tela a classificação desta glicose de
		 * acordo com a tabela de referência ao lado.
		 * 90.0 | 140.0 | 143.2
		 */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter glucose measure: ");
		double glucose = sc.nextDouble();
		
		if(glucose <= 100.0) {
			System.out.println("Normal");
		}
		else if(glucose <= 140.0) {
			System.out.println("High");
		}
		else {
			System.out.println("Diabetes");
		}
		
		sc.close();
	}

}
