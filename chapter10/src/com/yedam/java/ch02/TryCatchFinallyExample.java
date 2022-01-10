package com.yedam.java.ch02;

public class TryCatchFinallyExample {

	public static void main(String[] args) {
		try {
			Class clazz = Class.forName("Java.lang.String2"); // 일반예외
		} catch (ClassNotFoundException e) {
//			e.getMessage();
//			e.toString();
			e.printStackTrace();
		}

		String data1 = null;
		String data2 = null;

		try {
			data1 = args[0];
			data2 = args[1];
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("실행 매개값의 수가 부족합니다.");

		}

		try {
			int value1 = Integer.parseInt(data1); // 예외발생지점
			int value2 = Integer.parseInt(data2);

			int result = value1 + value2;
			System.out.println(value1 + "+" + value2 + "=" + result);
		} catch (NumberFormatException e) {
			System.out.println("숫자로 변환할 수 없습니다.");
		} finally {
			System.out.println("이건 항상 실행됩니다.");
		}
		System.out.println();
		try {
			data1 = args[0];
			data2 = args[1];

			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);

			int result = value1 + value2;
			System.out.println(value1 + "+" + value2 + "=" + result);
		} catch (NumberFormatException e) {
			System.out.println("숫자로 변환할 수 없습니다.");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("실행 매개값의 수가 부족합니다.");
		} catch (Exception e) {
			System.out.println("실행에 문제가 있습니다.");
		} finally {
			System.out.println("반드시 실행되어야 합니다.");
		}
		
		try {
			findClass();
		} catch (ClassNotFoundException e) {
			System.out.println("클래스가 존재하지 않습니다.");
		}
		
	}

	public static void findClass() throws ClassNotFoundException {
		Class clazz = Class.forName("Java.lang.String2"); // 일반예외
	}
}
