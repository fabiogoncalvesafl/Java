package secao02;

import java.util.Scanner;

public class SintaxeAlternativaSwitchCase {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// Utilizando estrutura if-else
		System.out.println("Estrutura If-Else");
		int x = sc.nextInt();

		String day;
		if (x == 1) {
			day = "Sunday";
		} else if (x == 2) {
			day = "Monday";
		} else if (x == 3) {
			day = "Tuesday";
		} else if (x == 4) {
			day = "Wednesday";
		} else if (x == 5) {
			day = "Thursday";
		} else if (x == 6) {
			day = "Friday";
		} else if (x == 7) {
			day = "Saturday";
		} else {
			day = "Invalid value";
		}
		System.out.println("Day: " + day);
		System.out.println("----------------------------------");
		System.out.println("Estrutura Switch-Case");
		// Utilizando estrutura switch-case
		int y = sc.nextInt();
		
		String dia;
		switch (y) {
		case 1:
			dia = "Sunday";
			break;
		case 2:
			dia = "Monday";
			break;
		case 3:
			dia = "Tuesday";
			break;
		case 4:
			dia = "Wednesday";
			break;
		case 5:
			dia = "Thursday";
			break;
		case 6:
			dia = "Friday";
			break;
		case 7:
			dia = "Saturday";
			break;
		default:
			dia = "Invalid value";
		}
		System.out.println("Dia: " + dia);
		
		
		sc.close();
	}

}
