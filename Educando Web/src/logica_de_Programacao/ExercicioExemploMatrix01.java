package logica_de_Programacao;

import java.util.Scanner;

public class ExercicioExemploMatrix01 {
	
	/* Entrada: 
	 * 2 3
	 * 6 3 10
	 * 8 12 5
	 */ 
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt();
		int N = sc.nextInt();
		int[][] mat = new int[M][N];
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}
		sc.close();
	}

}
