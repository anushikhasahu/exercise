package com.coforge.exceptions;

import java.util.Scanner;

class Validations {
	 boolean checkName(String name) throws Exception {
			
			String[] names = { "anu", "shikha", "shiv" };
			try {
			for (String val : names) {
				if (val.equalsIgnoreCase(name)) {
					throw new Exception("name exist");
				}
			}	
			}catch(Exception e) {
				throw new Exception("error......");
				

			}
			return true;
		}

	
}




public class RegisterV {
	
	public static void main(String[] args) {
		try {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter");
		String name = sc.next();
		sc.close();
		
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
