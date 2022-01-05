package com.yedam.java.example3;

public class MainExample {

	
	public static void main(String[] args) {
		CarExample factory = CarExample.getInstance();
		Car mySonata = factory.createCar();
		Car yourSonata = factory.createCar();
		System.out.println(Car.getSerialNum1()+mySonata.getCarNumber());
		System.out.println(Car.getSerialNum1()+yourSonata.getCarNumber());
		
	}

}
