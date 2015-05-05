package com.cs586.ip;

import com.cs586.abstractfactory.AbstractFactoryClass;
import com.cs586.abstractfactory.ConcreteAF2;
import com.cs586.abstractfactory.ConcreteAF3;
import com.cs586.datastore.DataStore;
import com.cs586.mdaefsm.MDA_EFSM;

public class GasPump3 {
	private MDA_EFSM mda_efsm;
	private AbstractFactoryClass af;
	private DataStore dataStore;

	public GasPump3(){
		mda_efsm=new MDA_EFSM();
		af=new ConcreteAF3();
		DataStore.af=af;
	}
	public void activate(float a,float b) {
		// TODO Auto-generated method stub
		System.out.println("GasPump value Entered a "+ a);
		System.out.println("GasPump value Entered b "+ b );
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
	public void payCash(float cash){
		dataStore=af.getDataStoreInstance();
		if(cash>0){
			dataStore.setFloatTemp_Cash(cash);
			dataStore.setTemp_w(0);;
			mda_efsm.payCash();
		}
	}
	public void cancel(){
		mda_efsm.cancel();
	}
	public void premiumGas(){
		mda_efsm.selectGas(2);
	}
	public void regularGas(){
		mda_efsm.selectGas(1);
	}
	public void startPump(){
		mda_efsm.startPump();
	}
	public void pumpLiter(){
		af=DataStore.af;
		dataStore=af.getDataStoreInstance();

		/*if(dataStore.getW()==1)
			mda_efsm.pump();*/
		//else
		//if(dataStore.getW()==0){
		
		if(dataStore.getFloatCash()<((dataStore.getL()+1)*dataStore.getGas_Price1())){
			mda_efsm.stopPump();
			//mda_efsm.receipt();
		}
		else
			mda_efsm.pump();
		System.out.println("cash remaining"+dataStore.getFloatCash());
	}


	public void stopPump(){
		mda_efsm.stopPump();
	}
	public void receipt(){
		mda_efsm.receipt();
	}
	public void noReciept(){
		mda_efsm.noReciept();
	}

}
