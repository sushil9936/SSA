package com.cs586.actions;

import com.cs586.datastore.DataStore;

public class StoreCash_1 extends StoreCash {

	@Override
	public void storeCash(DataStore ds) {
		// TODO Auto-generated method stub
		ds.setCash(ds.getTemp_Cash());
		
		System.out.println("Cash Stored in Data Store " +ds.getCash());
	}

}
