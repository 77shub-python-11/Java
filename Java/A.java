package com.oops.inheritances;

public class A {
	public static void main(String[] args) {
		A a = new A();
		a.m5();
	}

	A() {

	}

	// Single inheritances
	int x, y;

	void m7() {
		System.out.println("I am m1 ");

	}

	private void m5() {
		System.out.println("I am m5 ");

	}

	protected void m6() {
		System.out.println("I am m6 ");

	}

	public void m1() {
		System.out.println("I am m1 ");

	}

	public void m2() {
		System.out.println("i am m2 ");
	}

}
