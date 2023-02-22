package com.oops.inheritances;

public class B extends A {
	public void m3() {
		System.out.println("I am m3 ");

	}
	public void m4() {
		System.out.println("I am m4 ");

	}
	public static void main(String[] args) {
		B b = new B();
		b.x = 45;
		b.y = 30;
		b.m1();
		b.m2();
		b.m3();
		b.m4();
		b.m6();
		b.m7();
		System.out.println(b.x);
		System.out.println(b.y);
	}

}
