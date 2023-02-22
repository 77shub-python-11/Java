package com.oppp.Abstract;
/*
 * we can create object of abstract class bcoz for make object of abstract there should be some variable in abstract but abstrct class does not have any variable and abstract methods also does not have body so in this case what can we  instantiate so we can not create object of abstract class
 * we can write constructor in abstract class and constructor is used to initailize intance variable 
 * if any class is abstract class we can create object of it bcoz in abstract method is not having any body so nothing will be initailize in heap memory so java has made one rule that we can not create object of abstract class   
 *   
 */
public  class customer {
	public static void main(String[] args) {
		A customera = new A();
		customera.prepareMaggie();
		customera.m1();
		
		
	}

}
