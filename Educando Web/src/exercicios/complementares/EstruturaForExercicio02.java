package exercicios.complementares;

import java.util.Scanner;

public class EstruturaForExercicio02 {

	public static void main(String[] args) {
		// URI 1072
		// Resposta: https://github.com/acenelio/nivelamento-java/blob/master/src/uri1072.java
		// 5 | 14 123 10 -25 32
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt(); // Quantidade de valores

		int in = 0;
		int out = 0;

		for (int i = 0; i < n; i++) {
			int x = sc.nextInt();
			if (x >= 10 && x <= 20) {
				in = in + 1;
			} else {
				out = out + 1;
			}
		}

		System.out.println(in + " in");
		System.out.println(out + " out");

		sc.close();
	}

}
