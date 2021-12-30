package com.yedam.java.example;

import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// ATM기가 있고 입금, 출금, 잔액조회, 프로그램 종료
		// 1. 출금을 할 때 잔액보다 많을 경우 (잔액이 부족합니다.)출력
		// 2. 입금, 출금, 잔액조회 -> 비밀번호로 정보확인
		// 3.
		boolean run = true;
		int money = 0;
		String pw = "1234";

		while (run) {
			System.out.println("--------------------------------");
			System.out.println("1.예금 | 2. 출금 | 3. 잔고 | 4. 종료");
			int in = input.nextInt();
			switch (in) {
			
			case 1:
				System.out.print("비밀번호를 입력하시오 . ");
				String flush = input.nextLine();
				String pw1 = input.nextLine();
				if (pw.equals(pw1)) {
					System.out.print("입금 액수 : ");
					int in1 = input.nextInt();
					money += in1;
					System.out.println("입금 후 잔액 : " + money);
					break;

				} else {
					System.out.println("비밀번호가 틀렸습니다.");
				}
				break;
				
			case 2:
				System.out.println("비밀번호를 입력하시오 . ");
				flush = input.nextLine();
				pw1 = input.nextLine();
				if (pw.equals(pw1)) {
					int out1 = 0;
					if (money < out1) {
						System.out.println("잔액이 부족합니다.");
						run= false;
						break;
					} else {
						System.out.print("출금 액수 : ");
						out1 = input.nextInt();
						money -= out1;
						System.out.println("출금 후 잔액 : " + money);
					}
					break;
				}
				
			case 3:
				System.out.println("비밀번호를 입력하시오 . ");
				flush = input.nextLine();
				pw1 = input.nextLine();
				if (pw.equals(pw1)) {
					System.out.println("잔액 : " + money);
					break;
				}
				
			case 4:
				run = false;
				System.out.println("시스템이 종료되었습니다.");
				break;
			default:
				break;

			}

		}

	}

}
