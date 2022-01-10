package com.yedam.java.ch04.string;

import java.io.UnsupportedEncodingException;

public class StringExample {

	public static void main(String[] args) {
		byte[] bytes = { 72, 101, 108, 108, 111, 32, 74, 97, 118, 97 };
		String str1 = new String(bytes);
		System.out.println(str1);
		System.out.println(new String(bytes));

		String str2 = new String(bytes, 6, 4);
		System.out.println(str2);
		System.out.println(new String(bytes, 6, 4));

		// charAt()
		String ssn = "010624-1230123";
		char gender = ssn.charAt(7);
		switch (gender) {
		case '1':
			System.out.println("남자입니다.");
			break;
		case '3':
			System.out.println("00년생 이후 태어났습니다.");
			break;
		case '2':
			System.out.println("여자입니다.");
			break;
		case '4':

		}

		// getBytes()
		String str = "안녕하세요" + "";
		byte[] bytesx = str.getBytes();
		System.out.println("bytesX.length : " + bytesx.length);

		try {
//			byte[] bytesY = str.getBytes("ECU-KR");
//			System.out.println("bytesY.lenght : " + bytesY.length);
//			String strY = new String(bytesY);
//			System.out.println("bytesY -> strY : " + strY);
			
			byte[] bytesZ = str.getBytes("UTF-16");
			System.out.println("bytesZ.length : " + bytesZ.length);
			String strZ = new String(bytesZ, "UTF-16");
			System.out.println("bytesZ - > strZ : " + strZ);
			
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		
		System.out.println("");
		
		//indexOf()
		String subject = "자바 프로그래밍";
		
		int location = subject.indexOf("프로그래밍");
		System.out.println(location);
		
		if(subject.indexOf("JAVA") != -1) {
			System.out.println("JAVA가 포함되어 있습니다.");
		}else {
			System.out.println("JAVA가 포함되어 있지 않습니다.");
		}
	
		System.out.println();
		
		//length()
		ssn = "7305459875568";
		int length = ssn.length();
		if(length == 13) {
			System.out.println("주민번호 자릿수가 맞습니다.");
		}else {
			System.out.println("주민번호 자릿수가 틀립니다.");
		}
		
		System.out.println();
		//replace()
		String oldStr = "자바는 개체 지향 언어입니다. 자바는 풍부한 API를 지원합니다.";
		System.out.println(oldStr);
		System.out.println(oldStr.replace("자바","JAVA"));
		
		System.out.println();
		//subString()
		ssn = "880815-1234567";
		
		String firstName = ssn.substring(0,6);
		System.out.println(firstName);
		String secondName = ssn.substring(7);
		System.out.println(secondName);
		
		System.out.println();
		//toLowerCase(), toUpperCase()
		String strA = "Java Programmming";
		String strB = "JAVA Programmming";
		System.out.println(strA);
		System.out.println(strB);
		
		System.out.println(strA.equals(strB));
		
		String lowerStr1 = strA.toLowerCase();
		String lowerStr2 = strB.toLowerCase();
		
		System.out.println(lowerStr1.equals(lowerStr2));
		
		System.out.println(strA.equalsIgnoreCase(strB));
		
		System.out.println();
		//trim()
		String tel1 = "          02";
		String tel2 = "        1323        ";
		String tel3 = "1234            ";
		
		String telA =tel1+ tel2 + tel3;
		System.out.println(telA);
		
		String trim1 = tel1.trim();
		String trim2 = tel2.trim();
		String trim3 = tel3.trim();
		System.out.println(trim1);
		System.out.println(trim2);
		System.out.println(trim3);
		
		
		System.out.println(telA.trim());
		
		String telB = tel1.trim() + tel2.trim() + tel3.trim();
		System.out.println(telB);
		
	}

}
