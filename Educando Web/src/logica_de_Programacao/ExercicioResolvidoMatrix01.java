package logica_de_Programacao;

import java.util.Scanner;

public class ExercicioResolvidoMatrix01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[][] matrix = new int[n][n];
		
		for(int i=0; i < n; i++) {
			for(int j=0; j < n; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("DIAGONAL PRINCIPAL:");
		for(int i=0; i<n; i++) {
			System.out.print(matrix[i][i] + " ");
		}
		System.out.println();
		
		int contador = 0;
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(matrix[i][j] < 0) {
					contador = contador + 1;
				}
			}
		}
		System.out.println("QUANTIDADE DE NEGATIVOS = " + contador);
		
		sc.close();
	}

}
