package com.cs586.operation;

import com.cs586.abstractfactory.AbstractFactoryClass;
import com.cs586.actions.GasPumpedMsg;
import com.cs586.actions.PrintReceipt;
import com.cs586.actions.PumpGasUnit;
import com.cs586.actions.ReadyMsg;
import com.cs586.actions.CancelMsg;
import com.cs586.actions.DisplayMenu;
import com.cs586.actions.PayMsg;
import com.cs586.actions.RejectMsg;
import com.cs586.actions.SetInitialValues;
import com.cs586.actions.SetPrice;
import com.cs586.actions.SetW;
import com.cs586.actions.StopMsg;
import com.cs586.actions.StoreCash;
import com.cs586.actions.StoreData;
import com.cs586.datastore.DataStore;

public class Ouput_Processor_CLASS {

	private AbstractFactoryClass af;
	private StoreData storeData;
	private DataStore dataStore;
	private PayMsg paymsg;
	private DisplayMenu disp_menu;
	private RejectMsg rejectmsg;
	private SetW setw;
	private CancelMsg cancelmsg;
	private StoreCash storecash;
	private SetPrice setprice;
	private SetInitialValues initialval;
	private ReadyMsg readymsg;
	private PumpGasUnit pump;
	private GasPumpedMsg gmsg;
	private StopMsg stopmsg; 
	private PrintReceipt printreceipt;
	
	public void storeData(){
		af=DataStore.af;
		storeData=af.getStoreDataInstance();
		dataStore=af.getDataStoreInstance();
		storeData.storeData(dataStore);	
	}
	public void PayMsg() {
		// TODO Auto-generated method stub
		System.out.println("In OpClass pay Msg");
		af=DataStore.af;
		paymsg=af.getPayMsgInstance();
		paymsg.PayMessage();
	}
	public void PayCredit() {
		// TODO Auto-generated method stub
		System.out.println("Payment Mode Credit Card Selected"+"\n"+"Waiting for Approval !!!");
		
	}
	public void rejectMsg() {
		// TODO Auto-generated method stub
		af=DataStore.af;
		rejectmsg=af.getRejectMsgInstance();
		rejectmsg.rejectMessage();
	}
	public void displayMenu() {
		// TODO Auto-generated method stub
		af=DataStore.af;
		dataStore=af.getDataStoreInstance();
		setw=af.getSetWInstance();
		setw.setW(dataStore);
		disp_menu=af.getDisplayMenuInstance();
		disp_menu.disPlayMenu();
	}
	public void cancelMsg() {
		// TODO Auto-generated method stub
		af=DataStore.af;
		cancelmsg=af.getCancelMsgInstance();
		cancelmsg.getCancelMsg();
	}
	public void payCash() {
		// TODO Auto-generated method stub
		af=DataStore.af;
		setw=af.getSetWInstance();
		dataStore=af.getDataStoreInstance();
		setw.setW(dataStore);
		storecash=af.getStoreCashInstance();
		
		storecash.storeCash(dataStore);
		disp_menu=af.getDisplayMenuInstance();
		disp_menu.disPlayMenu();
	}
	public void setPrice(int i) {
		// TODO Auto-generated method stub
		af=DataStore.af;
		dataStore=af.getDataStoreInstance();
		setprice=af.getSetPriceInstance();
		setprice.setPrice(dataStore,i);
	}
	public void setInitialValues() {
		// TODO Auto-generated method stub
		af=DataStore.af;
		dataStore=af.getDataStoreInstance();
		initialval=af.getInitialValuesInstance();
		initialval.setInitialValues(dataStore);
		readymsg=af.getReadyMsgInstance();
		readymsg.getReadyMessage();
	}
	public void pumpGasUnit() {
		// TODO Auto-generated method stub
		af=DataStore.af;
		dataStore=af.getDataStoreInstance();
		pump=af.getPumpInstance();
		pump.pumpGas(dataStore);
		gmsg=af.getGMsgInstance();
		gmsg.getGasPumpMessage(dataStore);
	}
	public void stopPump() {
		// TODO Auto-generated method stub
		af=DataStore.af;
		stopmsg=af.getStopMsgInstance();
		stopmsg.getStopMessage();
	}
	public void printReceipt() {
		// TODO Auto-generated method stub
		af=DataStore.af;
		printreceipt=af.getPrintReceiptInstance();
		dataStore=af.getDataStoreInstance();
		printreceipt.printReceipt(dataStore);
	}
}