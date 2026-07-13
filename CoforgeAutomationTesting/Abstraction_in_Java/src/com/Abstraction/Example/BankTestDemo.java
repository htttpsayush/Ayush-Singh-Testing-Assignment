package com.Abstraction.Example;


abstract class Bank{
	
	public void deposit() {
		System.out.println("Money Deposited");
	}
	
	public void withdraw() {
		System.out.println("Money withdraw");
	}
	
	abstract void calculateInterest();
	
}

class SBI extends Bank{
	@Override
	public void calculateInterest() {
		System.out.println("SBI Interest = 6.5%");
	}
}

class HDFC extends Bank{
	@Override
	public void calculateInterest() {
		System.out.println("HDFC Interest = 7%");
	}
}



public class BankTestDemo {
	
	public static void main(String[] args) {
		
		SBI sbi = new SBI();
		sbi.deposit();
		sbi.withdraw();
		sbi.calculateInterest();
		
		

	}

}
