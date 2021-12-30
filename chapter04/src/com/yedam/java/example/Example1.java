package com.yedam.java.example;

import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {
		// 커피메뉴 4개와 각 가격을 출력하고
		// 사용자가 메뉴를 선택한 만큼 가격을 합산해서 출력
		Scanner input = new Scanner(System.in);
		boolean run = true;

		int sum = 0;
		String bill = "***영수증***\n";
		int cf1 = 0;
		int cf2 = 0;
		int cf3 = 0;
		int cf4 = 0;
		while (run) {
			// 메뉴를 출력
			System.out.println("*****커피메뉴***** ");
			System.out.println("1. 아메리카노 2000원\n");
			System.out.println("2. 카페라떼 2500원\n");
			System.out.println("3. 카라멜 마끼아또 4500원 \n");
			System.out.println("4. 자바침 프라푸치노 5500원 \n");
			System.out.println("5. 프로그램 종료");

			// 사용자가 선택하는 부분
			int menuNo = input.nextInt();

			// 선택한 메뉴에 따라 가격을 합산
			switch (menuNo) {
			case 1:
				sum += 2000;
				bill += "아메리카노 2000원\n";
				cf1++;
				break;
			case 2:
				sum += 2500;
				bill += "카페라떼 2500원\n";
				cf2++;
				break;
			case 3:
				sum += 4500;
				bill += "카라멜 마끼아또 4500원\n";
				cf3++;
				break;
			case 4:
				sum += 5500;
				bill += "자바침 프라푸치노\n";
				cf4++;
				break;
			case 5:
				run = false;
				break;
			default:
				System.out.println("메뉴를 잘못 선택하셨습니다.");
				break;
			}
		}
		bill += "--------\n";
		bill += "총 합계 : " + sum + "원" + "\n아메리카노 * " + cf1 + "\n카페라떼 * " + cf2 + "\n카라멜 마끼아또 *" + cf3
				+ "\n자바침 프라프치노 * " + cf4;
		System.out.println(bill);

	}

}
