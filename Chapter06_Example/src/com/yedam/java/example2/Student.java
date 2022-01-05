package com.yedam.java.example2;

public class Student {
	//필드
	private static int serialNum = 1000;
	
	private int studentId; 		// 학번
	private String studentName; // 이름
	private int grede; 			//학급
	private String address; 	//주소
		
	private int cardNumber;
	
	//생성자	
	public Student() {
		serialNum++;
		this.studentId = serialNum;	
	
		this.cardNumber = studentId + 100;
	}
	//메서드
	public static int getSerialNum() {
		return serialNum;
	}
	
	
	public static void setSerialNum(int serialNum) {
		Student.serialNum = serialNum;
	}
	
	
	public int getStudentId() {
		return studentId;
	}
	
	
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	
	
	public String getStudentName() {
		return studentName;
	}
	
	
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	
	public int getGrede() {
		return grede;
	}
	
	
	public void setGrede(int grede) {
		this.grede = grede;
	}
	
	
	public String getAddress() {
		return address;
	}
	
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	
	
	
}
