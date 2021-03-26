package com.coforge.lamdemo;

public class LamdaDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator cal = (x, y) -> System.out.println("addition :" + (x + y));
		cal.calculate(2, 5);

		cal = (x, y) -> System.out.println("sub :" + (x - y));
		cal.calculate(2, 50);

		cal = (x, y) -> System.out.println("division :" + (x / y));
		cal.calculate(20, 5);

		cal = (x, y) -> System.out.println("multiplication :" + (x * y));
		cal.calculate(10, 5);
	}

}
