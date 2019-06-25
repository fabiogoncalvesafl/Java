package logica_de_Programacao;

import java.util.Scanner;

public class ExerciciosPropostosMatrix03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[][] matrix = new int[n][n];
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}
		
		for(int i=0; i<n; i++) {
			int maior = matrix[i][0];
			for(int j=0; j<n; j++) {
				if(matrix[i][j] > maior) {
					maior = matrix[i][j];
				}
			}
			System.out.println(maior);
		}
		
		sc.close();
	}

}
