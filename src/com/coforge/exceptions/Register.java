
package com.coforge.exceptions;

import java.util.Scanner;

class Validation {
	

	 boolean checkName(String name) throws Exception {
		
		String[] names = { "anu", "shikha", "shiv" };
		for (String val : names) {
			if (val.equals(name)) 
			{
				throw new Exception("exception");
			}

		}
		return true;
	}
}

public class Register {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		sc.close();
		try {
		Validation val = new Validation();
		boolean response = val.checkName(name);
		if (response) {
			System.out.println("registered");
		}
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	

}
}
