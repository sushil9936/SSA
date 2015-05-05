package com.cs586.actions;

import com.cs586.datastore.DataStore;

public class PrintReceipt_2 extends PrintReceipt {

	@Override
	public void printReceipt(DataStore dataStore) {
		// TODO Auto-generated method stub
		System.out.println("Thank you for Using Gaspump Your Total Bill is"+ dataStore.getFloatTotal());
	}

}
