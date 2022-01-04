package com.yedam.java.example;

public class Grade {
	// 필드
	int math;
	int science;
	int english;
	//생성자
	Grade(int math, int science, int english){
		this.math = math;
		this.science = science;
		this.english = english;
	}
	//메서드
	double average() {
		int sum= math+science+english;
		double average = sum/3.0;
		return average;
	}
}
