package com.yedam.java.ch0502;

import java.util.Iterator;

public class ReferenceTypeExample {

	public static void main(String[] args) {
		// 값을 이용하여 배열 생성
		int[] scores = { 83, 90, 87 };
		System.out.println(scores[0]);
		System.out.println(scores[1]);
		System.out.println(scores[2]);

		for (int i = 0; i < scores.length; i++) {
			System.out.println(scores[i]);
		}

		int sum = 0;
		for (int i = 0; i < 3; i++) {
			sum += scores[i];
		}
		System.out.println("총합 : " + sum);
		double avg = (double) sum / scores.length;
		System.out.println("평균 : " + avg);

		// 값을 이용해서 배열생성2
		int[] scores1;
		scores1 = new int[] { 83, 90, 87 };

		int sum1 = 0;
		for (int i = 0; i < scores.length; i++) {
			sum1 += scores1[i];
		}
		System.out.println("총합 : " + sum1);

		int sum2 = add(new int[] { 83, 90, 87 });
		System.out.println("sum2:" + sum2);

		// new 연산자로 배열생성
		int[] arr1 = new int[3];
		for (int i = 0; i < 3; i++) {
			System.out.println("[" + i + "]" + arr1[i]);
		}
		arr1[0] = 10;
		arr1[1] = 20;
		arr1[2] = 30;
		for (int i = 0; i < 3; i++) {
			System.out.println("[" + i + "]" + arr1[i]);
		}

		String[] arr2 = new String[3];
		for (int i = 0; i < 3; i++) {
			System.out.println("arr2[" + i + "] : " + arr2[i]);
		}
		arr2[0] = "1월";
		arr2[1] = "2월";
		arr2[2] = "3월";

		// 배열의 length = > 배열의 크기
		int[] scores3 = { 58, 65, 87 };

		int sum3 = 0;
		for (int i = 0; i < scores3.length; i++) {
			sum3 += scores3[i];
		}
		System.out.println("총합 : " + sum3);
		double avg3 = (double) sum3 / scores3.length;
		System.out.println("평균 : " + avg3);
		
	}

	public static int add(int[] scores) {
		int sum = 0;
		for (int i = 0; i < 3; i++) {
			sum += scores[i];
		}
		return sum;
	}
}
