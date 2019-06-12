package secao_02;

import java.util.Locale;
import java.util.Scanner;

public class EscopoEInicializacao {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double price = sc.nextDouble();
		/*
		 * if (price > 100.0) { double discount = price * 0.1; }
		 * System.out.println(discount);
		 */
		// Resolução para inicialização de uma variavel fora do escopo
		double discount;
		if (price > 100.0) {
			discount = price * 0.1;
		} else {
			discount = 0;
		}
		System.out.println(discount);
		
		sc.close();
	}

}
