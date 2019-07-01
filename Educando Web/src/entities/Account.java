package entities;

public class Account {
	
	private String holder;
	private int number;
	private double balance;
	private double tax = 5.00;
	// Construtores
	public Account() {
		
	}
	public Account(String holder, int number, double balance) {
		this.holder = holder;
		this.number = number;
		this.balance = balance;
	}

	public Account(String holder, int number) {
		super();
		this.holder = holder;
		this.number = number;
	}
	// Getters e Setters
	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public int getNumber() {
		return number;
	}

	public double getBalance() {
		return balance;
	}
	// Metodos
	public void addBalance(double balance) {
		this.balance += balance;
	}

	public void removeBalance(double balance) {
		this.balance = this.balance - tax - balance;
	}
	
	public String toString() {
		return "Account " 
				+ number 
				+ ", Holder: " 
				+ holder
				+ String.format(", Balance: $ %.2f%n", balance);
		}

}
