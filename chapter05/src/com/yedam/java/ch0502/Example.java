package com.yedam.java.ch0502;

import java.util.Scanner;

public class Example {

	public static void main(String[] args) {
		// 예제1 - 주어진 배열 안의 값을 전부 더하고 합과 평균을 출력
		System.out.println("---예제 1 ---");
		int[] arr1 = { 10, 20, 30, 50, 3, 60, -5 };
		int sum = 0;
		double avg = 0;
		for (int i = 0; i < arr1.length; i++) {
			sum += arr1[i];
			avg = (double)sum / arr1.length;

		}
		System.out.println("합 : " + sum + "평균 :" + avg);

		// 예제 2- 주어진 배열 안의 값을 출력하는데
		// 인덱스가 2의 배수인 경우만 출력한다.
		System.out.println("---예제 2---");
		int num2 = 0;

		for (int i = 0; i < arr1.length; i += 2) {
			System.out.println(arr1[i]);
		}
		System.out.println("------");
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}
		// 예제 3 - 인덱스 번호 2개를 입력받아, 그 값을 서로 바꿔보세요.
		Scanner sc = new Scanner(System.in);
		System.out.print("인덱스 번호 첫번째 값 : ");
		int new3_1 = sc.nextInt();
		System.out.print("인덱스 번호 두번째 값 : ");
		int new3_2 = sc.nextInt();
		
		//더미 만들어줌
		int new3 = 0;
		//1번쨰 입력받은값 => 더미로 이동 
		arr1[new3] = arr1[new3_1];
		arr1[new3_1] = arr1[new3_2];
		for(int i = 0; i < arr1.length ; i++)
		{
			System.out.print(arr1[i] + " ");
		}
		
	}

}
