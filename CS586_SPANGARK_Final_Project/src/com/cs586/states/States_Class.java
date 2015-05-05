package com.cs586.states;

import com.cs586.operation.Ouput_Processor_CLASS;

public abstract class States_Class {

	public Ouput_Processor_CLASS op= new Ouput_Processor_CLASS();
	public abstract void activate();
	public abstract int getState_Id();
	public abstract void start();
	public abstract void payCredit();
	public abstract void reject();
	public abstract void approved() ;
	public abstract void cancel() ;
	public abstract void payCash() ;
	public abstract void selectGas(int i) ;
	public abstract void startPump();
	public abstract void pump() ;
	public abstract void stopPump() ;
	public abstract void receipt() ;

}
