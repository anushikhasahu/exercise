package com.coforgeoops;



public class mobile {
	String brand;
	String model;
	int price;

    public void getDetails() {
	System.out.println("Brand : "+brand);
	System.out.println("Model : "+model);
	System.out.println("Price : "+price);
	}

	public double showDiscountedPrice(int amount){
	return price-amount;
	} 
 public static void main(String[] args) {
	// object 1 
	 mobile mobile = new mobile();
	mobile.brand = "Samsung";
	mobile.model = "S20";
	mobile.price = 1000;
	mobile.getDetails();
	mobile.showDiscountedPrice(3000); 
	 //System.out.println(mob1.brand + "\t" + mob1.model + "\t" + mob1.price);
	// System.out.printf("%d %d %d",mob1.brand,mob1.model,mob1.price); 
	 // object2 
	 mobile mobile2 = new mobile();
	mobile2.brand = "Apple";
	mobile2.model = "11";
	mobile2.price = 780;
	mobile2.getDetails();
	mobile2.showDiscountedPrice(1700); 
	 //System.out.println(mob2.brand + "\t" + mob2.model + "\t" + mob2.price);
	// System.out.printf("%d %d %d",mob2.brand,mob2.model,mob2.price);
	} 
	
	
}
