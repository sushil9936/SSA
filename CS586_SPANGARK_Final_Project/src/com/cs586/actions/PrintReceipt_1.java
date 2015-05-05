package com.cs586.actions;

import com.cs586.datastore.DataStore;

public class PrintReceipt_1 extends PrintReceipt {

	@Override
	public void printReceipt(DataStore ds) {
		// TODO Auto-generated method stub
		System.out.println("Thank you for Using Gaspump 1 Your Total Bill is"+ ds.getTotal());
	}

}
