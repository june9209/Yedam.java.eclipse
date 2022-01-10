package com.yedam.java.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		list.add("Java");
		list.add("JDBC");
		list.add("Servlet/JSP");
		list.add(2, "Database");
		list.add("iBATIS");
		list.add("Java");
		System.out.println(list);
		System.out.println(list.size());
		int size = list.size();
		System.out.println("총 객체 수 : " + size);
		
		String skill = list.get(2);
		System.out.println("2 : " + list.get(2));
		System.out.println();

		for(int i = 0; i< list.size(); i++) {
			String str = list.get(i);
			System.out.println(i+ " : " + str);
		}
		
		System.out.println("---------------------");
		list.remove(2); //"Database"삭제
		list.remove(2); //"Servlet/JSP"삭제
		list.remove("iBATIS"); //"iBATIS"삭제
		list.remove("Java");
		for(int i = 0; i< list.size(); i++) {
			System.out.println(i + " : " + list.get(i));
		}
		
	}

}
