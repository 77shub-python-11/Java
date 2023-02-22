package com.Opps.Constructor;

public class test {
	int x, y;

	// constructor
	public test(int p, int q) {

		x = p;
		y = q;

	}

	public static void main(String[] args) {
		test t = new test(2, 4);
		System.out.println(t.x);
		System.out.println(t.y);
	}

}
