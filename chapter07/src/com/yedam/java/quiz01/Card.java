package com.yedam.java.quiz01;

public class Card {
	//�ʵ�
	static int cardNum = 1;
	private int CardNUM ;
	//������
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
	
	
	
	//�޼���



	
	 
	
}
