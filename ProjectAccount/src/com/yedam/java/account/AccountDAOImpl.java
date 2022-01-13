package com.yedam.java.account;

import java.sql.SQLException;

import com.yedam.java.common.DAO;

public class AccountDAOImpl extends DAO implements AccountDAO {
	//우선 싱글톤 먼저 생성
	
	private static AccountDAO instance = new AccountDAOImpl();
	private AccountDAOImpl() {}
	public static AccountDAO getInstance() {
		return instance;
	}
	
	@Override
	public Account selectAccountInfo(long accountNo) {
		Account account = null;
		try {
			connect();
			String select = "SELECT * FROM account WHERE accountno = ?";
			pstmt = conn.prepareStatement(select);
			pstmt.setLong(1, accountNo);
			
			rs = pstmt.executeQuery();
			if(rs.next()) {
				account = new Account();
				account.setAccountNo(rs.getLong("accountno"));
				account.setAccountOwner(rs.getString("accountowner"));
				account.setAccountPassword(rs.getString("accountpassword"));
				account.setAccountBalance(rs.getLong("accountbalance"));
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			disconnect();
		}
		return account;
	}

	@Override
	public long selectAccountno(Account account) {
		long accountNo = 0;
		
		try {
			connect();
			String select = ("SELECT accountNo FROM account WHERE accountowner = ?  AND accountpassword = ? ORDER BY accountno DESC");
			pstmt = conn.prepareStatement(select);
			pstmt.setString(1, account.getAccountOwner());
			pstmt.setString(2, account.getAccountPassword());
			
			rs=pstmt.executeQuery();
			if(rs.next()) {
				accountNo = rs.getLong("accountno");
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			disconnect();
		}
		
		return accountNo ;
	}

	@Override
	public void createAccount(Account account) {
		try {
			connect();
			String insert = "INSERT INTO account (accountowner, accountpassword, accountbalance) VALUES (?,?,?)";
			pstmt = conn.prepareStatement(insert);
			pstmt.setString(1, account.getAccountOwner());
			pstmt.setString(2, account.getAccountPassword());
			pstmt.setLong(3, account.getAccountBalance());
			
			int result = pstmt.executeUpdate();
			
			if(result > 0 ) {
				System.out.println("계좌가 개설되었습니다.");
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			disconnect();
		}

	}

	@Override
	public void updateAccount(Account account) {
		try {
			connect();
			String update = "UPDATE account SET accountbalance = accountbalance + ? WHERE accountno = ?";
			pstmt = conn.prepareStatement(update);
			pstmt.setLong(1, account.getAccountBalance());
			pstmt.setLong(2, account.getAccountNo());
			
			int result = pstmt.executeUpdate();
			
			if(result > 0) {
				System.out.println("정상적으로 처리되었습니다.");
				
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally{
			disconnect();
		}
	}

}
