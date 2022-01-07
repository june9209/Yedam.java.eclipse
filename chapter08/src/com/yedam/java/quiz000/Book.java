package com.yedam.java.quiz000;

public class Book {
	private String name;
	private String from;
	


	public Book(String name, String from) {
		this.name = name;//책이름
		this.from = from;//저자
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}
}
