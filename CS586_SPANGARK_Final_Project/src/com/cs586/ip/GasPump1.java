package com.cs586.ip;

import com.cs586.abstractfactory.AbstractFactoryClass;
import com.cs586.abstractfactory.ConcreteAF1;
import com.cs586.actions.SetInitialValues;
import com.cs586.datastore.DataStore;
import com.cs586.mdaefsm.MDA_EFSM;

public class GasPump1 {

	private MDA_EFSM mda_efsm;
	private AbstractFactoryClass af;
	private DataStore dataStore;

	public GasPump1(){
		mda_efsm=new MDA_EFSM();
		af=new ConcreteAF1();
		DataStore.af=af;
	}
	public void activate(int a) {
		// TODO Auto-generated method stub
		System.out.println("GasPump value Entered "+ a);
		dataStore=af.getDataStoreInstance();
		if(a>0){
			dataStore.setTemp_price(a);
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
	public void payCash(int cash){
		dataStore=af.getDataStoreInstance();
		if(cash>0){
			dataStore.setTemp_Cash(cash);
			dataStore.setTemp_w(0);;
			mda_efsm.payCash();
		}
	}
	public void startPump(){
		mda_efsm.selectGas(1);
		mda_efsm.startPump();

	}
	public void pump(){
		af=DataStore.af;
		dataStore=af.getDataStoreInstance();
		
		if(dataStore.getW()==1)
			mda_efsm.pump();
		else
			if(dataStore.getW()==0){
				if(dataStore.getCash()<((dataStore.getG()+1)*dataStore.getGas_Price())){
					mda_efsm.stopPump();
					mda_efsm.receipt();
				}
				else
					mda_efsm.pump();
			}
	}
	public void stopPump(){
		mda_efsm.stopPump();
		mda_efsm.receipt();
	}

}
