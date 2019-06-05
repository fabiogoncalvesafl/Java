package exercicios_complementares;

import java.util.Scanner;

public class EstruturaForExercicio05 {

	public static void main(String[] args) {
		// URI 1153
		// Resposta: https://github.com/acenelio/nivelamento-java/blob/master/src/uri1153.java
		// 4 | 1 | 5 | 0
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		
		int fat = 1;
		for (int i=1; i<=n; i++) {
			fat = fat * i;
		}
		
		System.out.println(fat);
		
		sc.close();
	}

}
