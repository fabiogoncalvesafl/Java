package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class ProgramAccount {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter account holder: ");
		String holder = sc.nextLine();
		System.out.print("Is there na initial deposit (y/n)? ");
		char caracter = sc.next().charAt(0);
		double balance = 0.0;

		if(caracter == 'y') {
			System.out.print("Enter initial deposit value: ");
			balance = sc.nextDouble();
			Account account = new Account(holder, number, balance);
			System.out.println();  
			System.out.println("Account data:");
			System.out.println(account);
		}
		else {
			
			Account account = new Account(holder, number);
			System.out.println();  
			System.out.println("Account data:");
			System.out.println(account);
		}
		
		Account account = new Account(holder, number, balance);
		System.out.print("Enter a deposit value: ");
		balance = sc.nextDouble();
		account.addBalance(balance);
		System.out.println("Updated account data:");
		System.out.println(account);
		System.out.println();
		
		System.out.print("Enter a withdraw value: ");
		balance = sc.nextDouble();
		account.removeBalance(balance);
		System.out.println("Updated account data:");
		System.out.println(account);
		
		sc.close();
	}

}
