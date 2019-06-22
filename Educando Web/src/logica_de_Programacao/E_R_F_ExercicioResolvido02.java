package logica_de_Programacao;

import java.util.Locale;
import java.util.Scanner;

public class E_R_F_ExercicioResolvido02 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		double[] vetor = new double[n];
		// armazena os reais no vetor i
		for(int i = 0; i < n; i++) {
			vetor[i] = sc.nextDouble();
		}
		// imprimi os reais declarados em i
		for(int i = 0; i < n; i++) {
			System.out.print(vetor[i] + " ");
		}
		System.out.println();
		// soma dos reais
		double soma = 0.0;
		for(int i = 0; i < n; i++) {
			soma = soma + vetor[i];
		}
		System.out.printf("%.2f%n", soma);
		// calculo da media por n
		double media = soma / n;
		System.out.printf("%.2f%n", media);
		
		sc.close();
	}

}
