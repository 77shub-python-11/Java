package com.opp.polymorphism;

public class overridingParent {
	/**
	 * Method name must be same &list of argument must be same 
	 * 
	 * 
	 * methods must exist in different classes & there class must passes parent child relationship 
	 * 
	 * In this we have rule on only 2 thing list of arguments and name should be same but if try to change return type(in child class) we may get error in some case 
	 * Error is thrown when we use return type as primitive data type and try to change change return type in child class
	 * but in case of non primitive data type we can use bigger return type in parent and smaller return type in child e.g object return type can be used in parent and in child class we can use string return type  
	 * and this is called as covaritant data type 
	 * only covaritant data types in return type 
	 * 
	 *  
	 *  
	 *  now lets talk about access modifier 
	 *  in this parent class can have default, protected and child can increase its visibility in child class and one more important thing we can have that only access modifier which can do inheritances (we cannot use private  access modifier )
	 *  And we can not overriding of static method because it make only one copy of static method 
	 *  
	 *  
	 *  for e.g parent class is  protected   and child can be made public it will work fine 
	 *  
	 *  
	 *  
	 *  if i don't want to over ride my method than what can we do 
	 *  we can make that method as static 
	 *  we can make parent class method private 
	 *  we can make it as final method (but final method can be overloaded 
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  by using Super keyword we can call everything   of parent from child class using super keyword 
	 *  
	 *   we can call variable method or constructor using super keyword 
	 *   
	 *   syntax 
	 *   for variable call super.var;
	 *   for method call super.m1();
	 *   for constructor call super();
	 *   for parameter constructor call super(list of parameter );
	 *    
	 *    Super can be used after making object only and static variable and method are made while class but object are made when it is called 
	 *    
	 *    we can use super keyword in anywhere except static method and static block 
	 *    
	 *    any constructor can be called by only constructor and not in any method
	 *    
	 *    
	 *    
	 *    
	 *    
	 *    Same like we have "this" keyword  where we can call anything of current class 
	 *    
	 *    in "this" keyword  can call variable ,method ,constructor  of same class and it is called as recurion 
	 */
	int a = 10;
	int b = 50;
	
	
	public overridingParent(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}

	public  Object m1() {
		System.out.println(" im parent ");
		return 10;
	}
	
	public void m2() {
		System.out.println(this.a);
	}

}
