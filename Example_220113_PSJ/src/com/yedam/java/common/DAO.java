package com.yedam.java.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DAO {
	private String Driver = "org.sqlite.JDBC";
	private String url = "jdbc:sqlite:/C:\\Users\\User\\Desktop\\SQLite/Book.db";
	
	protected Connection conn = null;
	protected PreparedStatement pstmt = null;
	protected ResultSet rs = null;
	
	//연결시
	public void connect() {
		try {
			Class.forName(Driver);
			conn = DriverManager.getConnection(url);
		}catch (ClassNotFoundException e) {
			System.out.println("JDBC Driver 로딩 실패");
		} catch (SQLException e) {
			System.out.println("DB 접속 실패");
		}
	}
	
	//끊을시
	public void disconnect() {
		try {
			if(rs != null)rs.close();
			if(pstmt != null) pstmt.close();
			if(conn != null) conn.close();
		}catch(SQLException e) {
			System.out.println("정상적으로 헤재되지 않았습니다.");
		}
	}
	
}
