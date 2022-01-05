package com.yedam.java.ch02_02;

public class HankkokTire extends Tire {

	public HankkokTire(String location, int maxRotation) {
		super(location, maxRotation);
	}
	
	@Override
	public boolean roll() {
		accumulatedRotation++;
		if(accumulatedRotation < maxRotation) {
			System.out.println(location + "HankookTire 수명 : " + (maxRotation - accumulatedRotation));
			return true;
		}else {
			System.out.println("***" + location + "HankookTire 펑크 ***");
			return false;
		}
	}
}
