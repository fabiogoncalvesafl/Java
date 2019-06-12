import java.util.Locale;
import java.util.Scanner;

public class URI_1014 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int totalPercorrido;
		double totalGasto, consumoMedio;
		
		totalPercorrido = sc.nextInt();
		totalGasto = sc.nextDouble();
		
		consumoMedio = totalPercorrido / totalGasto;
		System.out.printf("%.3f km/l%n", consumoMedio);
		
		sc.close();
	}

}
