package com.cs586.mdaefsm;

import com.cs586.states.Start_State;
import com.cs586.states.State_0;
import com.cs586.states.State_1;
import com.cs586.states.State_2;
import com.cs586.states.State_3;
import com.cs586.states.State_4;
import com.cs586.states.State_5;
import com.cs586.states.State_6;
import com.cs586.states.States_Class;

public class MDA_EFSM {

	public States_Class st_arr[];
	private  int state_id=0;

		
	public int getState_id() {
		return state_id;
	}


	public void setState_id(int state_id) {
		this.state_id = state_id;
	}
	public MDA_EFSM() {
		st_arr=new States_Class[8];
		st_arr[0]=new Start_State();
		st_arr[1]=new State_0();
		st_arr[2]=new State_1();
		st_arr[3]=new State_2();
		st_arr[4]=new State_3();
		st_arr[5]=new State_4();
		st_arr[6]=new State_5();
		st_arr[7]=new State_6();
		

	}


	public void activate() {
		// TODO Auto-generated method stub
		st_arr[state_id].activate();
		if(st_arr[state_id].getState_Id()==0){
			state_id=1;
			System.out.println("MFDEFSM ACIVATE CALLED");
		}
		else{
			System.out.println("Into Invalidate State, Please select appropriate State");
		}
		
	}


	public void start() {
		// TODO Auto-generated method stub
		st_arr[state_id].start();
		if(st_arr[state_id].getState_Id()==1){
			state_id=2;
			System.out.println("MDAEFSM START CALLED");
		}
		else{
			System.out.println("Into Invalidate State, Please select appropriate State");
		}
	}


	public void payCredit() {
		// TODO Auto-generated method stub
		st_arr[state_id].payCredit();
		if(st_arr[state_id].getState_Id()==2){
			state_id=3;
			System.out.println("MDAEFSM Credit CALLED");
		}
		else{
			System.out.println("Into Invalidate State, Please select appropriate State");
		}
	}


	public void reject() {
		// TODO Auto-generated method stub
		st_arr[state_id].reject();
		if(st_arr[state_id].getState_Id()==3){
			state_id=1;
			System.out.println("MDAEFSM reject CALLED");
		}
		else{
			System.out.println("Into Invalidate State, Please select appropriate State");
		}
	}


	public void approved() {
		// TODO Auto-generated method stub
		st_arr[state_id].approved();
		if(st_arr[state_id].getState_Id()==3){
			state_id=4;
			System.out.println("MDAEFSM approved CALLED");
		}
		else{
			System.out.println("Into Invalidate State, Please select appropriate State");
		}
	}


	public void cancel() {
		// TODO Auto-generated method stub
		st_arr[state_id].cancel();
		if(st_arr[state_id].getState_Id()==4){
			state_id=1;
			System.out.println("MDAEFSM Cancel CALLED");
		}
		else{
			System.out.println("Into Invalidate State, Please select appropriate State");
		}
	}


	public void payCash() {
		// TODO Auto-generated method stub
		st_arr[state_id].payCash();
		if(st_arr[state_id].getState_Id()==2){
			state_id=4;
			System.out.println("MDAEFSM PayCash CALLED");
		}
		else{
			System.out.println("Into Invalidate State, Please select appropriate State");
		}
	}


	public void startPump() {
		// TODO Auto-generated method stub
		st_arr[state_id].startPump();
		if(st_arr[state_id].getState_Id()==5){
			state_id=6;
			System.out.println("MDAEFSM StartPump CALLED");
		}
		
		else{
			System.out.println("Into Invalidate State, Please select appropriate State");
		}
	}


	public void selectGas(int i) {
		// TODO Auto-generated method stub
		st_arr[state_id].selectGas(i);
		if(st_arr[state_id].getState_Id()==4){
			state_id=5;
			System.out.println("MDAEFSM SelectGas CALLED");
		}
		else{
			System.out.println("Into Invalidate State, Please select appropriate State");
		}
		
	}


	public void pump() {
		// TODO Auto-generated method stub
		st_arr[state_id].pump();
		if(st_arr[state_id].getState_Id()==6){
			state_id=6;
			System.out.println("MDAEFSM pump CALLED");
		}
		else{
			System.out.println("Into Invalidate State, Please select appropriate State");
		}
	}


	public void stopPump() {
		// TODO Auto-generated method stub
		st_arr[state_id].stopPump();
		if(st_arr[state_id].getState_Id()==6){
			state_id=7;
			System.out.println("MDAEFSM stop CALLED");
		}
		else{
			System.out.println("Into Invalidate State, Please select appropriate State");
		}
	}


	public void receipt() {
		// TODO Auto-generated method stub
		st_arr[state_id].receipt();
		if(st_arr[state_id].getState_Id()==7){
			state_id=1;
			System.out.println("MDAEFSM Reciept CALLED");
		}
		else{
			System.out.println("Into Invalidate State, Please select appropriate State");
		}
	}


	public void noReciept() {
		// TODO Auto-generated method stub
		//st_arr[state_id].receipt();
		if(st_arr[state_id].getState_Id()==7){
			state_id=1;
			System.out.println("MDAEFSM no Reciept CALLED");
		}
		else{
			System.out.println("Into Invalidate State, Please select appropriate State");
		}
	}
	

}
