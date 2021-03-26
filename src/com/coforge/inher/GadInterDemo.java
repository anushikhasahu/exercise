package com.coforge.inher;

public class GadInterDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gadgets tv = new Laptop("samsung", 20000);
		//tv.getGadgets();
		tv.getDetails();
		tv.getDiscountedPrice(3000);
		//System.out.print();
		Insurance ins = (Insurance) tv;
		ins.getInsDetails();
		
		AccessoriesG acc = (AccessoriesG) tv;
		acc.showAccessoriesG();

	}

}
