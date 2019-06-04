package exercicios;

import java.util.Scanner;

public class EstruturaForExercicio01 {

	public static void main(String[] args) {
		// URI 1067
		// Resposta: https://github.com/acenelio/nivelamento-java/blob/master/src/uri1067.java
		// 8
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		for (int i=1; i<=x; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}
		
		sc.close();
	}

}
