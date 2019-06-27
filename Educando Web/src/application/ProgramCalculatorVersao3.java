package application;

import java.util.Locale;
import java.util.Scanner;

import util.CalculatorVersao3;

// Versão 3: classe CalculatorVersao3 com método estático

public class ProgramCalculatorVersao3 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter radius: ");
		
		System.out.print("Enter radius: ");
		double radius = sc.nextDouble();
		double c = CalculatorVersao3.circumference(radius);
		double v = CalculatorVersao3.volume(radius);
		System.out.printf("Circumference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI value: %.2f%n", CalculatorVersao3.PI);
		
		sc.close();
	}

}
