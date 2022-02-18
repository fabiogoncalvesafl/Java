package application;

import java.util.Locale;
import java.util.Scanner;

import util.CalculatorV2;

public class ProgramV3 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter radius: ");
		double radius = sc.nextDouble();
		double c = CalculatorV2.circumference(radius);
		double v = CalculatorV2.volume(radius);
		System.out.printf("Circumference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI value: %.2f%n", CalculatorV2.PI);

		sc.close();
	}

}
