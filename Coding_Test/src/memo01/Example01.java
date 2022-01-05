package memo01;

import java.util.Scanner;

public class Example01 {
static int num =1;

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			num += num;
			num++;
			System.out.println(num);
		}System.out.println(num);
		
	}

}
