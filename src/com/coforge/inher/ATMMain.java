package com.coforge.inher;

import java.util.Scanner;

public class ATMMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter details : ");
		String account1 = sc.next();
		Account account;
		if(account1.equals("S")) {
			account = new Saving2(20000);
		}else if(account1.equals("C")) {
			account = new Current2(50000);
		}
		else {
			account = new Account(10000);
		}
		
		
		
	}
}
