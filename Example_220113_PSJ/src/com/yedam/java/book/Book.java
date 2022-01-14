package com.yedam.java.book;

public class Book {
	private String book_name;
	private String book_writer;
	private String book_content;
	private int book_rental = 0;
	
	
	public String getBook_name() {
		return book_name;
	}
	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}
	public String getBook_writer() {
		return book_writer;
	}
	public void setBook_writer(String book_writer) {
		this.book_writer = book_writer;
	}
	public String getBook_content() {
		return book_content;
	}
	public void setBook_content(String book_content) {
		this.book_content = book_content;
	}
	public int getBook_rental() {
		return book_rental;
	}
	public void setBook_rental(int book_rental) {
		this.book_rental = book_rental;
	}
	@Override
	public String toString() {
		return "책 제목 : " + book_name + ", 저자명 : " + book_writer + ", 내용 : " + book_content
				+ ", 대여여부 : " + ((book_rental ==0)? "대여가능" : "대여중");
	}
	
	
	
}
