package com.yedam.java.ch0502;

import java.util.Scanner;

public class Quiz000 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
 		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();

		if (num1 < num2) {
			if (num2 < num3) {
				System.out.println(num1 + " " + num2 + " " + num3);
			} else if (num3 < num2 && num1 < num3) {
				System.out.println(num1 + " " + num3 + " " + num2);
			} else {
				System.out.println(num3 + " " + num1 + " " + num2);
			}

		} else if (num2 < num3) {
			if (num3 < num1) {
				System.out.println(num2 + " " + num3 + " " + num1);
			} else if (num1 < num3 && num2 < num1) {
				System.out.println(num2 + " " + num1 + " " + num3);
			}

		} else if (num3 < num2) {
			if (num2 < num1) {
				System.out.println(num3 + " " + num2 + " " + num1);
			}
		}

		
	}

}
