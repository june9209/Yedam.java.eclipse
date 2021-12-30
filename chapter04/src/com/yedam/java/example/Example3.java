package com.yedam.java.example;

import java.util.Scanner;

public class Example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1부터 10사이의 임의의 숫자를 발생시키빈다.
		// 총 3번의 기회가 있고
		// 기회 내에 성공 못할 시 프로그램 종료
		// up&down 게임
		Scanner input = new Scanner(System.in);
		int dice = (int) (Math.random() * 10) + 1;

		System.out.print("1~10사이의 숫자를 입력하시오. ");
		int num = input.nextInt();

		if (num != dice) {
			System.out.print("틀렸습니다. 다시 한번 입력하세요.\n ");
			if (num > dice) {
				System.out.println("down");
			} else {
				System.out.println("up");
			}
			num = input.nextInt();
			if (num != dice) {
				System.out.println("마지막 기회입니다. 다시 한번 입력하세요. ");
				if (num > dice) {
					System.out.println("down");
				} else {
					System.out.println("up");
				}
				num = input.nextInt();
				if (num == dice) {
					System.out.println("축하합니다. 정답입니다.");
				} else {
					System.out.println("틀렸습니다. 게임이 종료됩니다.");
				}
			} else {
				System.out.println("축하합니다. 정답입니다.");
			}
		} else {
			System.out.println("축하합니다. 정답입니다.");
		}

	}

}
