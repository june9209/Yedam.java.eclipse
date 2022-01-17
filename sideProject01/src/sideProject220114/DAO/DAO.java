package sideProject220114.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DAO {
	private String driver = "org.sqlite.JDBC";
	private String url = "jdbc:sqlite:/c:/DEV/workspace/restaurant.db";
	
	protected Connection conn = null;
	protected PreparedStatement pstmt = null;
	protected ResultSet rs = null;
	
	//connect
		public void connect() {
			try {
				Class.forName(driver);
				conn = DriverManager.getConnection(url);
			}catch(SQLException e) {
				System.out.println("드라이버 연결 실패");
			} catch (ClassNotFoundException e) {
				System.out.println("DB 연결 실패");
			}
		}
		
		
		//disconnect
		public void disconnect() {
			try {
				if(rs != null) rs.close();
				if(pstmt != null)pstmt.close();
				if(conn != null)conn.close();
			}catch(SQLException e)  {
				System.out.println("해제실패");
			}
		}
			
}
