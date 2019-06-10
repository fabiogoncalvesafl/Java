import java.util.Locale;
import java.util.Scanner;

public class URI_1005 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double a, b, media;
		a = sc.nextDouble();
		b = sc.nextDouble();
		media = (a * 3.5 + b * 7.5)/11.0;
		System.out.printf("MEDIA = %.5f%n", media);
		
		sc.close();
	}

}