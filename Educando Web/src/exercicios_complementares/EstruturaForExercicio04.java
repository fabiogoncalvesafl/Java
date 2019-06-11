package exercicios_complementares;

import java.util.Scanner;

public class EstruturaForExercicio04 {

	public static void main(String[] args) {
		// URI 1116
		//Resposta: https://github.com/acenelio/nivelamento-java/blob/master/src/uri1116.java
		// 3 | 3 -2 | -8 0 | 0 8
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		
		for (int i=0; i<n; i++) {
			
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			if (y == 0) {
				System.out.println("divisao impossivel");
			}
			else {
				double div = (double) x / y;
				System.out.printf("%.1f%n", div);
			}
		}
		
		sc.close();
		
	}

}
