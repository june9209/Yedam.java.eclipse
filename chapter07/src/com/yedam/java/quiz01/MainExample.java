package com.yedam.java.quiz01;

public class MainExample {

	public static void main(String[] args) {
		System.out.println("======= ����1��");
		// ����1) ��ħ ��ٱ濡 �� ���� 4,000���� ���� ���ٹ濡�� �Ƹ޸�ī�븦 ���̽��ϴ�.
		// �� ���� ��ٹ濡�� 4,500���� ���� �󶼸� �� ���̽��ϴ�.
		// �� ������ �����غ�����.
		Person kim = new Person("Kim", 8000);
		Person lee = new Person("Lee", 9800);

		StarCafe starCafe = new StarCafe("���ٹ� 1ȣ��");
		kim.buyCoffee(starCafe);
		starCafe.ShowInfo();
		
		System.out.println();
		BeanCafe beanCafe = new BeanCafe("��ٹ� ��������");
		lee.buyCoffee(beanCafe);
		beanCafe.ShowInfo();
		
		System.out.println();
		kim.showInfo();
		lee.showInfo();
		
		System.out.println();
		System.out.println("======= ����2��");		
		//����2) ī�� ȸ�翡�� ī�带 �߱��� ���̵� ī�� ���� ��ȣ�� �ο����ݴϴ�.
		//		ī�尡 ������ ������ ī�� ��ȣ�� �ڵ����� ������ �� �ֵ��� ī�� Ŭ������ ����� �����غ�����.
		Card kbCard = new Card();
		Card kdbCard = new Card();
		System.out.println("kbCard : " + kbCard.getCardNo());
		System.out.println("kdbCard : " + kdbCard.getCardNo());
		
		System.out.println("======= ����3��");
		//����3) ����2���� ������ ���뿡 ī�� ȸ�� Ŭ���� CardCompany�� �̱��� ������ ����Ͽ� �����غ�����.
		CardCompany company = CardCompany.getInstance();
		Card firstCard = company.createCard();
		Card secondCard = company.createCard();
		System.out.println("ù��° ī�� : " + firstCard.getCardNo());
		System.out.println("�ι�° ī�� : " + secondCard.getCardNo());
		
	}

}
