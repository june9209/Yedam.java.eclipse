package com.yedam.java.example3;

public class CarExample {
	private static CarExample instance = new CarExample();
	
	
	private CarExample() {}


	public static CarExample getInstance() {
		return instance;
	}
	
	public Car createCar() {
		return new Car();
	}
}
