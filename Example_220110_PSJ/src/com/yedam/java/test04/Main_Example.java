package com.yedam.java.test04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main_Example {

	public static void main(String[] args) {
		boolean run = true;
		Scanner sc = new Scanner(System.in);
		List<Do_it> d_list = new ArrayList<>();
		Do_it d = null;

		while (run) {

			System.out.println("=== 1.할일입력 | 2.전체조회 | 3. 할일조회 | 4. 할일완료 | 5. 종료 ===");
			System.out.print("선택>");
			int menu = Integer.parseInt(sc.nextLine());
			switch (menu) {
			case 1:
				System.out.print("할 일 > ");
				String name = sc.nextLine();
				d = new Do_it(name);
				d_list.add(d);
				break;
			case 2:
				for (Do_it do_it : d_list) {
					System.out.println(do_it.num + "번 " + do_it.do_it + " " + (do_it.isTf() ? "완료" : "미완료"));
				}
				break;

			case 3:
				for (Do_it do_it : d_list) {
					if (do_it.isTf() == false) {
						System.out.println(do_it.num + "번 " + do_it.do_it + " " + (do_it.isTf() ? "완료" : "미완료"));
					}
				}

				break;
			case 4:
				System.out.print("완료할 할 일을 선택해주세요");
				int num1 = Integer.parseInt(sc.nextLine());
				
				for (Do_it do_it : d_list) {
					
						if(do_it.getNum() == num1) {
							do_it.setTf(true);
							System.out.println("해당 할 일을 완료처리하였습니다.");
							break;
						}else {
							System.out.println("해당 할 일은 이미 완료처리하였습니다.");
						}
					} 
				break;

			case 5:
				run = false;
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		}
	}

}
