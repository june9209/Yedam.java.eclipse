package com.yedam.java.ch02_01;

public class MainExample {

	public static void main(String[] args) {
		//==자동 타입 변환
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();
		
		A a1 = b;
		A a2 = c;
		A a3 = d;
		A a4 = e;
		
		B b1 = d;
		C c1 = e;
		//D d1 = b1;
		//B b2 = e;
		//C c2 = d;
		
		Child child = new Child();
		child.method1();
		child.method2();
		child.method3();
		
		System.out.println("");
		
		//parent 인스턴스? 생성하고 새로운 인스턴스에서 child값을 대입.//원본에는 영향이 없음.
		Parent parent = child;
		
		
		parent.method1();
		parent.method2();
		
		Parent parent2 = new Parent();
		parent2.method1();
		parent2.method2();
	
	}

}
