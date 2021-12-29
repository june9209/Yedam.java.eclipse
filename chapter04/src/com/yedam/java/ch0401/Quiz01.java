package com.yedam.java.ch0401;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

//		// 문제1) 두 개의 정수가 주어졌을 때 두 정수의 합이 자연수이면 'Natural Number'을 출력하도록 하세요.
//		System.out.println("문제1) 두 개의 정수가 주어졌을 때 두 정수의 합이 자연수이면 'Natural Number'을 출력하도록 하세요.");
//		System.out.print("첫번째 정수 : ");
//		int x1 = input.nextInt();
//		System.out.print("두번째 정수 : ");
//		int y1 = input.nextInt();
//
//		if (x1 + y1 > 0) {
//			System.out.println("Natural Number");
//		}
//
//		// 문제2) 두 개의 정수가 주어졌을 때 두 수의 대소관계에 따라 부등호( > or = or < )를 출력하도록 하세요.
//		System.out.println("문제2) 두 개의 정수가 주어졌을 때 두 수의 대소관계에 따라 부등호( > or = or < )를 출력하도록 하세요.");
//		System.out.print("첫번쨰 정수 : ");
//		int x2 = input.nextInt();
//		System.out.print("두번째 정수 : ");
//		int y2 = input.nextInt();
//		if (x2 > y2) {
//			System.out.println(x2 + ">" + y2);
//		} else if (x2 == y2) {
//			System.out.println(x2 + "=" + y2);
//		} else {
//			System.out.println(x2 + "<" + y2);
//		}
//
//		/*
//		 * 문제3) 체질량 지수인 BMI에 따라 비만도를 네가지 단계로 구분하여 결과값을 출력하도록 하세요. BMI = 체중 / ( 키 * 키 )
//		 * 저체중(18.5미만), 정상(18.5 이상 25미만), 과체중(25이상 30미만), 비만(30이상)
//		 */
//		System.out.println("문제3) 체질량 지수인 BMI에 따라 비만도를 네가지 단계로 구분하여 결과값을 출력하도록 하세요.");
//		System.out.print("키 : ");
//		int x3 = input.nextInt();
//		System.out.print("몸무게 : ");
//		int y3 = input.nextInt();
//		int bmi = y3 / ((x3 * x3) / 10000);
//
//		if (bmi < 18.5) {
//			System.out.println("저체중");
//		} else if (18.5 <= bmi && bmi < 25) {
//			System.out.println("정상수");
//		} else if (25 <= bmi && bmi < 30) {
//			System.out.println("과체중");
//		} else if (bmi >= 30) {
//			System.out.println("비만");
//		}
//		/*
//		 * 문제4) 선택한 단의 6번째 값을 출력하도록 하세요. 예를 들어, 2단일 경우 2 X 6 = 12 단, 출력문에 변수를 사용하지 않는다.
//		 */
//		System.out.println("문제 4 : 선택한 단의 6번째 값을 출력하도록 하세요.");
//		System.out.print("선택한 단 : ");
//		int x4 = input.nextInt();
//
//		switch (x4) {
//		case 1:
//			System.out.println("6");
//			break;
//		case 2:
//			System.out.println("12");
//			break;
//		case 3:
//			System.out.println("18");
//			break;
//		case 4:
//			System.out.println("24");
//			break;
//		case 5:
//			System.out.println("30");
//			break;
//		case 6:
//			System.out.println("36");
//			break;
//		case 7:
//			System.out.println("42");
//			break;
//		case 8:
//			System.out.println("48");
//			break;
//		case 9:
//			System.out.println("54");
//			break;
//		default:
//			break;
//		}
//
//		/*
//		 * 문제5) 다음과 같이 점수 범위에 따라 등급을 구분하여 해당 점수에 대한 등급을 출력하도록 하세요. 90점 이상 100점 이하 : A
//		 * 등급, 80점 이상 90점미만 : B 등급, 70점 이상 80점미만 : C 등급, 60점 이상 70점미만 : D 등급, 60점미만 :
//		 * E등급
//		 */
		System.out.println("문제5) 다음과 같이 점수 범위에 따라 등급을 구분하여 해당 점수에 대한 등급을 출력하도록 하세요.");
		System.out.print("점수 : ");
		int x5 = Integer.parseInt(input.nextLine());
		while (true) {
			if (x5 <= 100 && x5 > 0) {
				switch (x5 / 10) {
				case 10:
				case 9:
					System.out.println("A");
					break;
				case 8:
					System.out.println("B");
					break;
				case 7:
					System.out.println("C");
					break;
				case 6:
					System.out.println("D");
					break;
				default:
					System.out.println("E");
					break;
				}
				break;
			} else {
				System.out.println("다시 입력하세요.");
				System.out.println("점수 : ");
				x5 = input.nextInt();

			}

		}
	}
}
