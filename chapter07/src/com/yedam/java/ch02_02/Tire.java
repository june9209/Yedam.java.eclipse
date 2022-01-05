package com.yedam.java.ch02_02;

public class Tire {
	//�븘�뱶
	public int maxRotation; // 理쒕� �쉶�쟾�닔 ( ���씠�뼱 �닔紐�)
	public int accumulatedRotation; // �늻�쟻 �쉶�쟾�닔
	public String location; // ���씠�뼱�쓽 �쐞移�
	
	//�깮�꽦�옄
	public Tire(String location, int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
	}
	
	//硫붿꽌�뱶
	public boolean roll() {
		accumulatedRotation++;
		if(accumulatedRotation < maxRotation) {
			System.out.println(location + "Tire �닔紐� : " + (maxRotation - accumulatedRotation));
			return true;
		}else {
			System.out.println("***" + location + "Tire 펑크***");
			return false;
		}
	}
	
}
