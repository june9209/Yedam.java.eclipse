package com.yedam.java.ch000;

import java.util.ArrayList;
import java.util.List;


//북클래스 -> 라이브러리 
public class Library {
	//필드
	private List<Book> list;
	
	//생성자
	public Library() {
		list = new ArrayList<Book>();
	}
	
	//메서드

	//책 정보 입력
	public void addBook(String name, String author) {
		list.add(new Book(name, author));
	}
	//책 정보 전체 출력
	public void printBookList() {
		for(Book book : list) {
//			System.out.println(book.북번호()+ 이름+ 저자+ 대여가능여부(삼항연산자));
		}
	}
	//책 정보 단건 출력
	public void selectBookInfo(String name) {
		for(Book book : list) {
//			if(book.getBookName().equlas(name)){
//				번호+이름+저자+대여가능(교수님은삼항연산자사용)	
//		}
		}
	}
	//책 대여
	public void rentalBook(String name) {
		//책이름이 같고 렌탈이 되어있으면 대여중, 렌탈가능하면 렌탈되었습니다. 출력
	}
	
	//책 반납
	public void returnBook(String name) {
		for(Book book : list) {
//			if(책이름 같은지)
//			book.setRental(false);
//			System.out.println("반납되었습니다.");
		}
	}
	
	public void exit() {
		boolean run =false;
		System.out.println("프로그램 종료");
	}
	
	
}
