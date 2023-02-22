package com.oppps.Encapsulation;

public class Bank {
	private int accountNumber;
	private int Balance;
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public int getBalance() {
		return Balance;
	}
	public void setBalance(int balance) {
		if(balance >5000) {
			balance = Balance;
		}
		else {
			System.out.println("Balance needed more ");
		}
	}
	
	

}
