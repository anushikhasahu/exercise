package com.coforge.inher;

class Vehicle {

	
	String brand;
	int price;
	String model;
	
	public  Vehicle(String brand, int price, String model) {
		this.brand = brand;
		this.price = price;
       this.model = model;
	}

	public void getDetails() {
		
		System.out.println("Brand"+ brand);
		System.out.println("Price"+ price);
		System.out.println("Model"+ model);
	}
}
class Car extends Vehicle{
	 String accessories;
	 public Car(String brand, int price, String model, String accessories) {
		
		super(brand, price, model);
		this.accessories = accessories;
	}

	 
     public void showAccesories() {
		 System.out.println("Accessories"+ accessories);
	 }
}
	 
	 class Bike extends Vehicle{
		 String mileage;
		 public Bike(String brand, int price, String model , String mileage) {
			super(brand, price,model);
			 this.mileage = mileage;
		}
 	 
		 public void showMileage() {
			 System.out.println("Mileage"+mileage);
		 }
		
	 }
	 
		 public  class InherDemo1 {
			 public static void main(String args[])
			 {
				  Car c1 = new Car("alto", 120000, "latest","anna");
				  c1.getDetails();
				  c1.showAccesories();
				  
				  Bike b1 = new Bike("alto", 120000, "latest","anna");
				  b1.getDetails();
				  b1.showMileage();
				 
			 }
 

		 }
