package com.yedam.java.ch01_01;

public class computer extends Calculator {

	@Override
	double areaCircle(double r) {
		System.out.println("Computer의 areaCircel() 실행");
		return Math.PI * r * r;
	}
	
}
