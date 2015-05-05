package com.cs586.datastore;

import com.cs586.abstractfactory.AbstractFactoryClass;

public abstract class DataStore {
	public static AbstractFactoryClass af;
	public abstract int  getPrice();
	public abstract void setPrice(int price);
	public abstract int getTemp_price() ;
	public abstract  void setTemp_price(int temp_price);
	public abstract int getTemp_w() ;
	public abstract void setTemp_w(int temp_w);
	public abstract int getW();
	public abstract void setW(int w); 
	public abstract int getTemp_Cash();

	public abstract void setTemp_Cash(int temp_Cash);

	public abstract int getCash() ;

	public abstract void setCash(int cash);

	public abstract void setGas_Price(int gas_Price);
	public abstract int getGas_Price();

	public abstract int getG();

	public abstract void setG(int g) ;

	public abstract int getTotal();

	public abstract void setTotal(int total) ;
	public abstract void setTemp_price_a(float a) ;
	public abstract void setTemp_price_b(float b);
	
	public abstract float getTemp_price_a() ;
	public abstract float getTemp_price_b();
	public abstract float getPrice_a() ;

	public abstract void setPrice_a(float price_a) ;

	public abstract float getPrice_b() ;

	public abstract void setPrice_b(float price_b);


	public abstract float getGas_Price1();

	public abstract void setGas_Price1(float gas_Price1);
	public abstract void setFloatTotal(float f);
	public abstract float getFloatTotal();
	public abstract void setFloatTemp_Cash(float cash);
	public abstract float getFloatTemp_Cash();


	public abstract int getL();

	public abstract void setL(int l) ;
	public abstract float getFloatCash() ;

	public abstract void setFloatCash(float cash);



}
