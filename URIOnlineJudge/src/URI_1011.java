import java.util.Locale;
import java.util.Scanner;

public class URI_1011 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double raio = sc.nextDouble();
		double pi = 3.14159;
		double volume = (4/3.0) * pi *(raio * raio * raio);
		Locale.setDefault(Locale.US);
		System.out.printf("VOLUME = %.3f%n", volume);
		
		sc.close();
	}

}