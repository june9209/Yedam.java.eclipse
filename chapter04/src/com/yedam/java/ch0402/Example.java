package com.yedam.java.ch0402;

import java.util.Scanner;

public class Example {

	public static void main(String[] args) {
		//for문
		
		//예제1 - 0부터 90까지 10단위로 출력
		int i = 0;
		for (  ; i<=90; i+=10)
		{
			System.out.println(i);
			
		}
		
		//예제2 = 0부터 20까지짝수만 출력
		 i = 0;
		for(; i <= 20; i++)
		{
		     if(i %2==0)
		     {
		    	 System.out.println(i);
		     }
		}
	
		//예제3 - 숫자를 5번 입력하고, 입력받을 떄 마다 더해지는 값을 출력
		Scanner input = new Scanner(System.in);
		int fw=0;
		System.out.println("숫자 5개를 입력하세요.");
		for(int f = 1; f<=5;f++)
		{
			System.out.println("숫자를 입력하세요.");
			int num = input.nextInt();
			
			System.out.println("출력"+ (fw += num));
		}
		
		//예제4 - 1부터 사용자가 입력한 숫자까지 합계
		
		i =1;
		fw = 0;
		System.out.println("(팩토리얼 수열)숫자를 입력하시오 : ");
		int pernum = input.nextInt();
		
		for(;i<=pernum;i++)
		{
			fw += pernum;
		}System.out.println("출력 : "+fw );
		
	}

}
