package com.coforge.inher;

import java.util.Scanner;

class Vehicle1 {

		
		String brand;
		int price;
		String model;
		
		public  Vehicle1(String brand, int price, String model) {
			this.brand = brand;
			this.price = price;
	       this.model = model;
		}

		public void getDetails() {
			
			System.out.println("Brand"+ brand);
			System.out.println("Price"+ price);
			System.out.println("Model"+ model);
		}
		public double getDiscountedPrice(double amount) {
			return 0;
		}

		
	}
	class Car1 extends Vehicle1{
		 String accessories;
		 double price;
		 public Car1(String brand, int price, String model, String accessories) {
			
			super(brand, price, model);
			this.accessories = accessories;
			this.price = price;
		}

		 
	     public void showAccesories() {
			 System.out.println("Accessories"+ accessories);
		 }
	     public double getDiscountedPrice(double amount) {
	    	 return (price-amount);
	     }
	}
		 
		 class Bike1 extends Vehicle1{
			 String mileage;
			 double price;
			 public Bike1(String brand, int price, String model , String mileage) {
				super(brand, price,model);
				 this.mileage = mileage;
				 this.price = price;
				 
			}
	 	 
			 public void showMileage() {
				 System.out.println("Mileage"+mileage);
			 }
			 public double getDiscountedPrice(double amount) {
		    	 return (price-(amount-100));
		     }
		 }
		 
		 public class OverrideVehicle {
			 public static void main(String args[])
			 {
				 String choice;
				 double discountedPrice;
				 System.out.println("enter choice");
				 Scanner src = new Scanner(System.in);
				 choice = src.next();
				 switch(choice) {
			 case "Car1":
					 Vehicle1 car1 = new Car1("alto", 120000, "latest","anna");
				
				     Car1 car2 =(Car1)car1;
				     
					  car1.getDetails();
					  car2.showAccesories();
				 discountedPrice = car2.getDiscountedPrice(1300);
				 System.out.println("discunted price"+discountedPrice);
				 break;
			 case "Bike1":
				 Vehicle1 bike1 = new Bike1("alto", 120000, "latest","anna");
			
			     Bike1 bike2 =(Bike1)bike1;
			     
				  bike1.getDetails();
				  bike2.showMileage();
			 discountedPrice = bike2.getDiscountedPrice(1200);
			 System.out.println("discounted price" + discountedPrice);
				break;
				default:
					
					System.out.println("wrong input");
				 }
				 
				 
				src.close(); 
				 
	
				
			 }
		

	
	
}
