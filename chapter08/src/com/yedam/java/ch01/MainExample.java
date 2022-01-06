package com.yedam.java.ch01;

public class MainExample {

	public static void main(String[] args) {
		RemoteControl rc1;
		rc1 = new Television();
		rc1.turnOn();
		rc1 = new Audio();
		rc1.turnOn();
		
		SmartTelevision tv = new SmartTelevision();
		RemoteControl rc = tv;
		rc.turnOff();
		Seardchable searchable = tv;
		searchable.search("naver");
		
		System.out.println();
		
		System.out.println("1)----------------");
		MyClass myClass1 = new MyClass();
		myClass1.rc.turnOn();
		myClass1.rc.setVolume(5);
		myClass1.rc.turnOff();
		System.out.println("2)----------------");
		MyClass myclass2 = new MyClass(new Audio());
		
		System.out.println("3)----------------");
		MyClass myClass3 = new MyClass();
		myClass3.methodA();
		
		System.out.println("4)----------------");
		MyClass myClass4 = new MyClass();
		myClass4.methodB(new Television());
		
	}

}
