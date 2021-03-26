package com.coforge.inher;

public  class Account {

	double balance;
	public Account(double balance) {
		super();
	  this.balance = balance;
	}
	 void withDraw(double amount) {
		 System.out.println("bank withdraw");
	 }
	 
	 
	 
	 
	 void deposit(double amount) {
		 System.out.println("bank deposit");
	 }
	 double getBalance() {
		 return balance;
	 }
	
	

	
	
}
