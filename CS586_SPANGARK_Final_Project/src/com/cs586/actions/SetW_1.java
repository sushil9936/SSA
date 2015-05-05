package com.cs586.actions;

import com.cs586.datastore.DataStore;

public class SetW_1 extends SetW {

	@Override
	public void setW(DataStore ds) {
		// TODO Auto-generated method stub
			ds.setW(ds.getTemp_w());
			
			System.out.println("W Stored using SETW class as " +ds.getW() );
		
	}

}
