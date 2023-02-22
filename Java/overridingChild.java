package com.opp.polymorphism;

public class overridingChild  extends overridingParent{
	
	
	
	public overridingChild(int a, int b) {
		super(a, b);
		// TODO Auto-generated constructor stub
	}

	@Override 
	public String m1() {
		int c =super.a;
		String a = "Shubham";
		System.out.println("im child class  "+a);
		
		return a;
	}
			

}
