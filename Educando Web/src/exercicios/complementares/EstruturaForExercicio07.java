package exercicios.complementares;

import java.util.Scanner;

public class EstruturaForExercicio07 {

	public static void main(String[] args) {
		// URI 1143
		// Resposta: https://github.com/acenelio/nivelamento-java/blob/master/src/uri1143.java
		// 5
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {

			int primeiro = i;
			int segundo = i * i;
			int terceiro = i * i * i;
			System.out.printf("%d %d %d%n", primeiro, segundo, terceiro);
		}
		
		sc.close();
	}

}
