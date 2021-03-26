package com.coforge.basics;

public class RevNum {

	public static void main(String[] args) {

	    int num = 123457, reversed = 0;

	    while(num != 0) {
	    
	      int digit = num % 10;
	        reversed = reversed * 10 + digit;
	        num /= 10;
	    }

	    System.out.println("Reversed Number: " + reversed);
	  }
	
	
}
