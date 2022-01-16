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
		boolean result;
		try {
			result = userCheck(user.getId());
			System.out.println(result);
			connect();
			if (result == true) {
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

	public boolean userCheck(String userId) {
		String userCheck = "SELECT id FROM login WHERE id = ?";
		try {
			connect();
			pstmt = conn.prepareStatement(userCheck);
			pstmt.setString(1, userId);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				if (rs.getString(1).equals(userId)) {
					System.out.println("존재하는 ID가 있습니다.");
					return false;
				} else {
					return true;
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return true;
	}

	@Override
	// 로그인
	public int login(String userId, String userPassword) {
		String SQL = "SELECT pw,admin FROM login WHERE id = ?";
		try {
			connect();
			pstmt = conn.prepareStatement(SQL);
			pstmt.setString(1, userId);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				if (rs.getString(1).equals(userPassword)) {
					if (rs.getInt(2) == 1) {
						System.out.println("관리자 로그인 성공");
						return 1;
					} else if (rs.getInt(2) == 0) {
						System.out.println("일반로그인성공");
						return 2;
					}
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

	public List<restaurantField> searchRestaurant(String store) {
		List<restaurantField> list = new ArrayList<>();

		try {
			connect();
			String searchRestaurant = "SELECT menu,price,menuNo FROM restaurant WHERE store =?";
			pstmt = conn.prepareStatement(searchRestaurant);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				restaurantField restaurant = new restaurantField();
				restaurant.setRestaurant(rs.getString("store"));
				restaurant.setMenu(rs.getString("menu"));
				restaurant.setPrice(rs.getInt("price"));
				restaurant.setMenuNo(rs.getInt("menuNo"));
				list.add(restaurant);
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

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}

		return list;
	}

	
	@Override
	// 메뉴와 가격 추가
	public void enterStore(restaurantField menu) {
		try {
			connect();
			String admin = "INSERT INTO restaurant VALUES(?,?,?,?)";
			pstmt = conn.prepareStatement(admin);
			pstmt.setString(1, menu.getRestaurant());
			pstmt.setString(2, menu.getMenu());
			pstmt.setInt(3, menu.getPrice());
			pstmt.setInt(4, menu.getMenuNo());
			int result = pstmt.executeUpdate();
			System.out.println("메뉴 " + result + "개가 추가되었습니다.");

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}

	}

	@Override
	// 게시판 등록
	public void post(PostField post) {
		try {
			connect();
			String upload = "INSERT INTO post VALUES(?,?,?)";
			pstmt = conn.prepareStatement(upload);
			pstmt.setString(1, post.getTitle());
			pstmt.setString(2, post.getContent());
			pstmt.setInt(3, post.getPw());
			int result = pstmt.executeUpdate();
			System.out.println(result + "개의 게시글이 추가되었습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
	}

	@Override
	public void postDelete(String postTitle) {
		try {
			connect();
			String delete = "DELETE FROM post WHERE title = ?";
			pstmt = conn.prepareStatement(delete);
			pstmt.setString(1, postTitle);
			pstmt.executeUpdate();
				
		}catch(

	SQLException e)
	{
		e.printStackTrace();
	}finally
	{
		disconnect();

	}
	}

	@Override
	public boolean checkPw(String title, int checkPw) {
		String check = "SELECT password FROM post WHERE title = ? ";
		try {
			connect();
			pstmt = conn.prepareStatement(check);
			pstmt.setString(1, title);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				if (rs.getInt("password") == checkPw) {
					System.out.println("비밀번호 입력 성공");
					return true;
				} else if (!(rs.getInt("password") == checkPw)) {
					System.out.println("비밀번호 입력 실패");
					return false;
				}
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return false;
	}

	@Override
	public void postUpdate(String newtitle, String newcontent, String postTitle) {
		try {
			connect();
			String update = "UPDATE post SET title =? , content = ? WHERE title = ?";
			pstmt = conn.prepareStatement(update);
			pstmt.setString(1, newcontent);
			pstmt.setString(2, newtitle);
			pstmt.setString(3, postTitle);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
	}

	@Override
	public List<PostField> postList() {
		List<PostField> list = new ArrayList<>();
		try {
			connect();
			String selectall = "SELECT * FROM post";
			pstmt = conn.prepareStatement(selectall);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				PostField post = new PostField();
				post.setTitle(rs.getString("title"));
				post.setContent(rs.getString("content"));
				post.setPw(rs.getInt("password"));
				post.toString();
				list.add(post);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}

		return list;
	}

}
