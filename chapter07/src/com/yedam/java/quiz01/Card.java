package com.yedam.java.quiz01;

public class Card {
	//필드
	static int cardNum = 1;
	private int CardNUM ;
	//생성자
	public Card() {
		this.CardNUM += cardNum;
		cardNum++;
	}
	public static int getcardNum() {
		return cardNum;
	}
	
	public static void setcardNum(int cardNum) {
		Card.cardNum = cardNum;
	}
	public int getCardNo() {
		return CardNUM;
	}
	public void setCardNo(int cardNum) {
		this.CardNUM = cardNum;
	}
	
	
	
	//메서드



	
	 
	
}
