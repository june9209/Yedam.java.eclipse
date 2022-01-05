package com.yedam.java.quiz01;

public class Person {
	// 필드
	private String Person;
	private int Money;


	// 생성자
	public Person(String Person, int Money) {
		this.Person = Person;
		this.Money = Money;
	}
	// 메서드
	public void buyCoffee(StarCafe Americano) {
		this.Money -= 4000;
		Americano.take(4000);
		
	}
	
	public void buyCoffee(BeanCafe Latte) {
		this.Money -= 4500;
		Latte.take(4500);
		;
	}
	public void showInfo() {
		System.out.println(Person+"씨의 남은돈은 " + Money+"원이다. ");
	}
	
}
