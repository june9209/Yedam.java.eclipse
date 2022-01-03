package com.yedam.java.ch0302;

import java.util.Scanner;

public class Homework_0 {

	public static void main(String[] args) {
		// 주어진 배열을 이용하여 다음 내용을 구현하세요.
		System.out.print("문제1 . ");
		int[] arr1 = { 10, 20, 30, 50, 3, 60, -3 };
		Scanner sc = new Scanner(System.in);
		// 문제1. 주어진 배열 중에서 값이 60인 곳의 인덱스를 출력해보자.
		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] == 60)
				System.out.println(arr1[i]);
		}

		// 문제2. 주어진 배열의 인덱스가 3인 곳은 출력하지 말고, 나머지만 출력해보자.
		System.out.print("문제2 . ");
		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] != 3) {
				System.out.print(arr1[i] + " ");
			}
		}

		// 문제3. 주어진 배열 안의 변경하고 싶은 값의 인덱스 번호를 입력받아, 그 값을 1000으로 변경해보자.
		// 입력) 인덱스: 3 -> {10, 20, 30, 1000, 3, 60, -3}
		System.out.print("\n문제3 . ");
		int num3_1 = sc.nextInt();
		for (int i = 0; i < arr1.length; i++) {
			arr1[num3_1] = 1000;
			System.out.print(arr1[i] + " ");
		}
		arr1 = new int[] { 10, 20, 30, 50, 3, 60, -3 };
		// 문제4. 주어진 배열의 요소에서 최대값과 최소값을 구해보자.
		System.out.print("\n문제4 . \n");

		int arr1Max = arr1[0];
		int arr1Min = arr1[0];

		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] > arr1Max) {
				arr1Max = arr1[i];
			} else if (arr1[i] < arr1Min) {
				arr1Min = arr1[i];
			}
		}
		System.out.println("최대값 : " + arr1Max);
		System.out.println("최소값 : " + arr1Min);

		// 문제5. 별도의 배열을 선언하여 양의 정수10개를 입력받아 배열에 저장하고, 배열에 있는 정수 중에서 3의 배수만 출력해보자.
		System.out.print("문제5 . ");
		System.out.println("양의 정수 10개 입력>");

		int[] Num = new int[10];
		for (int i = 0; i < 10; i++) {
			Num[i] = sc.nextInt();

		}
		for (int i = 0; i < Num.length; i++) {
			if (Num[i] % 3 == 0)
				System.out.print(Num[i] + " ");
			;
		}
		System.out.println("\n\n\n");

		// 추가문제)
		// 문제1) 다음은 키보드로부터 학생수와 각 학생들의 점수를 입력받아서, 최고 점수 및 평균 점수를 구하는 프로그램입니다.
		// 실행결과를 보고, 알맞게 작성해보세요.
		// 문제출처, 이것이 자바다 183페이지 9번

		boolean run = true;
		while (run) {
			System.out.println("------------------추가문제-----------------------");
			System.out.println("1.학생 수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("----------------------------------------------");
			System.out.print("메뉴 > ");
			int menu = sc.nextInt();
			// 정의
			int i = 0;
			int per = 0;
			int score = 0;
			int[] per_array = new int[per];
			// 메뉴 반복구간
			switch (menu) {
			// 학생 수
			case 1:
				System.out.print("학생 수를 입력 하시오.");
				per = sc.nextInt();
				per_array = new int[per];
				break;
			// 점수 입력
			case 2:
				System.out.print("점수를 입력 하시오.");
				for (i = 0; i < per_array.length; i++) {
					System.out.printf("per_array[%d]>%s \n" , i, per_array);
					score = sc.nextInt();
					per_array[i] = score;
				}
				break;
			case 3:
				for (int j = 0; j < per_array.length; j++) {
					System.out.println(per_array[i]);
				}
				break;
			
			
			}

		}
	}
}
