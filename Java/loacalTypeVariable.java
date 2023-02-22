package VariablesType;

public class loacalTypeVariable {
	/**
	 * local variable are declared inside the block,method and constructor are called as local variable
	 * local variable scope is limited to the method ,block or constructor inside which it is defined 
	 * local variable are stored inside stack because they are temporary 
	 * local variable are loaded inside memory when the corresponding method is loaded and destroys when the method is completed its execution 
	 * only allowed modifier for local variable are default and final .public ,private , protected ,static are not allowed 
	 * we cannot access local variable using object reference 
	 *  
	 */
	public static void main(String[] args) {
		int x = 10;
		int y = 20;
		System.out.println(x+y);
	}

}
