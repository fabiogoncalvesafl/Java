import java.util.Locale;
import java.util.Scanner;

public class URI_1009 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		String funcionario;
		double salarioFixo, totalVendas, total;

		funcionario = sc.nextLine();
		salarioFixo = sc.nextDouble();
		totalVendas = sc.nextDouble();
		total = salarioFixo + totalVendas * 0.15;

		System.out.printf("TOTAL = R$ %.2f%n", total);

		sc.close();
	}

}