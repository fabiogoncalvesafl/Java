package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		
		Account acc = new Account(1001, "Alex", 0.0);
		BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);

		//UPCASTIG
		
		Account acc1 = bacc;
		Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.00);
		Account acc3 = new SavingsAccount(1004, "Anna", 0.0, 0.01);
		
		//DOWNCASTING
		
		BusinessAccount acc4 = (BusinessAccount)acc2;
		acc4.loan(100.00);
		
		//BusinessAccount acc5 = (BusinessAccount)acc3; //Exception class entities.SavingsAccount cannot be cast to class entities.BusinessAccoun
		
		if(acc3 instanceof BusinessAccount) {
			BusinessAccount acc5 = (BusinessAccount)acc3;
			acc5.loan(200.00);
			System.out.println("Loan!");
		}
		
		if(acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount)acc3;
			acc5.updateBalance();
			System.out.println("Update!");
		}
		
		//Testando sem o override
		Account acc6 = new Account(1005, "Fabio", 1000.0);
		acc6.withdraw(200.0);
		System.out.println(acc6.getBalance());
		
		//Testando com o override
		Account acc7 = new SavingsAccount(1006, "Lúcia", 1000.0, 0.01);
		acc7.withdraw(200.0);
		System.out.println(acc7.getBalance());
		
		Account acc8 = new BusinessAccount(1007, "Pequeno", 1000.0, 500.0);
		acc8.withdraw(200.0);
		System.out.println(acc8.getBalance());
	}

}
