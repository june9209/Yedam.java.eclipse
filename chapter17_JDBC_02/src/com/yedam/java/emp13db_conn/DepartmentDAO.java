package com.yedam.java.emp13db_conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DepartmentDAO {
	// DB 드라이버 , url정보
	private String jdbc_driver = "org.sqlite.JDBC";
	private String jdbc_url = "jdbc:sqlite:/c:/DEV/workspace/YedamDataBase.db";
	
	// 필드
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
	// 싱글톤
	private static DepartmentDAO instance = new DepartmentDAO();

	private DepartmentDAO() {}

	public static DepartmentDAO getInstance() {
		return instance;
	}

	

	// JDBC Driver 로딩
	// DB 연결
	// -> connect() 메서드
	public void connect() {
		try {
			Class.forName(jdbc_driver);
			
			conn = DriverManager.getConnection(jdbc_url);
		} catch (SQLException e) {
			System.out.println("드라이버 연결 실패");
		} catch (ClassNotFoundException e) {
			System.out.println("DB 연결 실패");
		}

	}

	// 자원헤재 -> disconnect() 메서드
	public void disconnect() {
		try {
			if (rs != null)
				rs.close();
			if (pstmt != null)
				pstmt.close();
			if (conn != null)
				conn.close();
		} catch (SQLException e) {
			System.out.println("rs,pstmt,conn이 정상적으로 끊어지지 않았습니다.");
		} finally {
			System.out.println("헤재 완료");
		}
	}
	// PreparedStatement 객체 생성
	// SQL 실행
	// 결과값 출력 or 연산

	// -> CRUD 메서드

	// 전체조회
	public List<Department> selectAll() {
		List<Department> list = new ArrayList<>();
		try {
			connect();
			String select = "SELECT * FROM emp13 ORDER by employee_id";
			pstmt = conn.prepareStatement(select);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				Department arl = new Department();
				arl.setEmployee_id(rs.getInt("employee_id"));
				arl.setFirst_name(rs.getString("first_name"));
				arl.setJob_id(rs.getString("job_id"));
				arl.setSalary(rs.getInt("salary"));
				arl.setCommission_pct(rs.getString("commission_pct"));
				arl.setDepartment_name(rs.getString("department_name"));
				arl.setLocation_id(rs.getInt("location_id"));
				
				list.add(arl);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return list;

	}

	// 단건조회
	public Department selectOne(int employee_id) {
		Department arl = null;
		try {
			connect();
			String selectOne = "SELECT * FROM emp13 WHERE employee_id = ?";
			pstmt = conn.prepareStatement(selectOne);
			pstmt.setInt(1, employee_id);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				arl = new Department();
				arl.setEmployee_id(rs.getInt("employee_id"));
				arl.setFirst_name(rs.getString("first_name"));
				arl.setJob_id(rs.getString("job_id"));
				arl.setSalary(rs.getInt("salary"));
				arl.setCommission_pct(rs.getString("commission_pct"));
				arl.setDepartment_name(rs.getString("department_name"));
				arl.setLocation_id(rs.getInt("location_id"));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return arl;

	}
	// 등록
	public void insert(Department arl) {
		try {
			connect();
			String insert = "SELECT INTO emp13 VALUES (?,?,?,?,?,?,?)";
			pstmt = conn.prepareStatement(insert);
			pstmt.setInt(1,arl.getEmployee_id());
			pstmt.setString(2,arl.getFirst_name());
			pstmt.setString(3, arl.getJob_id());
			pstmt.setInt(4, arl.getSalary());
			pstmt.setString(5, arl.getCommission_pct());
			pstmt.setString(6, arl.getDepartment_name());
			pstmt.setInt(7, arl.getLocation_id());
			int result = pstmt.executeUpdate();
			
			System.out.println(result + "건이 등록되었습니다.");
			
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			disconnect();
		}
		
	}
	// 수정
	public void update(Department arl) {
		try {
			connect();
			String update = "SELECT emp13 SET getEmployee_id = ? WHERE salary = ? ";
			pstmt = conn.prepareStatement(update);
			pstmt.setInt(1,arl.getEmployee_id());
			pstmt.setInt(2,arl.getSalary());
			
			int result = pstmt.executeUpdate();
			
			System.out.println(result + "건이 수정되었습니다.");
			
			
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			disconnect();
		}
	}
	// 삭제
	public void delete(int employee_id) {
		try {
			connect();
			String delete = "DELETE FROM emp13 WHERE Employee_id = ? ";
			pstmt = conn.prepareStatement(delete);
			pstmt.setInt(1, employee_id);
			
			int result = pstmt.executeUpdate();
			
			System.out.println(result + "건이 삭제 되었습니다.");
			
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			disconnect();
		}
	}
}
