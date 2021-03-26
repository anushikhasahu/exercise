package com.coforgeoops;

import java.util.Scanner;


public class BonusMain {
	
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter designation");
	String designation = sc.nextLine();
	EmployeeBonus eb = new EmployeeBonus("rohan","manager");
	EmployeeBonus eb1 = new EmployeeBonus("raj","programmer");
	EmployeeBonus eb2 = new EmployeeBonus("ronin","hr");
	
	if(designation.equals("programmer"))
	{
		System.out.println("name: "+eb.name);
		System.out.println("basic alloance : "+eb.calcBonus(500));
}
	else if(designation.equals("manager"))
	{
		System.out.println("name: "+eb1.name);
		System.out.println("basic alloance : "+eb1.calcBonus(500,500));
}
	
	
	else if(eb.designation.equals("hr"))
	{
		System.out.println("name: "+eb2.name);
		System.out.println("basic alloance : "+eb2.calcBonus(500,500,500));
		
}
	else {
		System.out.println("wrong entry");
	}
}
}