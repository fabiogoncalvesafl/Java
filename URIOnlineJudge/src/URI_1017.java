import java.util.Locale;
import java.util.Scanner;

public class URI_1017 {

	public static void main(String[] args) {
			
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int horas, velocidade;
		horas = sc.nextInt();
		velocidade = sc.nextInt();
		
		double litros = (double) horas * velocidade / 12;
		System.out.printf("%.3f%n", litros);
		
		sc.close();
	}

}
