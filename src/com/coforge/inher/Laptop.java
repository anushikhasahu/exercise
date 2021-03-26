package com.coforge.inher;

public abstract class Laptop extends Gadgets implements Insurance{

	public Laptop(String model, double price) {
		super(model,price);
		
	}
	
	
	@Override
	public void showAccessoriesG() {
		// TODO Auto-generated method stub
		System.out.print("charger,mic");
	}
	
	public void getInsDetails() {
		System.out.print("theft or damage");
	}
	@Override
	public void getDiscountedPrice() {
		// TODO Auto-generated method stub
		System.out.print("Price: "+(price-amount-2000));
	}

}
