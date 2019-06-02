package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class EstruturaCondicionalExercicio06 {

	public static void main(String[] args) {

		/*
		 * Você deve fazer um programa que leia um valor qualquer e apresente 
		 * uma mensagem dizendo em qual dos seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) 
		 * este valor se encontra. Obviamente se o valor não estiver em nenhum destes intervalos, 
		 * deverá ser impressa a mensagem “Fora de intervalo”.
		 * 25.01 | 25.00 | 100.00 | -25.02
		 * Resposta: https://github.com/acenelio/nivelamento-java/blob/master/src/uri1037.java
		 */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double valor = sc.nextDouble();
		
		if(valor >= 0.0 && valor <= 25.0) {
			System.out.println("Intervalo [0,25]");			
		}
		else if(valor > 25.0 && valor <= 50.0){
			System.out.println("Intervalo (25,50]");	
		}
		else if(valor >50.0 && valor <=75) {
			System.out.println("Intervalo (50,75]");
		}
		else if(valor > 75.0 && valor <= 100.0) {
			System.out.println("Intervalo (75,100]");
		}
		else {
			System.out.println("Fora de intervalo");
		}
		
		sc.close();
	}

}
