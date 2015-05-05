package com.cs586.ip;

import com.cs586.abstractfactory.AbstractFactoryClass;
import com.cs586.abstractfactory.ConcreteAF1;
import com.cs586.abstractfactory.ConcreteAF2;
import com.cs586.datastore.DataStore;
import com.cs586.mdaefsm.MDA_EFSM;

public class GasPump2 {
	private MDA_EFSM mda_efsm;
	private AbstractFactoryClass af;
	private DataStore dataStore;

	public GasPump2(){
		mda_efsm=new MDA_EFSM();
		af=new ConcreteAF2();
		DataStore.af=af;
	}
	public void activate(float a,float b) {
		// TODO Auto-generated method stub
		
		System.out.println("GasPump value Entered b "+ b );
		System.out.println("GasPump value Entered "+ a);
		dataStore=af.getDataStoreInstance();
		if(a>0 && b>0){
			dataStore.setTemp_price_a(a);
			dataStore.setTemp_price_b(b);
			mda_efsm.activate();
		}
	}
	public void start(){
		mda_efsm.start();
	}
	public void payCredit(){
		mda_efsm.payCredit();
	}
	public void reject(){
		mda_efsm.reject();
	}
	public void cancel(){
		mda_efsm.cancel();
	}
	public void approved(){
		dataStore=af.getDataStoreInstance();
		dataStore.setTemp_w(1);;
		mda_efsm.approved();
	}
	public void superGas(){
		mda_efsm.selectGas(2);
	}
	public void regularGas(){
		mda_efsm.selectGas(1);
	}
	public void startPump(){
		mda_efsm.startPump();
	}
	public void pumpGallon(){
		mda_efsm.pump();
	}
	public void stopPump(){
		mda_efsm.stopPump();
		mda_efsm.receipt();
	}
}
