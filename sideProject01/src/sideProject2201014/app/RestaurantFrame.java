package sideProject2201014.app;

import java.util.List;
import java.util.Scanner;

import sideProject220114.account.RestaurantDAO;
import sideProject220114.account.RestaurantDAOImpl;
import sideProject220114.account.userField;

public class RestaurantFrame {
	private static Scanner sc = new Scanner(System.in);
	private static RestaurantDAO single = RestaurantDAOImpl.getInstance();

	public static void run() {
		
		
		
		while (true) {
			menuPrint1();
			int result = 0;
			int menuNo1 = menuSelect();
			if (menuNo1 == 1) {
				// 회원가입
				inserUser();
			} else if (menuNo1 == 2) {
				// 로그인
				result =login();
					
			}  else if (menuNo1 == 9) {
				// 프로그램 종료
				end();
				break;
			}
		
			//로그인 성공시
			if (result == 1) {
				menuPrint2();
				int menuNo2 = menuSelect();
				if (menuNo2 == 1) {
					// 등록된 가게
					GO();
				} else if (menuNo2 == 2) {
					// 후기게시판
					post();
				} else if (menuNo2 == 3) {
					// 가게추가(메뉴추가)
					insertmenu();
				}
			}
		}
		
	}

	public static void menuPrint1() {
		System.out.println("-----------------------------");
		System.out.println("1. 회원가입 | 2. 로그인 |  9. 종료");
		System.out.println("-----------------------------");
		System.out.print("메뉴선택 > ");

	}

	public static void menuPrint2() {
		System.out.println("-----------------------------------------");
		System.out.println("1. 등록된 가게 | 2. 후기게시판 | 3. 가게(메뉴)추가 ");
		System.out.println("-----------------------------------------");
		System.out.print("메뉴선택 > ");
	}

	public void searchAllUser() {
		List<userField> list = single.selectAllUser();
		for (userField user : list) {
			System.out.println(user);
		}
	}

	public static int menuSelect() {
		int menuNo = 0;
		try {
			menuNo = Integer.parseInt(sc.nextLine());
		} catch (Exception e) {
			System.out.println("없는 메뉴입니다.");
		}

		return menuNo;

	}

	public static void inserUser() {
		userField user = inputUserInfo();
		RestaurantDAOImpl.getInstance().userAccount(user);
	}

	public static userField inputUserInfo() {
		String answer;
		int admintf;

		while (true) {
			System.out.println("판매자 계정으로 만드시겠습니까? y/n");
			answer = sc.nextLine();
			try {
				if (answer.toLowerCase().equals("y")) {
					admintf = 1;
					break;
				} else if (answer.toLowerCase().equals("n")) {
					admintf = 0;
					break;
				} else {
					System.out.println("다시 입력하세요.");
				}
			} catch (Exception e) {
				System.out.println("다시 입력하세요.");
			}
		}

		userField user = new userField();

		System.out.print("ID > ");
		user.setId(sc.nextLine());
		System.out.print("PW > ");
		user.setPw(sc.nextLine());
		user.setAu(admintf);

		return user;

	}

	public static int login() {
		int result = 0;
		String userId = "";
		String userPw = "";
//		userField user = inputLoginInfo();
		System.out.print("ID를 입력하세요 > ");
		userId = sc.nextLine();
		System.out.print("PW를 입력하세요 > ");
		userPw = sc.nextLine();

		result =  RestaurantDAOImpl.getInstance().login(userId, userPw);
		System.out.println(result);
		return result;

	}

//	public static userField inputLoginInfo() {
//		List<userField> list = single.selectAllUser();
//		String pw = "";
//		String id = "";
//		System.out.print("ID를 입력하세요 > ");
//		id = sc.nextLine();
//		for (userField user : list) {
//			if (user.getId().contains(id)) {
//				System.out.print("ID입력 성공");
//				if (user.getPw().contains(pw)) {
//
//				} else {
//					System.out.println("비밀번호 입력 오류");
//				}
//			} else {
//				System.out.println("해당하는 ID가 없습니다.");
//			}
//		}
//
////		if (loginUser == null) {
////			System.out.println("회원정보가 없습니다." + 
////								"\n다시한번 확인해주세요.");
////		} else if (loginUser.getId().equals(id)) {
////			System.out.print("비밀번호를 입력하세요 > ");
////			pw = sc.nextLine();
////		}
//		return null;
//	}
//
	/*
	 * public static void loginUser(){ User user = inputLoginInfo(); User loginUser=
	 * UserDAOImpl.getInstance().selectUserInfo(user); if(loginUser == null){
	 * system.out.println("회원정보를 확인해주세요.") } else if (loginUser.getAuth() == 0) {
	 * //일반유저일때 실행하는 메뉴 new AccountFrame().run();
	 * 
	 * }else if(loginUser.getAuth() ==1) { //일반회원일떄 실행하는 메뉴 } }
	 */

	public static void GO() {

	}

	public static void post() {
		// TODO Auto-generated method stub

	}

	public static void insertmenu() {
		// TODO Auto-generated method stub

	}

	public static void end() {
		System.out.println("===프로그램 종료");
	}

}
