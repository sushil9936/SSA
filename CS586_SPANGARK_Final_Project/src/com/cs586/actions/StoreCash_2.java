package com.cs586.actions;

import com.cs586.datastore.DataStore;

public class StoreCash_2 extends StoreCash {

	@Override
	public void storeCash(DataStore ds) {
		// TODO Auto-generated method stub
		ds.setFloatCash(ds.getFloatTemp_Cash());
		System.out.println("Cash Stored in Data Store " +ds.getFloatCash());
	}

}
