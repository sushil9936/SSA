package com.cs586.actions;

import com.cs586.datastore.DataStore;

public class PumpLiter extends PumpGasUnit {

	@Override
	public void pumpGas(DataStore ds) {
		// TODO Auto-generated method stub
		ds.setL(ds.getL()+1);

		ds.setFloatTotal(ds.getGas_Price1()*ds.getL());
	}

}
