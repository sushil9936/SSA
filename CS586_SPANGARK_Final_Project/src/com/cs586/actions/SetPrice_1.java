package com.cs586.actions;

import com.cs586.datastore.DataStore;

public class SetPrice_1 extends SetPrice {
 public void setPrice(DataStore ds){
	 
 }

@Override
public void setPrice(DataStore ds, int i) {
	// TODO Auto-generated method stub
	
	ds.setGas_Price(ds.getPrice());
	System.out.println("Regular Gas for GP1 set as "+ds.getGas_Price());
}
}
