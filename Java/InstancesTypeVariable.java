package VariablesType;
/**
 * variables is storing data using some name to it 
 * variable has its scope and lifetime on this it is divided in three type 
 * 1.instances variable 
 * 2.Static variable 
 * 3.local variable 
 * @author shubham
 *
 */
public class InstancesTypeVariable {
    private int x = 10; //instance variable 
	public int y = 20; //instance variable 
/**
 * instances variable are declared in class
 * For every object separate copy of instance variable will be create 
 * their life time is same as object life time 
 * instance variables are loaded in memory at time of object is created 
 * instance variable are declared in class and outside of method ,block and constructors
 * instance variable are accessed using class object 
 * instance variable can have access modifier 
 * 1. public 
 * 2. private 
 * 3. protected 
 * 4.default 
 *  
 */
	
	
	public static void main(String[] args) {
		InstancesTypeVariable i1 = new InstancesTypeVariable();
		System.out.println(i1.x);
		System.out.println(i1.y);
		
		
		
		
	}
}
