package com.oppp.Abstract;
/**
 * maggie is good example of abstraction in market we have two type of maggie one is normal and other is package only we have to put hot water but most of the people like normal one bcoz people like to customize it in other one we can not customize it 
 * so abstraction is also same it is not concert method we can customize it according to our use 
 * abstraction is achived by two ways 
 * 1.abstract class 
 * 2.interface 
 * definaton
 * Creating something as abstract and allowing others to implement as per there taste 
 * 
 *   abstract class is used to achive 0 to 100% abstraction 
 *   abstract methods do not have any body 
 *   abstract methods is made only in abstract class only 
 *   abstract methods connot be private it can only be public protected and default 
 *   static method can not be override and in abstract method we can not make it as static bcoz it is also override
 *   we can not create abstract method as final bcoz as abstract method it has nothing implemented so we can make it as final 
 *   we can overload abstract method 
 *   
 *   how to call concert method of abstract class ?
 *   1.we can make child class and call it in that child class 
 *   2.we can make that method as static and static method can be called by class name  
 *   
 * 
 * 
 * @author shubham
 *
 */
public abstract class Abstraction {
	int a;
	static int b;
	final int c;
	static final int d;
	static {
		d = 40;
	}
	public Abstraction() {
		a = 10;
		b = 20;
		c = 30;
	}
	public  abstract void m1();
	public abstract void prepareMaggie();
	public  void m2() {
		

	}
	

	
}
