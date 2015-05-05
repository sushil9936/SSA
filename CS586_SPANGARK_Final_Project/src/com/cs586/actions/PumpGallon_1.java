package com.cs586.actions;

import com.cs586.datastore.DataStore;

public class PumpGallon_1 extends PumpGasUnit {

	@Override
	public void pumpGas(DataStore ds) {
		// TODO Auto-generated method stub
		
		ds.setG(ds.getG()+1);
		
		ds.setTotal(ds.getGas_Price()*ds.getG());
		
	}

}
