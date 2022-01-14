package com.yedam.java.app;

import java.util.List;
import java.util.Scanner;

import com.yedam.java.book.Book;
import com.yedam.java.book.BookDAO;
import com.yedam.java.book.BookDAOImpl;

public class BookFrame {
	private Scanner sc = new Scanner(System.in);
	private BookDAO dao = BookDAOImpl.getInstance();

	public void run() {
		while (true) {
			// 메뉴출력
			menuPrint();
			// 메뉴선택
			int menuNo = menuSelect();
			// 각 기능별 실행
			if (menuNo == 1) {
				// 전체조회
				searchAll();
			} else if (menuNo == 2) {
				// 단건조회
				selectOne();
			} else if (menuNo == 3) {
				// 내용검색
				searchContent();
			} else if (menuNo == 4) {
				// 대여가능
				showIn();
			} else if (menuNo == 5) {
				// 책 대여
				rent();
			} else if (menuNo == 6) {
				// 책 반납
				bring();
			} else if (menuNo == 7) {
				// 책 등록
				insertBook();
			} else if (menuNo == 9) {
				// 프로그램 종료
				end();
				break;
			}

		}
	}

	public void showIn() {
		List<Book> list = dao.selectAll();
		for (Book book : list) {
			if(book.getBook_rental()==0) {
				System.out.println(book);
			}
		}
	}

	public void menuPrint() {
		System.out.println("======================================================================================");
		System.out.println("1.전체조회 | 2. 단건조회 | 3. 내용검색 | 4. 대여가능 | 5. 책 대여 | 6. 책 반납 | 7. 책 등록 | 9. 종료");
		System.out.println("======================================================================================");
		System.out.print("메뉴선택 > ");
	}

	public int menuSelect() {
		int menuNo = 0;
		try {
			menuNo = Integer.parseInt(sc.nextLine());
		} catch (Exception e) {
			System.out.println("없는 메뉴입니다.");
		}
		return menuNo;
	}

	public void searchAll() {
		List<Book> list = dao.selectAll();
		for (Book book : list) {
			System.out.println(book);
		}

	}

	public void selectOne() {
		System.out.print("책제목 > ");
		String bookName = sc.nextLine();
		Book book = dao.selectOne(bookName);
		System.out.println(book);
	}

	public void searchContent() {
		
		System.out.print("검색내용> ");
		String bookcontent = sc.nextLine();
		List<Book> list = dao.selectAll();
		for (Book book : list) {
			if (book.getBook_content().contains(bookcontent)) {
				System.out.println(book);
			}
		}
	}

	public void rent() {
		System.out.print("책 대여 > ");
		String name = sc.nextLine();
		Book book = dao.selectOne(name);
		if (book.getBook_rental() == 0) {
			book.setBook_rental(1);
			dao.out(book);
		} else {
			System.out.println("책이 대출되었습니다.");
		}

	}

	public void bring() {
		System.out.print("책 반납 > ");
		String name = sc.nextLine();
		Book book = dao.selectOne(name);
		if (book.getBook_rental() == 1) {
			book.setBook_rental(0);
			dao.in(book);
		} else {
			System.out.println("반납을왜하십니까");
		}

	}

	public void insertBook() {
		Book book = inputBookInfo();
		dao.insert(book);
	}

	public void end() {
		System.out.println("===프로그램 종료 ===");
	}

	public Book inputBookInfo() {
		Book book = new Book();

		System.out.println("책 제목 > ");
		book.setBook_name(sc.nextLine());

		System.out.print("책 저자 > ");
		book.setBook_writer(sc.nextLine());

		System.out.print("책 내용 > ");
		book.setBook_content(sc.nextLine());
		book.setBook_rental(0);

		return book;
	}

}