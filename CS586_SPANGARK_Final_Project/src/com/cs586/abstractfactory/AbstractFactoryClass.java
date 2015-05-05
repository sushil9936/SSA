package com.cs586.abstractfactory;

import com.cs586.actions.CancelMsg;
import com.cs586.actions.DisplayMenu;
import com.cs586.actions.GasPumpedMsg;
import com.cs586.actions.PrintReceipt;
import com.cs586.actions.PumpGasUnit;
import com.cs586.actions.ReadyMsg;
import com.cs586.actions.RejectMsg;
import com.cs586.actions.SetInitialValues;
import com.cs586.actions.SetPrice;
import com.cs586.actions.SetW;
import com.cs586.actions.StopMsg;
import com.cs586.actions.StoreCash;
import com.cs586.actions.StoreData;
import com.cs586.actions.PayMsg;
import com.cs586.datastore.DataStore;

public abstract class AbstractFactoryClass {

	public abstract DataStore getDataStoreInstance() ;
	public abstract StoreData getStoreDataInstance();
	public abstract PayMsg getPayMsgInstance();
	public abstract RejectMsg getRejectMsgInstance();
	public abstract SetW getSetWInstance() ;
	public abstract PrintReceipt getPrintReceiptInstance();
	public abstract DisplayMenu getDisplayMenuInstance() ;
	public abstract CancelMsg getCancelMsgInstance();
	public abstract StoreCash getStoreCashInstance() ;
	public abstract SetPrice getSetPriceInstance();
	public abstract SetInitialValues getInitialValuesInstance();
	public abstract ReadyMsg getReadyMsgInstance() ;
	public abstract PumpGasUnit getPumpInstance() ;
	public abstract GasPumpedMsg getGMsgInstance() ;
	public abstract StopMsg getStopMsgInstance();
	

}
