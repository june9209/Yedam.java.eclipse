package com.yedam.java.quiz01;

public class Person {

	
	private String Person;
	private int Money;


	
	public Person(String Person, int Money) {
		this.Person = Person;
		this.Money = Money;
	}

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
		System.out.println(Person+"���� �������� " + Money+"���̴�. ");
	}
	
}
