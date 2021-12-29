package com.yedam.java.ch0401;

import java.util.Scanner;

public class Example {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("If_Problem \n1.2의 배수 판별기 ");
		// 예제1 - 점수를 입력받아서 70점 이상이면 합격 미만이면 불합격

		// 예제2 - 정수를 입력받아 해당 정수가 2의 배수인지 확인
		int num = Integer.parseInt(input.nextLine());

		if (num % 2 == 0) {
			System.out.println("2의 배수입니다.");
		} else {
			System.out.println("2의배수가 아닙니다.");
		}

		// 예제 3 - 점수는 0~100점 사이 값이여야 하며
		// 벗어날 경우 " 점수 입력 오류!"출력
		// 60점 이상이면 합격, 미만이면 불합격
		System.out.println("2. 점수를 입력하시오.");
		int ex3 = Integer.parseInt(input.nextLine());

		if (ex3 >= 0 && ex3 <= 100) {
			if (ex3 >= 60) {
				System.out.println(ex3 + "점, 합격");
			} else {
				System.out.println(ex3 + "점, 불합격");
			}
		}
		// 예제4 - 놀이기구, 키110cm이상일 경우 라바 트위스터를 탑승
		// 미만이면 보호자가 있는지 체크 -> 있으면 탑승
		// 없으면 "보호자와 같이 오세요."출력
		System.out.println("3. 놀이기구 탑승여부 => 키를 입력하시오.");
		int cm = Integer.parseInt(input.nextLine());

		if (cm >= 110) {
			System.out.println("라바 트위스터 탑승 가능");
		} else {
			System.out.println("보호자가 있습니까? Yes or No로만 답하시오.");
			String mom = input.nextLine();
			if (mom.equals("Yes")) {
				System.out.println("탑승하세요.");
			} else if (mom.equals("No")) {
				System.out.println("보호자와 같이 오세요.");
			}

		}

		//switch문
		
		//예제1 - 정수를 입력받아 0일 경우 false, 1일경우 true,
		//		둘다 아닐 경우 "체크오류"
		System.out.println("Switch_Problem \n1.정수 입력하시오. ");
		int num1 = input.nextInt();
		switch(num1)
		{
		case 0:
			System.out.println("false");
			break;
		case 1:
			System.out.println("true");
			break;
		default:
			System.out.println("체크오류");
			break;
		
		}
		
		//예제2 - 정수를 입력받아 홀수인지 짝수인지를 판별
		//		 default에 해당될 경우 어떤 수 
		
		System.out.println("2. 정수 입력하시오. ");
		int num2 = Integer.parseInt(input.nextLine());
		
		switch(num2%2)
		{
		case 0:
			System.out.println("짝수이다.");
			break;
		case 1:
			System.out.println("홀수이다.");
			break;
		}
	}

}
