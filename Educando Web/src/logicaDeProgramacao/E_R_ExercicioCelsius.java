package logicaDeProgramacao;

import java.util.Locale;
import java.util.Scanner;

public class E_R_ExercicioCelsius {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		char resposta;
		do {
			System.out.print("Digite a temperatura em Celsius: ");
			double celsius = sc.nextDouble();
			double fahrenheit = 9.0 * celsius / 5.0 + 32;
			System.out.printf("Equivalente em Fahrenheit: %.1f%n", fahrenheit);
			System.out.print("Deseja repetir (s/n)? ");
			resposta = sc.next().charAt(0);
		} while(resposta != 'n');
		
		sc.close();
	}

}
