package com.coforge.inher;

public class Current2 extends Account {

	
	public Current2(double balance) {
		super(balance);
	}
	@Override
	void withDraw(double amount) {
		// TODO Auto-generated method stub
		 System.out.println("money withdraw");
		 balance = balance-amount;
	}

	@Override
	void deposit(double amount) {
		// TODO Auto-generated method stub
		System.out.println("money deposit");
		 balance = balance+amount;
	}

	

}
