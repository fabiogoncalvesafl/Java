import java.util.Locale;
import java.util.Scanner;

public class URI_1010 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int cod1, cod2, qtd1, qtd2; 
		double valorPeca1, valorPeca2, totalPagar;
		cod1 = sc.nextInt();
		qtd1 = sc.nextInt();
		valorPeca1 = sc.nextDouble();
		cod2 = sc.nextInt();
		qtd2 = sc.nextInt();
		valorPeca2 = sc.nextDouble();
		totalPagar = qtd1 * valorPeca1 + qtd2 * valorPeca2;
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", totalPagar);
		
		sc.close();
		
	}

}