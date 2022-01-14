package sideProject220114.account;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import sideProject220114.DAO.DAO;

public class RestaurantDAOImpl extends DAO implements RestaurantDAO {

	//싱글톤 생성
		private static RestaurantDAO instance = new RestaurantDAOImpl();
		private RestaurantDAOImpl() {}
		public static RestaurantDAO getInstance() {
			return instance;
		}
	
	
	@Override
	//일반회원가입
	public void userAccount(userField user) {
		try {
			connect();
			String userAccount = "INSERT INTO login VALUES (?,?,?)";
			pstmt = conn.prepareStatement(userAccount);
			pstmt.setString(1,user.getId());
			pstmt.setString(2,user.getPw());
			pstmt.setInt(3,user.getAu());
			pstmt.executeUpdate();
			System.out.println("계정이 생성되었습니다.:)");
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally{
			disconnect();
		}
		
	}



	@Override
	//로그인
	public void login(userField user) {
		List<userField> userList = new ArrayList<>();
	
		try {
			connect();
			String userAccount = "SELECT * FROM login ";
			pstmt = conn.prepareStatement(userAccount);
			rs= pstmt.executeQuery();
			while(rs.next()) {
				userField user1 = new userField();
				user1.setId(rs.getString("id"));
				user1.setPw(rs.getString("pw"));
				user1.setAu(rs.getInt("admin"));
				
				userList.add(user1);
			}
			for (userField user1 : userList) {
				if(user1.getId() == "ID") {
					if(user1.getPw() == "PW") {
						
						System.out.println("로그인 성공");
					}else {
						System.out.println("다시 입력하세요.");
					}break;
				}else {
					System.out.println("다시 입력하세요.");
				}
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally{
			disconnect();
		}
	}

	@Override
	//등록된가게
	public List<restaurantField> store() {
		List<restaurantField> list = new ArrayList<>();
		try {
			connect();
			String selectAll = "SELECT DISTINCT store from restaurant ";
			pstmt = conn.prepareStatement(selectAll);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				restaurantField store = new restaurantField();
				store.setRestaurant(rs.getString("store"));
				
				list.add(store);
			}System.out.println(list);
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			disconnect();
		}
		
		return null;
	}

	@Override
	//메뉴와 가격 추가
	public void enterStore(userField user) {
		try {
			connect();
			//관리자권한을 가지는지 체크
			if(user.getAu()==1) {
				restaurantField store = new restaurantField();
				String admin = "INSERT INTO restaurant VALUES(?,?,?) ";
				pstmt = conn.prepareStatement(admin);
				pstmt.setString(1, store.getRestaurant());
				pstmt.setString(2, store.getMenu());
				pstmt.setInt(3, store.getPrice());
				pstmt.executeUpdate();
				System.out.println("추가되었습니다.");
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			disconnect();
		}
		
		
	}

	@Override
	//후기게시판
	public void post(PostField post) {
		try {
			connect();
			String upload = "INSERT INTO post VALUES(?,?)";
			pstmt = conn.prepareStatement(upload);
			pstmt.setString(1, post.getTitle());
			pstmt.setString(2, post.getContent());
			int result = pstmt.executeUpdate();
			System.out.println(result + "개의 게시글이 추가되었습니다.");
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			disconnect();
		}
	}

}
