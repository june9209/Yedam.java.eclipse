package com.yedam.java.ch01;

public class MyAdder implements AdderInterface{

	public int add(int i, int j) {
		
		return i+j;
		
	}
	public int add(int i) {
		int result = 0;
		for (int j = 1; j <= i; j++) {
			result += j;
		}
		return result;
	}

	
}
