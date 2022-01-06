package com.yedam.java.quiz0;

public class Adder extends Calculator{

	@Override
	protected int calc() {
		return a+b;
	}
	@Override
	public void run() {
		input();
		int res = calc();
		System.out.println("계산된 값은 " + res);
	}
}
