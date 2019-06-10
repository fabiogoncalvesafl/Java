import java.util.Scanner;

public class URI_1004 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int valor1, valor2, PROD;
		valor1 = sc.nextInt();
		valor2 = sc.nextInt();
		PROD = valor1 * valor2;
		System.out.println("PROD = " + PROD);
		
		sc.close();
	}

}