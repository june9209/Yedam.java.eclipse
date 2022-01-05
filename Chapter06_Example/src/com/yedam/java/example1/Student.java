package com.yedam.java.example1;

public class Student {
	//필드
	private String name;
	private int money;
	
	//생성자
	public Student(String name, int money) {
		this.name = name;
		this.money = money;
	}
	
	//메서드
	public void takeBus(Bus bus) {
		this.money -= 1000;
		bus.take(1000);
	}
	
	public void takeSubway(Subway subway) {
		this.money -= 1200;
		subway.take(1200);
	}
	
	public void showInfo() {
		System.out.println(this.name + "님의 남은 돈은" + this.money + "입니다.");
		
	}
	
	
	
	
}
