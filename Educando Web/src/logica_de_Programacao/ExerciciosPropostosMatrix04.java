package logica_de_Programacao;

import java.util.Scanner;

public class ExerciciosPropostosMatrix04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[][] matrix = new int[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}
		
		int soma = 0;
		for (int i=0; i<n; i++) {
			for (int j=i+1; j<n; j++) { // j inicia com i+1
				soma = soma + matrix[i][j];
			}
		}
		System.out.println(soma);
		
		sc.close();
	}

}
