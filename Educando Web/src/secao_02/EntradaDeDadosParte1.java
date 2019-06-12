package secao_02;

import java.util.Scanner;

public class EntradaDeDadosParte1 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String sentence = sc.nextLine();
		String x = sc.next();
		String y = sc.next();
		String z = sc.next();
		
		System.out.println("-----------------------");
		System.out.println(sentence); // Good morning!
		System.out.println(x); //Red
		System.out.println(y); // Green
		System.out.println(z); // Blue
		System.out.println("-----------------------");
		// Orange Yellow Grey
		x = sc.next(); 
		y = sc.next(); 
		z = sc.next(); 
		System.out.println("-----------------------");
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		
		sc.close();
	}

}
