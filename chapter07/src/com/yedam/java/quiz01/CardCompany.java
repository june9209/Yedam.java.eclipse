package com.yedam.java.quiz01;

public class CardCompany {
	static private CardCompany instance = new CardCompany();
	// �ʵ�
	private CardCompany() {}
	
	public static CardCompany getInstance() {
		return instance;
	}
	
	public Card createCard() {
		return new Card();
	}
//	

}

//	private static int cardNum = 1;
//	private int CardNUM;
//	Card myCard = new Card();
//
//	// ������
//	public CardCompany() {
//		cardNum++;
//		this.CardNUM += cardNum;
//		
//	}
//
//	//�޼���
//	
//
//	public static CardCompany getInstance() {
//		if (instance == null) {
//			instance = new CardCompany();
//		}
//		return instance;
//	}
//
//	public Card createCard() {
//		return new Card();
//	}