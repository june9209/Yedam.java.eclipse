package com.yedam.java.accountBase;

import com.yedam.java.app.AccountFrame;

public class AccountDAOImpl extends AccountField implements AccountDAO {
	AccountField accF = new AccountField();
	//싱글톤
	private static  AccountDAO instance = new AccountDAOImpl();
	private AccountDAOImpl() {};
	public static AccountDAO getInstance() {
		return instance;
	}
//	계좌관리프로그램
//	-계좌개설(필드) -> 계좌번호(중복X) 자동생성, 계좌주명, 비밀번호,입금액(1원 이상),
//
//	-잔액조회 ->  1) 계좌번호 -> 유무확인,  2) 유) 비밀번호 -> 일치 유무 3) 잔액조회
//
//	-입금 -> 1) 계좌번호 -> 유무확인 2) 유) 비밀번호 -> 일치 유무  3) 1원이상 입금
//
//	-출금 -> 1)계좌번호 -> 유무확인 2) if(T))비밀번호 -> 일치유무 3)해당 계좌번호 잔액을 조회(잔액이 1원이상일시 출금동작)
//
//	-계좌이체 -> 1)계좌번호 -> 유무확인 2) if(T))비밀번호 -> 일치유무 3) 상대방 계좌번호 조회 (존재유무확인)  4) 내 계좌 잔액 확인(1원이상일시 동작) - > 5. 송금액이 잔액을 넘는금액인가 유무 확인(넘지 않으면 송금)

	@Override
	public void insertAccount() {
		
		
	}

	@Override
	public void searchAccount() {
		
	}

	@Override
	public void inputAccount() {

	}

	@Override
	public void outputAccount() {

	}

	@Override
	public void sendMoney() {
		
	}

}

//int accNo = accF.getAccountNo();
//System.out.println("계좌가 계설되었습니다. ㅊㅋㅊㅋ");
//System.out.println("계좌번호 > "+accNo + "계좌주명" +accF.getAccountOwner() +"비밀번호" + accF.getAccountPassword()+"입금액" + getAccountBalance());
