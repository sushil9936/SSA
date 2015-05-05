package com.cs586.actions;

import com.cs586.datastore.DataStore;

public class SetPrice_2 extends SetPrice {

	@Override
	public void setPrice(DataStore ds, int i) {
		// TODO Auto-generated method stub
		if(i==1){
			ds.setGas_Price1(ds.getPrice_a());
			System.out.println("Price for Regular Gas Set as "+ds.getGas_Price1());
		}
		if(i==2){
			ds.setGas_Price1(ds.getPrice_b());
			System.out.println("Price for Super/ Premium Gas Set as "+ds.getGas_Price1());
		}
	}
}
