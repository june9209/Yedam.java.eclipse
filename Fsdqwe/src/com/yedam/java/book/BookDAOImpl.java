package com.yedam.java.book;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.yedam.java.common.DAO;

public class BookDAOImpl extends DAO implements BookDAO {
	// 싱글톤
	private static BookDAO instance = new BookDAOImpl();

	private BookDAOImpl() {
	}

	public static BookDAO getInstance() {
		return instance;
	}

	@Override
	public List<Book> selectAll() {
		List<Book> list = new ArrayList<>();
		
		try {
			connect();
			String selectall = "SELECT * FROM book";
			pstmt = conn.prepareStatement(selectall);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				Book book = new Book();
				book.setBook_name(rs.getString("book_name"));
				book.setBook_writer(rs.getString("book_writer"));
				book.setBook_content(rs.getString("book_content"));
				book.setBook_rental(rs.getInt("book_rental"));

				list.add(book);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return list;
	}

	@Override
	public Book selectOne(String book_name) {
		Book book = null;
		try {
			connect();
			String selectOne = "SELECT * FROM book WHERE book_name = ?";
			pstmt = conn.prepareStatement(selectOne);
			pstmt.setString(1, book_name);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				book = new Book();
				book.setBook_name(rs.getString("book_name"));
				book.setBook_writer(rs.getString("book_writer"));
				book.setBook_content(rs.getString("book_content"));
				book.setBook_rental(rs.getInt("book_rental"));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}

		return book;
	}

	@Override
	//String searchAJ = "SELECT * FROM book WHERE book_content LIKE %혼자 공부하는 자바%";
	public List<Book> AloneJavaBook(String bookcontent) {
		List<Book> list = new ArrayList<>();
		Book book = null;
		try {
			connect();
			String searchAJ = "SELECT * FROM book WHERE book_content = ?";
			pstmt = conn.prepareStatement(searchAJ);
			pstmt.setString(1, bookcontent);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				book = new Book();
				book.setBook_name(rs.getString("book_name"));
				book.setBook_writer(rs.getString("book_writer"));
				book.setBook_content(rs.getString("book_content"));
				book.setBook_rental(rs.getInt("book_rental"));
				
				list.add(book); 
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return list;
	}

	@Override
	public Book JavaBook(String book_content) {
		Book book = null;
		try {
			connect();
			String searchJ = "SELECT * FROM book WHERE book_content LIKE %자바%";
			pstmt = conn.prepareStatement(searchJ);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				book = new Book();
				book.setBook_name(rs.getString("book_name"));
				book.setBook_writer(rs.getString("book_writer"));
				book.setBook_content(rs.getString("book_content"));
				book.setBook_rental(rs.getInt("book_rental"));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return book;
	}

	
	
	@Override
	public void out(Book book) {
		try {
			connect();
			String out = "UPDATE book set book_rental = ? WHERE book_name = ?";
			pstmt = conn.prepareStatement(out);
			
			pstmt.setInt(1, book.getBook_rental());
			pstmt.setString(2, book.getBook_name());
			int result = pstmt.executeUpdate();
			
			System.out.println(result +"권이 대여되었습니다. ");
			
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			disconnect();
		}

	}

	@Override
	public void in(Book book) {
		try {
			connect();
			String in = "UPDATE book set book_rental = ? WHERE book_name = ?";
			pstmt = conn.prepareStatement(in);
			
			pstmt.setInt(1, book.getBook_rental());
			pstmt.setString(2, book.getBook_name());
			
			int result = pstmt.executeUpdate();
			
			System.out.println(result + "권이 반납되었습니다.");
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			disconnect();
		}
	}

	@Override
	public void insert(Book book) {
		try {
			connect();
			String insert = "INSERT INTO book VALUES (?,?,?,?)";
			pstmt = conn.prepareStatement(insert);
			pstmt.setString(1, book.getBook_name());
			pstmt.setString(2, book.getBook_writer());
			pstmt.setString(3, book.getBook_content());
			pstmt.setInt(4,book.getBook_rental());
			
			int result = pstmt.executeUpdate();
			System.out.println(result + "이 등록되었습니다.");
				
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			disconnect();
		}

	}

}