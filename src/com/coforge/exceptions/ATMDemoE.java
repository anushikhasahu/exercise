package com.coforge.exceptions;

import java.util.Scanner;

class Bank2 {
	int balance;

	public Bank2(int balance) {
		super();
		this.balance = balance;

	}

	void withdraw(int amount) throws OutOfLimitsException, NegBalException {

		if ((balance - amount) == 0)
			throw new NegBalException("neg balance");
		if (amount > 5000)
			throw new OutOfLimitsException("amount should be less");
	}
}

public class ATMDemoE {
	// System.out.println("welcome");
public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	int amount = sc.nextInt();System.out.println("amount"+amount);
	Bank2 bank = new Bank2(9000);
	try{
		bank.withdraw(amount);
		System.out.print("amount withdrawn");
	}catch(OutOfLimitsException e){
		System.out.print(e.getMessage());
	}catch(NegBalException e){
		System.out.print(e.getMessage());
	}
	System.out.println("good bye");
}}