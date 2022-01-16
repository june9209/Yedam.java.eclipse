package sideProject220114.account;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import sideProject220114.DAO.DAO;

public class RestaurantDAOImpl extends DAO implements RestaurantDAO {

	// 싱글톤 생성
	private static RestaurantDAO instance = new RestaurantDAOImpl();

	private RestaurantDAOImpl() {
	}

	public static RestaurantDAO getInstance() {
		return instance;
	}

	@Override
	// 일반회원가입
	public void userAccount(userField user) {
		int result = -2;
		try {
			connect();
			result = userCheck(user.getId());
			System.out.println(result);
			if (result == 1) {
				String userAccount = "INSERT INTO login VALUES (?,?,?)";
				pstmt = conn.prepareStatement(userAccount);
				pstmt.setString(1, user.getId());
				pstmt.setString(2, user.getPw());
				pstmt.setInt(3, user.getAu());
				pstmt.executeUpdate();
				System.out.println("계정이 생성되었습니다.:)");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}

	}

	public int userCheck(String userId) {
		String userCheck = "SELECT id FROM login";
		try {
			connect();
			pstmt = conn.prepareStatement(userCheck);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				if (rs.getString(1).equals(userId)) {
					System.out.println("존재하는 ID가 있습니다.");
					return 0;
				} else if(!(rs.getString(1).equals(userId))){
					return 1;
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return -2;
	}

	@Override
	// 로그인
	public int login(String userId, String userPassword) {
		String SQL = "SELECT pw FROM login WHERE id = ?";
		try {
			connect();
			pstmt = conn.prepareStatement(SQL);
			pstmt.setString(1, userId);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				if (rs.getString(1).equals(userPassword)) {
					System.out.println("로그인 성공");
					return 1;
				} else {
					System.out.println("PW가 틀렸습니다.");
					return 0;
				}
			}
			System.out.println("ID가 틀렸습니다.");
			return -1;
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return -2;
	}

	@Override
	// 유저정보확인
	public List<userField> selectAllUser() {
		List<userField> list = new ArrayList<>();

		try {
			connect();
			String selectAllUser = "SELECT * FROM login";
			pstmt = conn.prepareStatement(selectAllUser);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				userField user = new userField();
				user.setId(rs.getString("id"));
				user.setPw(rs.getString("pw"));
				user.setAu(rs.getInt("admin"));
				list.add(user);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return list;
	}

	@Override
	// 등록된가게
	public List<restaurantField> store() {
		List<restaurantField> list = new ArrayList<>();
		try {
			connect();
			String selectAll = "SELECT DISTINCT store from restaurant ";
			pstmt = conn.prepareStatement(selectAll);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				restaurantField store = new restaurantField();
				store.setRestaurant(rs.getString("store"));
				list.add(store);
			}
			System.out.println(list);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}

		return null;
	}

	@Override
	// 메뉴와 가격 추가
	public void enterStore(userField user) {
		try {
			connect();
			// 관리자권한을 가지는지 체크
			if (user.getAu() == 1) {
				restaurantField store = new restaurantField();
				String admin = "INSERT INTO restaurant VALUES(?,?,?) ";
				pstmt = conn.prepareStatement(admin);
				pstmt.setString(1, store.getRestaurant());
				pstmt.setString(2, store.getMenu());
				pstmt.setInt(3, store.getPrice());
				pstmt.executeUpdate();
				System.out.println("추가되었습니다.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}

	}

	@Override
	// 후기게시판
	public void post(PostField post) {
		try {
			connect();
			String upload = "INSERT INTO post VALUES(?,?)";
			pstmt = conn.prepareStatement(upload);
			pstmt.setString(1, post.getTitle());
			pstmt.setString(2, post.getContent());
			int result = pstmt.executeUpdate();
			System.out.println(result + "개의 게시글이 추가되었습니다.");

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
	}

}
