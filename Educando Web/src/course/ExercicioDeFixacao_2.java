package course;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioDeFixacao_2 {

	public static void main(String[] args) {
		// Enter your full name:
		// Alex Green
		// How many bedrooms are there in your house?
		// 3
		// Enter product price:
		// 500.50
		// Enter your last name, age and height (same line):
		// Green 21 1.73
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your full name:");
		String fullName = sc.nextLine(); // Alex Green
		System.out.println("How many bedrooms are there in your house?");
		int bedrooms = sc.nextInt(); // 3
		System.out.println("Enter product price:");
		double price = sc.nextDouble(); // 500.50
		System.out.println("Enter your last name, age and height (same line):");
		String lastName = sc.next(); // Green 21 1.73
		int age = sc.nextInt();
		double height = sc.nextDouble();
		
		System.out.println("------------------------");
		System.out.println(fullName);
		System.out.println(bedrooms);
		System.out.println(price);
		System.out.println(lastName);
		System.out.println(age);
		System.out.println(height);
		
		sc.close();
	}
}
