package application;

import entities.Account;
import entities.SavingsAccount;

public class Program2 {

	public static void main(String[] args) {

		/*
		 * Polimorfismo:
		 * Em Programação Orientada a Objetos, polimorfismo é recurso que
		 * permite que variáveis de um mesmo tipo mais genérico possam
		 * apontar para objetos de tipos específicos diferentes, tendo assim
		 * comportamentos diferentes conforme cada tipo específico.
		 */
		Account x = new Account(1020, "Alex", 1000.0);
		Account y = new SavingsAccount(1023, "Maria", 1000.0, 0.01);
		
		x.withdraw(50.0);
		y.withdraw(50.0);
		
		System.out.println(x.getBalance());
		System.out.println(y.getBalance());

	}

}
