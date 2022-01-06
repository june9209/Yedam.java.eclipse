package com.yedam.java.quiz0;

public class Account {
	private String AH;
	private int balance;

	// 개인적인거
	private String history = "";

	public Account(String AH) {
		this.AH = AH;
	}

	public void deposit(int plus) {
		balance += plus;
		history += plus + "원 입금\n";
		
	}

	public void withdraw(int minus) {
		balance -= minus;
		history += minus + "원 출금\n";
		}

	public String getName() {
		return AH;
	}

	public int getBalance() {
		return balance;
	}

	public void getPrint() {
		System.out.println(history);
	}

}
