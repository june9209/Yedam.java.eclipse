package com.yedam.java.example;

import java.util.Scanner;

public class MainExample {

	public static void main(String[] args) {
		// Calculator 클래스 -> 사칙연산에 대한 메서드
		Calculator c1 = new Calculator();

		double sum = c1.plus(3, 5);
		double mi1 = c1.minus(6, 4);
		double mu1 = c1.multiply(6, 4);
		double di1 = c1.divide(6, 4);

		System.out.println(sum);
		System.out.println(mi1);
		System.out.println(mu1);
		System.out.println(di1);
		
		//TV클래스 - > 다음과 같은 형태의 생성자와 메서드를 가진다.
		TV myTV = new TV("LG", 2017, 32);
		myTV.showInfo(); //LG에서 만든 2017년형 32인치 TV
		
		
		//Grade클래스 -> 3과목의 점수를 입력받아 성적평균을 출력한다.
		Scanner sc = new Scanner(System.in);
		System.out.print("수학, 과학, 영어 순으로 ");
		int math = sc.nextInt();
		int science = sc.nextInt();
		int english = sc.nextInt();
		Grade myGrade = new Grade(math, science, english);
		//average() 메서드는 평균을 계산하여 리턴
		System.out.println("평균 : " + myGrade.average());
	}

}
