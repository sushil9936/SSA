package com.cs586.actions;

import com.cs586.datastore.DataStore;

public class GasPumpedMsg_1 extends GasPumpedMsg {

	@Override
	public void getGasPumpMessage(DataStore ds) {
		// TODO Auto-generated method stub
		System.out.println("Number of Gallon Filled: "+ ds.getG()+" Total Amount is "+ds.getTotal());
	}
	
}
