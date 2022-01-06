package com.yedam.java.quiz0;

import java.util.Scanner;

public class Example {

	public static void main(String[] args) {
		boolean run = true;
		Scanner sc = new Scanner(System.in);

		Goods_class[] list = null;
		int product = 0;

		while (run) {
			System.out.println("1.상품 수 | 2.가격입력 | 3.제품별 가격 | 4.분석 | 5.종료");
			int menu = sc.nextInt();

			switch (menu) {
			case 1:
				System.out.println("상품 수 >");
				product = sc.nextInt();
				list = new Goods_class[product];
				break;

			case 2:
				for (int i = 0; i < list.length; i++) {
					System.out.println("상품명 > ");
					String name = sc.next();
					System.out.println("가격>");
					int price = sc.nextInt();
					Goods_class goods = new Goods_class(name, price);
					list[i] = goods;
				}
				break;

			case 3:
				
				for (int i = 0; i < list.length; i++) {
					System.out.println(list[i].getName() + " : " + list[i].getPrice());
				}

				break;
			// 배열내 최고가격 출력, 그 제외 총합
			case 4:
				int max=0;
				for (int i = 0; i < list.length; i++) {
					Goods_class goods = list[i];
					if(max < goods.getPrice()) {
						max = goods.getPrice();
						
					}
				}
				String name = null;
				int sum =0;
				for (int i = 0; i < list.length; i++) {
					Goods_class goods = list[i];
					if(max == goods.getPrice()) {
						name = goods.getName();
						continue;
					}
					sum += goods.getPrice();
				}
				System.out.println("최고 가격을 가진 제품은 : " +name);
				System.out.println("최고가격을 제외한 제품의 총합은 : "+sum);
				break;
			case 5:
				run =false;
				System.out.println("---시스템 종료---");
				break;
			}

		}
	}

}
