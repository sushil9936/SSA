package com.cs586.actions;

import com.cs586.datastore.DataStore;

public class PumpGallon_2 extends PumpGasUnit {

	@Override
	public void pumpGas(DataStore ds) {
		// TODO Auto-generated method stub
		ds.setG(ds.getG()+1);

		ds.setFloatTotal(ds.getGas_Price1()*ds.getG());
	}

}
