package com.yedam.java.accountBase;

import java.util.List;

public interface AccountDAO {
	
	//계좌개설
	public List<AccountField> createAccount();
	//잔액조회
	public void searchAccount();
	//입금
	public void inputAccount();
	//출금
	public void outputAccount();
	//계좌이체
	public void sendMoney();
}
