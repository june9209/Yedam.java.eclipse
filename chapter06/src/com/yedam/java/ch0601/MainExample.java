package com.yedam.java.ch0601;

public class MainExample {

	public static void main(String[] args) {
		//new 연산자 호출
		Car car1 = new Car();
		System.out.println("car1 변수가 Car인스턴스를 참조합니다.");
		System.out.println(car1);
		Car car2 = new Car();
		System.out.println("car2 변수가 Car인스턴스를 참조합니다.");
		System.out.println(car2);
		
		System.out.println();
		//
		
		Car myCar = new Car();
		
		System.out.println(" 제작회사 : " + myCar.company);
		System.out.println(" 모델명 : " + myCar.model);
		System.out.println(" 색깔 : " + myCar.color);
		System.out.println(" 최고속도 : " + myCar.MaxSpeed);
		System.out.println(" 현재속도 : " + myCar.speed);
	
		myCar.speed = 60;
		System.out.println(" 현재속도 : " + myCar.speed);
	}

}
