package com.yedam.java.example;

public class TV {
	//필드
	String named;
	int year;
	int inch;
	
//	void showInfo() {
//		System.out.println(named+ "에서 만든 "+year +"년형" + inch +"인치 TV");
//	}
	//생성자
	TV(String named, int year, int inch){
		
		this.named = named;
		this.year = year;
		this.inch = inch;
	}
	//메서드
	void showInfo() {
		System.out.println(named+"에서 만든 "+year+"년형 "+inch+"인치 TV");
	}
	
}
