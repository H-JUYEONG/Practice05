package com.javaex.ex08;

public class Account {

	private String accountNo;
	private int balance;

	// 생성자 작성
	public Account(String accountNo) {
		this.accountNo = accountNo;
	}

	// 필요한 메소드 작성
	public void deposit(int money) {
		balance += money;
	}

	public void withdraw(int money) {
		balance -= money;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public String getAccountNo() {
		return accountNo;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public int getBalance() {
		return balance;
	}

	public void showBalance() {
		System.out.println(balance);
	}

}
