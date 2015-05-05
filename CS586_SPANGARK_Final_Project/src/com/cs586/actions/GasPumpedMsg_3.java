package com.cs586.actions;

import com.cs586.datastore.DataStore;

public class GasPumpedMsg_3 extends GasPumpedMsg {

	@Override
	public void getGasPumpMessage(DataStore ds) {
		// TODO Auto-generated method stub
		System.out.println("Number of Units Gas Disposed: "+ ds.getL()+" Total Amount is "+ds.getFloatTotal());
	}

}
