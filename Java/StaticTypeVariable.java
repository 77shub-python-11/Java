package VariablesType;

public class StaticTypeVariable {
	static int x= 20;
	static int y = 30;
	
	/**
	 * Static variable is type of variable is created single copy in memory 
	 * when we don't want to create separate copies of variable for different object then we can use static variables
	 * Static variable have single copy in memory .
	 * static variable are independent of object 
	 * we can declare static variable using 'static' modifier.
	 * Static variable are loaded into memory at the time of class loading and destroys when class destroys.
	 * Static variable are defined in class and outside of method ,block or constructor 
	 * 
	 */
	public static void main(String[] args) {
		System.out.println(x+y);
		
	}

}
