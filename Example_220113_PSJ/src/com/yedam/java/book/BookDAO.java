package com.yedam.java.book;

import java.util.List;


public interface BookDAO {
	//1.모든 책 출력
	public List <Book> selectAll();
	//2.단건조회
	public Book selectOne(String book_name);
	//3."혼자 공부하는 자바"인 책 정보를 출력
	public Book AloneJavaBook(String book_content);
	//3.자바가 포한된 책 정보 출력
	public Book JavaBook(String book_content);
	//4.대여가 가능 한 책 정보 출력
	public Book tfBook(int book_rental);
	//5.대여
	public void out(Book book);
	//6. 반납
	public void in(Book book);
	//7.책 등록
	public void insert(Book book);
	
}
