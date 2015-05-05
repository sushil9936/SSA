package com.cs586.actions;

import com.cs586.datastore.DataStore;

public class StoreData_2 extends StoreData {

	@Override
	public void storeData(DataStore ds) {
		// TODO Auto-generated method stub
		ds.setPrice_a((ds.getTemp_price_a()));
		System.out.println("Price Stored using StoreData as a= " +ds.getPrice_a() );
		ds.setPrice_b((ds.getTemp_price_b()));
		System.out.println("Price Stored using StoreData as b= " +ds.getPrice_b() );
	}

}
