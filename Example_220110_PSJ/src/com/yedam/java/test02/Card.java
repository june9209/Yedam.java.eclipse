package com.yedam.java.test02;

public class Card {
	 String cardNo ="5432-4567-9534-3657";
	 int validDate =20251203;
	 int cvc = 253;

	public Card(String cardNo, int validDate, int cvc) {
		this.cardNo = cardNo;
		this.validDate = validDate;
		this.cvc = cvc;
	}

	public String getCardNo() {
		return cardNo;
	}

	public int getValidDate() {
		return validDate;
	}

	public int getCvc() {
		return cvc;
	}
	public void showCardInfo() {
//		this.cardNo = "5432-4567-9534-3657";
//		this.validDate = 20251203;
//		this.cvc = 253;
		System.out.printf("카드정보 (Card No : %d, 유효기간 : %d, CVC : %d) ",cardNo,validDate,cvc);
	}
}
