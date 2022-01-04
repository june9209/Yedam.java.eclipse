package com.yedam.java.ch0302;

import java.util.Scanner;

public class Homework_01 {

	public static void main(String[] args) {
		boolean run = true;
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int index = 0;
		int max=0;
		int[] a = null;

		while (run) {
			System.out.println("1.상품 수 | 2.가격입력 | 3.제품별 가격 | 4.분석 | 5.종료");
			int menu = sc.nextInt();

			switch (menu) {
			case 1:
				System.out.print("상품수 > ");
				int num = sc.nextInt();
				a = new int[num];
				break;
				
			case 2:
				for (int i = 0; i < a.length; i++) {
					System.out.println("가격입력 : ");
					a[i]= sc.nextInt();
				}
				break;
				
			case 3:
				for (int i = 0; i < a.length; i++) {
					System.out.println("제품별 가격 > 제품번호["+(i+1)+"] = "+a[i]);
				}
				break;
			//배열내 최고가격 출력, 그 제외 총합
			case 4:
				for (int i = 0; i < a.length; i++) {
					if(max < a[i]) {
						max = a[i];
					}
				}
				
				for (int i = 0; i < a.length; i++) {
					if(a[i] == max) {
						index = i+1;
						continue;
					}
					
					sum += a[i];
				}
				
				System.out.println("최고 가격 > "+index);
				System.out.println("최고가격 제외 합 > "+sum);
				break;
			case 5:
				
				System.out.println("시스템 종료");
				run =false;
				
			}

		}

	}
}
