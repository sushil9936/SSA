package com.cs586.actions;

import com.cs586.datastore.DataStore;

public class SetInitialValues_1 extends SetInitialValues {

	@Override
	public void setInitialValues(DataStore ds) {
		// TODO Auto-generated method stub
		ds.setG(0);
		ds.setTotal(0);
		ds.setFloatTotal(0);
		ds.setL(0);
	}

}
