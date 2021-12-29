package com.yedam.java.ch0402;

import java.util.Scanner;

public class Example02 {

	public static void main(String[] args) {
		// 문제1) 책 161페이지 5번, for문을 이용해서 다음과 같이 *를 출력하는 코드를 작성해보세요.
		// *
		// **
		// ***
		// ****
		// *****
		Scanner input = new Scanner(System.in);
		System.out.print("문제 1 : ");
		int num = input.nextInt();
		String i = "*";
		String j = "";
		for (int a = 1; a <= num; a++) {
			System.out.println(j += i);
		}

		// 문제2) 책 160페이지 2번, for문을 이용해서 1부터 100까지의 정수 중에서 2의 배수가 아닌 숫자의 개수를 구하세요.
		// 단, continue 문을 사용한다.
		System.out.print("문제 2 : ");
		int num2 = input.nextInt();
		int count = 0;

		for (int b = 1; b <= num2; b++) {
			if (!(b % 2 == 1)) {
				count++;
			}
		}
		System.out.println(count);
		System.out.println("문제 3");

		// 문제3) 책 161페이지 4번, 중첩 for문을 이용하여 방정식 4x+5y = 60의 모든 해 중 첫번째로 구해지는 값을 (x, y)
		// 형태로 출력해보세요.
		// 단, x와 y는 10이하의 자연수입니다.

		int result = 0;
		one: for (int x = 0; x <= 10; x++) {
			for (int y = 0; y <= 10; y++) {
				result = (4 * x) + (5 * y);
				if (result == 60) {
					System.out.println("(" + x + "," + y + ")");
					break one;
				}

			}
		}

		// 문제4) do ~ while문과 Math.random()함수를 이용하여 1 ~ 10의 정수 중 7이라는 수가 나올때까지 숫자를 출력하는
		// 코드를 작성해보세요.
		System.out.println("문제 4 ");

		int mr;

		do {
			mr = (int) (Math.random() * 10) + 1;
			System.out.println(mr);
		} while (mr != 7);

		// 문제5) 책 161페이지 3번, while문과 Math.random() 함수를 이용해서 2개의 주사위를 던졌을때 나오는 숫자를 (숫자1,
		// 숫자2) 형태로 출력하고,
		// 숫자의 합이 5가 아니면 계속 주사위를 던지고, 숫자의 합이 5이면 실행을 멈추는 코드를 작성해보세요.
		// 또한 주사위를 몇번 던졌는지 횟수를 출력하세요.
		// 숫자의 합이 5가 되는 조합은 (1,4), (4,1), (2,3),(3,2)
		System.out.println("문제 5 ");

		int countDice = 0;

		while (true) {
			countDice++;
			int dice1 = (int) (Math.random() * 6) + 1;
			int dice2 = (int) (Math.random() * 6) + 1;
			int diceSum = dice1 + dice2;

			if (diceSum != 5) {
				continue;
			} else {
				break;
			}
		}
		System.out.println("횟수 : " + countDice);

		// 문제 7

		boolean run = true;
		int balance = 0;
		end: while (run) {
			System.out.println("--------------------------------------");
			System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
			System.out.println("--------------------------------------");
			System.out.print("선택> ");
			int bank = input.nextInt();
			int inmoney;
			int outmoney;
			switch (bank) {
			case 1:
				System.out.print("입금액 > ");
				inmoney = input.nextInt();
				balance += inmoney;
				break;
			case 2:
				System.out.print("출금액 > ");
				outmoney = input.nextInt();
				balance -= outmoney;
				break;
			case 3:
				System.out.println("잔고 : " + balance);
				break;
			case 4:
				break end;
			}

		}
		System.out.println("시스템종료");

	}

}
