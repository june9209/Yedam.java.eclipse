package com.yedam.java.example;

import java.util.Scanner;

public class Example3_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1부터 10사이의 임의의 숫자를 발생시키빈다.
		// 총 3번의 기회가 있고
		// 기회 내에 성공 못할 시 프로그램 종료
		// up&down 게임
		Scanner input = new Scanner(System.in);

		int dice = (int) (Math.random() * 10) + 1;
		int count = 0;
		while (count <= 3) {
			count++;
			System.out.println("up & down 게임 ");
			System.out.print("숫자를 입력하시오");
			int num = input.nextInt();
			if(num == dice)
			{
				
			}
		}
	}

}
