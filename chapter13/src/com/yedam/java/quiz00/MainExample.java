package com.yedam.java.quiz00;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;

//문제1) 다음은 키보드로부터 상품 수와 상품 가격을 입력받아서
// 최고 가격을 가지는 제품과 해당 제품을 제외한 제품들의 총 합을 구하는 프로그램을 작성하세요.
// 1) 메뉴는 다음과 같이 구성하세요.
// 1.상품 및 가격입력 | 3.제품별 가격 | 4.분석 | 5.종료
// 2) 입력한 상품 수만큼 상품명과 해당 가격을 입력받을 수 있도록 구현하세요.
// 3) 제품별 가격을 출력하세요.
//		출력예시, "상품명 : 가격"
// 4) 분석기능은 최고 가격을 가지는 제품과 해당 제품을 제외한 제품들의 총합을 구합니다.
// 5) 종료 시에는 프로그램을 종료한다고 메세지를 출력하도록 구현하세요.
public class MainExample {//클래스, 상속, 인터페이스, 과제와 비슷한것//
	public static void main(String[] args) {
		
		

		List<Product> list = new ArrayList<Product>();

		boolean run = true;
		Scanner sc = new Scanner(System.in);
		while (run) {
			System.out.println("1.상품 및 가격입력 | 2.제품별 가격 | 3.분석 | 4.종료");
			int menu = sc.nextInt();

			switch (menu) {
			case 1:
				System.out.println("상품명 > ");
				String name = sc.next();
				System.out.println("가격>");
				int price = sc.nextInt();
				Product product = new Product(name, price);
				list.add(product);
				break;
			case 2:

				for (int i = 0; i < list.size(); i++) {
					System.out.println(list.get(i).getName() + " : " + list.get(i).getPrice());
				}
				break;
			case 3:
				int max = 0;
				for (int i = 0; i < list.size(); i++) {
					Product goods = list.get(i);
					if (max < goods.getPrice()) {
						max = goods.getPrice();

					}
				}
				String name1 = null;
				int sum = 0;
				for (int i = 0; i < list.size(); i++) {
					Product goods = list.get(i);
					if (max == goods.getPrice()) {
						name1 = goods.getName();
						continue;
					}
					sum += goods.getPrice();
				}
				System.out.println("최고 가격을 가진 제품은 : " + name1);
				System.out.println("최고가격을 제외한 제품의 총합은 : " + sum);
				break;
			case 4:
				run = false;
				System.out.println("---종료---");
				break;
			}
		}

	}

}
