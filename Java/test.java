package com.oppps.Encapsulation;

public class Test {
	public static void main(String[] args) {
		Bank b1 = new Bank();
		b1.setAccountNumber(123456);
		
		b1.setBalance(60000);
		
		b1.setBalance(90000);
		b1.setBalance(30000000);
		System.out.println(b1.getBalance());
		System.out.println(b1.getAccountNumber());
	}

}
