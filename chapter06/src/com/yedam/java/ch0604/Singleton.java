package com.yedam.java.ch0604;

public class Singleton {
	//필드
	private static Singleton singLeton = new Singleton() {};
	
	
	//생성자
	private Singleton() {}
	//메서드
	static Singleton getInstance() {
		
		
		return singLeton;
	}
	
}
