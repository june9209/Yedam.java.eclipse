package com.yedam.java.account;

public interface AccountDAO {
	//계좌조회
	public Account selectAccountInfo(long accountNo);
	
	//계좌개설 즉시 계좌번호 조회
	public long selectAccountno(Account account);//Account통쨰로 넘기는 구문
	//계좌개설
	public void createAccount(Account account);//Account통쨰로 넘기는 구문
	//계좌잔액수정
	public void updateAccount(Account account);//Account통쨰로 넘기는 구문
}
