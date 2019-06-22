package logica_de_Programacao;

import java.util.Locale;
import java.util.Scanner;

public class E_R_F_ExercicioResolvido03 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		String[] nomes = new String[n];
		int[] idades = new int[n];
		double[] alturas = new double[n];

		for (int i = 0; i < n; i++) {
			nomes[i] = sc.next();
			idades[i] = sc.nextInt();
			alturas[i] = sc.nextDouble();
		}

		double soma = 0.0;
		for (int i = 0; i < n; i++) {
			soma = soma + alturas[i];
		}

		double media = soma / n;
		System.out.printf("Altura média: %.2f%n", media);

		int cont = 0;
		for (int i = 0; i < n; i++) {
			if (idades[i] < 16) {
				cont = cont + 1;
			}
		}
		// regra de 3 para calcular a porcentagem de pessoas menores de 16 anos
		double x = (double) cont * 100.0 / n;
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", x);

		sc.close();
	}

}
