package com.yedam.java.accountBase;

public class AccountField {
	//기본필드
	private static int count = 1;
	private int accountNo = 17033808;
	private String accountOwner;
	private String accountPassword;
	private int accountBalance;
	
	public int getAccountNo() {
		this.accountNo += count;
		count++;
		return accountNo;
	}
	
	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}
	public String getAccountOwner() {
		return accountOwner;
	}
	public void setAccountOwner(String accountOwner) {
		this.accountOwner = accountOwner;
	}
	public String getAccountPassword() {
		return accountPassword;
	}
	public void setAccountPassword(String accountPassword) {
		this.accountPassword = accountPassword;
	}
	public int getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(int accountBalance) {
		this.accountBalance = accountBalance;
	}
	@Override
	public String toString() {
		return "AccountField [accountNo=" + accountNo + ", accountOwner=" + accountOwner + ", accountPassword="
				+ accountPassword + ", accountBalance=" + accountBalance + "]";
	}
	
	
	
}
