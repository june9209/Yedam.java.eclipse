package com.yedam.java.example3;


public class Car {
	//필드
	private static String serialNum1 = "20 가 ";
	private static int serialNum2 = 2000;
	
	private int carNumber;

	//생성자
	Car() {
		serialNum2++;
		this.carNumber = serialNum2; 
	}

	//메서드
	
	public static String getSerialNum1() {
		return serialNum1;
	}


	public static void setSerialNum1(String serialNum1) {
		Car.serialNum1 = serialNum1;
	}


	public static int getSerialNum2() {
		return serialNum2;
	}


	public static void setSerialNum2(int serialNum2) {
		Car.serialNum2 = serialNum2;
	}


	public int getCarNumber() {
		return carNumber;
	}


	public void setCarNumber(int carNumber) {
		this.carNumber = carNumber;
	}
	
	
	
}
