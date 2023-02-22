package com.oppp.Abstract;
/*
 * child should implement all methods of parents compalusry in normal class 
 * but in abstract class we can implement any methods and skip also 
 */

public class A extends Abstraction{

	@Override
	public void m1() {
		System.out.println("Add some eggs in maggie");
		
	}

	@Override
	public void prepareMaggie() {
		// TODO Auto-generated method stub
		System.out.println("Make simple maggie ");
		
	}
	

}
