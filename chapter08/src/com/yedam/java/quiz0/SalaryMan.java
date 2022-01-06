package com.yedam.java.quiz0;

public class SalaryMan {
	int salary = 1000000;
	int yearm =0;

	public SalaryMan(int salary) {
		this.salary = salary;
	}
	
	public SalaryMan() {
		System.out.println("초기월 급여"+this.salary+"원 입니다.");
	}
	//초기 월급 , 연봉 = +(12월 월급*5) 
	public int getAnnualGross() {
		yearm = this.salary * 17;
		return yearm;
	}
	
}
