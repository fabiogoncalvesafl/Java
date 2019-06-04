package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class EstruturaForExercicio03 {

	public static void main(String[] args) {
		//URI 1079
		//Resposta: https://github.com/acenelio/nivelamento-java/blob/master/src/uri1079.java
		// 3 | 6.5 4.3 6.2 | 5.1 4.2 8.1 | 8.0 9.0 10.0
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		
		for (int i=0; i<n; i++) {
			
			double a = sc.nextDouble();
			double b = sc.nextDouble();
			double c = sc.nextDouble();

			double media = (a * 2.0 + b * 3.0 + c * 5.0) / 10.0;

			System.out.printf("%.1f%n", media);
		}
		
		sc.close();
		
	}

}
