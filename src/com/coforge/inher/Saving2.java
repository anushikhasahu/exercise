package com.coforge.inher;

public class Saving2 extends Account {

	public Saving2(double balance) {
		super(balance);
	}
	@Override
	void withDraw(double amount) {
		// TODO Auto-generated method stub
		 System.out.println("money withdraw");
		 balance = balance/amount;
	}

	@Override
	void deposit(double amount) {
		// TODO Auto-generated method stub
		System.out.println("money deposit");
		 balance = balance*amount;
	}

	
}
