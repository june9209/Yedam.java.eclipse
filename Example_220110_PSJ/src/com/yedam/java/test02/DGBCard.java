package com.yedam.java.test02;

public class DGBCard extends Card {
	private final String company = "대구은행";
	private String cardStaff;
	public DGBCard(String cardNo, int validDate, int cvc, String cardStaff) {
		super(cardNo, validDate,cvc);
		
		this.cardNo = cardNo;
		this.validDate = validDate;
		this.cvc = cvc;
		this.cardStaff = cardStaff;
	}
	@Override
	public void showCardInfo() {
		
		System.out.printf("담당직원 - %d, %d", cardStaff,company);
	}
	
}
