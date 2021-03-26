package com.coforge.exceptions;

import java.util.Scanner;


class Validations1 {
	 boolean checkName(String name) throws Exception {
			
			String[] names = { "anu", "shikha", "shiv" };
		try {
			for (String val : names) {
				if (val.equalsIgnoreCase(name)) {
					throw new NameExistsException("name exist");
				}
			}	
			}catch(NameExistsException e) {
				System.out.print("error....");
				throw e;
				

			}
			return true;
		}
public void checkPass(String pass) throws TooShortException, TooLongException{
	if(pass.length()>10) {
		throw new  TooLongException("too long");
	}
	else if(pass.length()<10) {
		throw new  TooShortException("too short");
	}
	else {
		System.out.print("password generated");
	}
}
	
}



public class RegisterLS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		try {
		String name = sc.next();
		//String pass = sc.next();
	//	boolean status = false;
		Validation1 val = new Validation1();
		boolean status = validation1.checkUser(name);
	
	if(status) {
		System.out.print("enter password");
		String pass = sc.next();
		validiate1.checkPass(pass);
		System.out.print("registered successfully");
	}
		}catch (NameExistsException |TooShortException| TooLongException e) {
		
			System.out.print(e.getMessage());
	}
		sc.close();
}
}
