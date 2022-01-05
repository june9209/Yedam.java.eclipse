package com.yedam.java.example1;

public class TakeTrans {

	public static void main(String[] args) {
		Student studentJames = new Student("James", 5000);
		Student studentTomas = new Student("Tomas", 10000);
		
		Bus bus100 = new Bus(100);
		
		//버스를탄다
		studentJames.takeBus(bus100);
		//버스를 탄 후 제임스의 상황(돈, 버스를탔다?)
		studentJames.showInfo();
		//승객한명 태운후 버스의 상황
		bus100.showInfo();
		
		Subway subwayGreen = new Subway("2호선");
		studentTomas.takeSubway(subwayGreen);
		studentTomas.showInfo();
		subwayGreen.showInfo();
	}

}
