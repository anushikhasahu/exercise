package com.coforge.inher;

public class Television extends Gadgets {
public Television(String model,double price) {
	super(model,price);
}
	@Override
	public void showAccessoriesG() {
		// TODO Auto-generated method stub
		System.out.print("settop box");
	}

	@Override
	public void getDiscountedPrice(int amount) {
		// TODO Auto-generated method stub
		System.out.print("Price"+(price-amount));
	}

}
