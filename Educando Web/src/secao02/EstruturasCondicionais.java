package secao02;

import java.util.Scanner;

public class EstruturasCondicionais {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		// Demonstração 1
		System.out.println("Enter an integer number:");
		int n = sc.nextInt();
		
		if(n % 2 == 0) {
			System.out.println("Even!");
		}
		else {
			System.out.println("Odd!");
		}
		System.out.println("------------------------------");
		// Demonstração 2
		System.out.println("What time is it?");
		int time = sc.nextInt();
		
		if(time < 12) {
			System.out.println("Good morning!");
		}
		else if(time < 18) {
			System.out.println("Good afternoon!");
		}
		else {
			System.out.println("Good evening!");
		}
				
		sc.close();
	}

}
