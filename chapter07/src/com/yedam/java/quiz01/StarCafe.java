package com.yedam.java.quiz01;

public class StarCafe {
	private String StarCafe;
	private int Money;
	private int per;
	public StarCafe(String StarCafe) {
		this.StarCafe = StarCafe;
		
	}
	public void take(int Money) {
		this.Money += Money;
		per++;
	}
	public void ShowInfo() {
		System.out.print(StarCafe + "������ "+Money+"���̸�, "+per+"���� �ٳబ��.");
	}
}
