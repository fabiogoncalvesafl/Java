import java.util.Locale;
import java.util.Scanner;

public class URI_1043 {

	public static void main(String[] args){
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double a, b, c, perimetro, areaTrapezio;
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		
		if(a + b > c && b + c > a && a + c > b){
			perimetro = a + b + c;
			System.out.printf("Perimetro = %.1f%n", perimetro);
		}
		else{
			areaTrapezio = ((a + b)* c) / 2.0;
			System.out.printf("Area = %.1f%n", areaTrapezio);
		}
				
		sc.close();
	}
}