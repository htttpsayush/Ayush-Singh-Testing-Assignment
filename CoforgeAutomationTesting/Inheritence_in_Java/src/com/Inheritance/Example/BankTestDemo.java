package com.Inheritance.Example;

class Account{
	
	String accountHolder = "Johny Bravo";
	double balance = 10000;
	
	public void deposit(double amount) {
		
		balance = balance + amount;
		System.out.println("Amount Deposited : "+ amount);
	}
	
	public void withdraw(double amount) {
		
		balance = balance - amount;
		System.out.println("Amount Withdraw : "+ amount);
	}
	
	public void displayBalance() {
		
		System.out.println("CurrentBalance : "+ balance);
	}
	
}

class SavingsAccount extends Account {
	
	public void calculateInterest() {
		double interest = balance * 5 / 100;
		System.out.println("Interest Earned :" + interest);
	}
	
	
}


public class BankTestDemo.java{
	
	public static void main(String[] args) {
		
		SavingsAccount sa = new SavingsAccount();
		
		System.out.println("Account Holder :" + sa.accountHolder);
		
		sa.deposit(10000000);
		sa.withdraw(5000);
		sa.displayBalance();
		sa.calculateInterest();
	}
	
}