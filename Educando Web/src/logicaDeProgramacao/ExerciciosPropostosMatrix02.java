package logicaDeProgramacao;

import java.util.Scanner;

public class ExerciciosPropostosMatrix02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[][] matrix = new int[n][n];
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}
		int[] vetor = new int[n];
		// i = linha | j = coluna
		for(int i=0; i<n; i++) {
			int soma = 0;
			for(int j=0; j<n; j++) {
				soma = soma + matrix[i][j];
			}
			vetor[i] = soma;
			System.out.println(vetor[i]);
		}
		
		sc.close();
	}

}
