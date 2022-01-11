package com.yedam.java.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MainExample {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// 1. JDBC 드라이버 로딩
		Class.forName("org.sqlite.JDBC");
		// 2. DB 서버 접속
		String url = "jdbc:sqlite:/c:/DEV/workspace/YedamDataBase.db";
		Connection conn = DriverManager.getConnection(url);

		/****************** INSERT *****************/
		// 3. Statement or PreparedStatement 객체 생성
		String insert = "INSERT INTO emp13 VALUES (?,?,?,?,?,?,?)";
		PreparedStatement pstmt = conn.prepareStatement(insert);
		pstmt.setInt(1, 300);
		pstmt.setString(2, "Jenee");
		pstmt.setString(3, "AD_SDDT");
		pstmt.setInt(4, 3000);
		pstmt.setDouble(5, 0.3);
		pstmt.setString(6, "IT");
		pstmt.setInt(7, 3000);

		// 4. SQL 실행
		int result = pstmt.executeUpdate();

		// 5. 결과값 출력 or 연산
		System.out.println("insert 결과 : " + result);

		/****************** UPDATE *****************/
		// 3. Statement or PreparedStatement 객체 생성
		String update = "UPDATE emp13 SET first_name = ? WHERE employee_id = ?";
		pstmt = conn.prepareStatement(update);
		pstmt.setString(1, "Park");
		pstmt.setInt(2, 300);
		// 4. SQL 실행
		result = pstmt.executeUpdate();
		// 5. 결과값 출력 or 연산
		System.out.println("UPDATE 결과 > " + result);

		/****************** SELECT *****************/
		// 3. Statement or PreparedStatement 객체 생성
		String select = "SELECT * FROM emp13 ORDER BY employee_id";
		pstmt = conn.prepareStatement(select);

		// 4. SQL 실행
		ResultSet rs = pstmt.executeQuery();
		// 5. 결과값 출력 or 연산
		while (rs.next()) {
			String name = "ID : " + rs.getInt("employee_id") + ", 급여 : " + rs.getInt("SALARY") + ", 부서 이름 : "
					+ rs.getString("department_name") + ", 이름 : " + rs.getString("first_name");
			System.out.println(name);
		}

		/****************** DELETE *****************/
		// 3. Statement or PreparedStatement 객체 생성
		String delete = "DELETE FROM emp13 WHERE employee_id = ?";
		pstmt = conn.prepareStatement(delete);
		pstmt.setInt(1, 800);

		// 4. SQL 실행
		result = pstmt.executeUpdate();

		// 5. 결과값 출력 or 연산
		System.out.println("delete 결과 : " + result);

		// 6. 자원해제
		if (rs != null)
			rs.close();
		if (pstmt != null)
			pstmt.close();
		if (conn != null)
			conn.close();
	}

}
