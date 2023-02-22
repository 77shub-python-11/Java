package com.oppp.Abstract;


/*
 * All method in interface are by default abstract 
 * concert methods are not allowed in interface where before 1.8 version of java after that we can write default concert method 
 *  multiple inheritace in java is allowed in case of interface 
 *  
 *  
 * 
 */

public interface abstractionUsingInterface {
	static int a=1;//all variable of interface are public static final 
	final int b =2;
	public int c =3;
	public void m1();
	void m2();
	
	default void m3() {
		
	}

}
