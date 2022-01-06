package com.yedam.java.quiz0;

public class Won2Dollar extends Converter{
	
	public Won2Dollar(int won) {
		ratio = 1.0/won;
	}

	@Override
	protected double convert(double src) {
		return src*ratio;
	}

	@Override
	protected String getSrcString() {
		return "원";
	}

	@Override
	protected String getDestString() {
		return "달러";
	}

}
