package com.yedam.java.package3;

public class Car {
	// 필드
	private int speed;
	private boolean stop;

	// 생성자

	// 메서드
	//속도가 0이하일떄 속도 0으로 고정 / 0이상이면 그 속도 그대로 출력
	public void setSpeed(int speed) {
		if (speed < 0) {
			this.speed = 0;
		} else {
			this.speed = speed;
		}
	}
	//현재속도 반환(출력)
	public int getSpeed() {
		return this.speed;
	}
	//
	public void setStop(boolean stop) {
		this.stop = stop;
		if(this.stop == true) {
			this.speed = 0;
		}
	}
	
	public boolean isStop() {
		
		
		return this.stop;
	}
}
