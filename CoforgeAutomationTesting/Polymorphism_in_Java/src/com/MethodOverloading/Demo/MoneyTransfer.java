package com.MethodOverloading.Demo;

public class MoneyTransfer {
	
	
	public void transfer(double amount) {
		System.out.println("transferred Amount:"+ amount);
	}
	
	public void transfer(double amount , String accountNumber) {
		System.out.println("Transferrd" + amount + "to Account" + accountNumber);
	}
	
	public void transfer(double amount , String accountNumber , String remark) {
		System.out.println("Transferrd" + amount);
		System.out.println("TAccountNumber :" + accountNumber);
		System.out.println("Remark" + amount);
	}
	
	public static void main(String[] args) {
		
		
		MoneyTransfer mt = new MoneyTransfer();
		
		mt.transfer(50000);
		mt.transfer(100000, "SBIN12345");
		mt.transfer(5038822, "SBIN1223456", "Success");

	}

}
