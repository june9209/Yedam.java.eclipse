package com.yedam.java.test02;

public class TossCard extends Card {
	private final String company = "Toss";
	private String cardStaff;

	public TossCard(String cardNo, int validDate, int cvc, String cardStaff) {
		super(cardNo, validDate,cvc);
		
		this.cardNo = cardNo;
		this.validDate = validDate;
		this.cvc = cvc;
		this.cardStaff = cardStaff;
	}

	@Override
	public void showCardInfo() {
		this.cardStaff = "신빛용";
		System.out.printf("카드정보 - Card No, %d",cardNo);
		System.out.printf("담당직원 %d,%d",company,cardStaff);
	}

}
