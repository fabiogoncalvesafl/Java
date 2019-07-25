package secao05;

import java.util.Scanner;

public class ExercicioResolvidoMatrix {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[][] mat = new int[n][n];
		//Read
		for(int i=0; i < mat.length; i++) {
			for(int j=0; j < mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		//Diagonal 0-0; 1-1; 2-2
		System.out.println("Main diagonal:");
		for(int i=0; i < mat.length; i++) {
			System.out.print(mat[i][i] + " ");
		}
		//Negative numbers
		int count = 0;
		for(int i = 0; i < mat.length; i++) {
			for(int j = 0; j < mat[i].length; j++) {
				if(mat[i][j] < 0){
					count ++;
				}	
			}
		}
		System.out.println();
		System.out.println("Negative numbers = " + count);
		
		sc.close();
	}
}
