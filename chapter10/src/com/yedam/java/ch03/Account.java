package com.yedam.java.ch03;

public class Account {
	private long balance;
	
	//생성자
	public long getBalance() {
		return balance;
	}	
	//메서드
	
	public void deposit(int money) {
		balance += money;
	}
	
	public void withDraw(int money)throws BalanceInsufficientException {
		if(balance < money) {
			throw new BalanceInsufficientException("wksrhqnwhr : " + (money - balance) +" 모자랍니다.");
			}
		balance-=money;
	}
}
