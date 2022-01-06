package com.yedam.java.quiz0;

public class NamedCircle extends Circle{
	private String name;
	
	public NamedCircle(int radius,String name) {
		super(radius);
		this.name = name;
	}
	
	public void show() {
		System.out.println(name+", 반지름 = "+ getRadius());
	}
	

	
	

}
