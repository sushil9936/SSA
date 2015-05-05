package com.cs586.actions;

import com.cs586.actions.StoreData;
import com.cs586.datastore.DataStore;

public class StoreData_1 extends StoreData {

	@Override
	public void storeData(DataStore ds) {
		// TODO Auto-generated method stub
		ds.setPrice(ds.getTemp_price());
		
		System.out.println("Price Stored using StoreData as " +ds.getPrice() );
	}

}
