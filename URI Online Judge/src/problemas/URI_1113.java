package problemas;

import java.util.Scanner;

public class URI_1113 {

	public static void main(String[] args) {
		//5 7 | 9 3 | 2 2
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		while(x != y) {
			if(x < y) {
				System.out.println("Crescente");
			}
			else {
				System.out.println("Decrescente");
			}
			x = sc.nextInt();
			y = sc.nextInt();
		}
		
		sc.close();
	}

}
