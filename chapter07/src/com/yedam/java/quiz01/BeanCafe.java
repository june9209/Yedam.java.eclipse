package com.yedam.java.quiz01;

public class BeanCafe {
	private int Money;
	private int per;
	private String BeanCafe;
	
	public BeanCafe(String BeanCafe) {
		this.BeanCafe=BeanCafe;
	}
	
	public void take(int Money) {
		this.Money += Money;
		per++;
	}
	public void ShowInfo() {
		System.out.print(BeanCafe + "매출은 "+Money+"원이며, "+per+"명이 다녀갔다.");
	}
}
