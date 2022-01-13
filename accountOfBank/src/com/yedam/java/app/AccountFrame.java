package com.yedam.java.app;

import java.util.List;
import java.util.Scanner;

import com.yedam.java.accountBase.AccountDAO;
import com.yedam.java.accountBase.AccountDAOImpl;
import com.yedam.java.accountBase.AccountField;

public class AccountFrame {
	private AccountDAO accD = AccountDAOImpl.getInstance();
	private Scanner sc = new Scanner(System.in);

	public AccountFrame() {

		while (true) {
			//메뉴
			menu();

			// 메뉴선택
			int menuNo = menuSelect();
			// 계좌개설
			if (menuNo == 1) {
				createAccount();
			} // 잔액조회
			else if (menuNo == 2) {
				searchAccount();
			} // 입금
			else if (menuNo == 3) {
				inputAccount();
			} // 출금
			else if (menuNo == 4) {
				outputAccount();
			} // 계좌이체
			else if (menuNo == 5) {
				sendMoney();
			} // 종료
			else if (menuNo == 6) {
				end();
			}

		}
	}


	public void menu() {
		System.out.println("==============================================");
		System.out.println("====1.게좌개설 2.잔액조회 3.입금 4.출금 5.계좌이체=====");
		System.out.println("==============================================");
	}
	public int menuSelect() {
		int num = 0;
		try {
			num = sc.nextInt();
		}catch(Exception e) {
			System.out.println("다시 입력하세요(1,2,3,4,5");
		}
		return num;
	}

	private int createAccount() {
		List<AccountField> list = accD.createAccount();
		AccountField accountField = new AccountField();
		accountField.getAccountNo();
		//System.out.println(accountField);
		System.out.print("계좌주 > ");
		String name = sc.nextLine();
		System.out.print("비밀번호 > ");
		String pw = sc.nextLine();
		System.out.print("임금액 > ");
		int money = Integer.parseInt(sc.nextLine());
		list = ;
//		System.out.println("계좌번호 >" + accountField + " 계좌주 > " + name + " 비밀번호 > " + pw+ " 입금액 " + money) ;
		
		return list;
	}

}
