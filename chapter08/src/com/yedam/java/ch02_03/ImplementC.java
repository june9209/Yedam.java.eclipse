package com.yedam.java.ch02_03;

public class ImplementC implements InterfaceC {

	@Override
	public void methodA() {
		System.out.println("implementsC - methodA() 실행");
	}

	@Override
	public void methodB() {
		System.out.println("ImplementsC - methodB() 실행");
	}

	@Override
	public void methodC() {
		System.out.println("ImplementsC - methodC() 실행");
	}

}
