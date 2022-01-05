package com.yedam.java.example1;

public class Subway {
	// 필드
	private int money;
	private int percount;
	private String Ho_Sun;

	// 생성자
	public Subway(String Ho_sun) {
		this.Ho_Sun = Ho_sun;
	}

	// 메서드
	public void take(int money) {
		this.money += money;
		this.percount++;
	}
	public void showInfo() {
		System.out.println("지하철" + Ho_Sun+ "승객은 "+percount + "명 이고 , 수입은" + money+"입니다.");
				
	}
	
}
