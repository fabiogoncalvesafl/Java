package exercicios.complementares;

import java.util.Scanner;

public class EstruturaForExercicio06 {

	public static void main(String[] args) {
		// URI 1157
		// Resposta: https://github.com/acenelio/nivelamento-java/blob/master/src/uri1157.java 
		// 6
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			if (n % i == 0) {
				System.out.println(i);
			}
		}
		
		sc.close();
	}

}
