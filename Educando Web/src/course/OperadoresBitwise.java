package course;

import java.util.Scanner;

public class OperadoresBitwise {

	public static void main(String[] args) {
		
		int n1 = 89;
		int n2 = 60;
		System.out.println(n1 & n2);
		System.out.println(n1 | n2);
		System.out.println(n1 ^ n2);
		
		System.out.println("--------------------");
		
		Scanner sc = new Scanner(System.in);
		// 89 e depois //113
		int mask = 0b100000;
		int n = sc.nextInt();
		if ((n & mask) != 0) {
		System.out.println("6th bit is true!");
		}
		else {
		System.out.println("6th bit is false");
		}
		
		sc.close();
	}

}
