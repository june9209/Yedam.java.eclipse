package com.yedam.java.quiz0;

public class StudentScores {
	//필드
	private String name;
	private int grade;
	
	  //입력받은값
	private double Kscore;
	private double Escore;
	private double Mscore;
	
	//클래스 내에서 계산값
	private double individuals;
	private double avg;
	private double total;
	
	
	//생성자
	public StudentScores(String name, int grade) {
		this.name = name;
		this.grade = grade;
	}

	public void setKorean(double score) {
		this.Kscore = score;
	}

	public void setEnglish(double score) {
		this.Escore=score;
	}

	public void setMath(double score) {
		this.Mscore=score;
	}
	public int getGrade() {
		return grade;
	}

	public String getName() {
		return name;
	}

	public double getTotal() {
		
		total = this.Kscore + this.Escore + this.Mscore;
		return total;
	}

	public double getAverage() {
		individuals = (this.Kscore/100.0*100)+ (this.Escore/100.0*100) + (this.Mscore/100.0*100); 
		avg = individuals/3.0;
		
		return avg;
	}
	
	
	//메서드
	
	
}
