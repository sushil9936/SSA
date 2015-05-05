package com.cs586.abstractfactory;

import com.cs586.actions.CancelMsg_1;
import com.cs586.actions.DisplayMenu_2;
import com.cs586.actions.DisplayMenu_3;
import com.cs586.actions.GasPumpedMsg;
import com.cs586.actions.GasPumpedMsg_2;
import com.cs586.actions.GasPumpedMsg_3;
import com.cs586.actions.PayMsg_2;
import com.cs586.actions.PrintReceipt;
import com.cs586.actions.PrintReceipt_2;
import com.cs586.actions.PumpGallon_2;
import com.cs586.actions.PumpGasUnit;
import com.cs586.actions.PumpLiter;
import com.cs586.actions.ReadyMsg;
import com.cs586.actions.CancelMsg;
import com.cs586.actions.DisplayMenu;
import com.cs586.actions.PayMsg;
import com.cs586.actions.PayMsg_3;
import com.cs586.actions.ReadyMsg_1;
import com.cs586.actions.RejectMsg;
import com.cs586.actions.RejectMsg_1;
import com.cs586.actions.SetInitialValues;
import com.cs586.actions.SetInitialValues_1;
import com.cs586.actions.SetPrice;
import com.cs586.actions.SetPrice_2;
import com.cs586.actions.SetW;
import com.cs586.actions.SetW_1;
import com.cs586.actions.StopMsg;
import com.cs586.actions.StopMsg_1;
import com.cs586.actions.StoreCash;
import com.cs586.actions.StoreCash_2;
import com.cs586.actions.StoreData;
import com.cs586.actions.StoreData_1;
import com.cs586.actions.StoreData_2;
import com.cs586.datastore.DataStore;
import com.cs586.datastore.DataStore_1;
import com.cs586.datastore.DataStore_2;
import com.cs586.datastore.DataStore_3;


public class ConcreteAF3 extends AbstractFactoryClass {
	private DataStore ds;
	private StoreData sd;
	private PayMsg pm;
	private RejectMsg rm;
	private SetW setw;
	private DisplayMenu dm;
	private CancelMsg cm;
	private StoreCash storeCashInstance;
	private SetPrice sp;
	private SetInitialValues iv;
	private ReadyMsg readyMsg;
	private PumpGasUnit pump;
	private GasPumpedMsg gmsg; 
	private StopMsg stopmsg;
	private PrintReceipt printreceipt;
	
	public ConcreteAF3(){
		ds=new DataStore_3();
		sd=new StoreData_2();
		pm=new PayMsg_3();
		rm=new RejectMsg_1();
		setw=new SetW_1();
		dm=new DisplayMenu_3();
		cm=new CancelMsg_1() ;
		storeCashInstance=new StoreCash_2();
		sp=new SetPrice_2();
		iv=new SetInitialValues_1() ;
		readyMsg=new ReadyMsg_1();
		pump=new PumpLiter();
		gmsg=new GasPumpedMsg_3();
		stopmsg=new StopMsg_1();
		printreceipt=new PrintReceipt_2();
	}
	public DataStore getDataStoreInstance(){
		return ds;
	}
	@Override
	public StoreData getStoreDataInstance() {
		// TODO Auto-generated method stub
		return sd;
	}
	@Override
	public PayMsg getPayMsgInstance() {
		// TODO Auto-generated method stub
		return pm;
	}
	@Override
	public RejectMsg getRejectMsgInstance() {
		// TODO Auto-generated method stub
		return rm;
	}
	@Override
	public SetW getSetWInstance() {
		// TODO Auto-generated method stub
		return setw;
	}
	@Override
	public DisplayMenu getDisplayMenuInstance() {
		// TODO Auto-generated method stub
		return dm;
	}
	@Override
	public CancelMsg getCancelMsgInstance() {
		// TODO Auto-generated method stub
		return cm;
	}
	@Override
	public StoreCash getStoreCashInstance() {
		// TODO Auto-generated method stub
		return storeCashInstance;
	}
	@Override
	public SetPrice getSetPriceInstance() {
		// TODO Auto-generated method stub
		return sp;
	}
	@Override
	public SetInitialValues getInitialValuesInstance() {
		// TODO Auto-generated method stub
		return iv;
	}
	@Override
	public ReadyMsg getReadyMsgInstance() {
		// TODO Auto-generated method stub
		return readyMsg;
	}
	@Override
	public PumpGasUnit getPumpInstance() {
		// TODO Auto-generated method stub
		return pump;
	}
	@Override
	public GasPumpedMsg getGMsgInstance() {
		// TODO Auto-generated method stub
		return gmsg;
	}
	@Override
	public StopMsg getStopMsgInstance() {
		// TODO Auto-generated method stub
		return stopmsg;
	}
	@Override
	public PrintReceipt getPrintReceiptInstance() {
		// TODO Auto-generated method stub
		return printreceipt;
	}
}
