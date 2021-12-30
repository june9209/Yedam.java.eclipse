package memo01;

import java.util.Scanner;

public class Example01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String blank = "*";

		System.out.println("이등변 삼각형 만들기 ");
		System.out.print("행 개수 :  ");
		int line = Integer.parseInt(input.nextLine());
		//행 갯수
		for(int i=1;i<=line;i++)
		{	//1번쨰 행 공백 개수
			for(int j=1; j< line;j++)
			{
				System.out.print(" ");
			}
			for(int j=1; j<=i ; j++) {
				System.out.print("*");
			}
			for(int j=1 ; j< line; j++)
			{
				System.out.println("*");
			}
			
		System.out.println("");
		}
		
		
	}

}
