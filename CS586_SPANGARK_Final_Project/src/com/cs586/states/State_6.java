package com.cs586.states;

import com.cs586.states.States_Class;

public class State_6 extends States_Class {
	private final int state_id=7;
	@Override
	public void activate() {
		// TODO Auto-generated method stub
		
	}
	public int getState_Id(){
		return state_id;
	}
	@Override
	public void start() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void payCredit() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void reject() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void approved() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void cancel() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void payCash() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void selectGas(int i) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void startPump() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void pump() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void stopPump() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void receipt() {
		// TODO Auto-generated method stub
		op.printReceipt();
	}
}
