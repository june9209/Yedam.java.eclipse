package sideProject2201014.app;

import java.util.Scanner;

import sideProject220114.account.RestaurantDAO;
import sideProject220114.account.RestaurantDAOImpl;
import sideProject220114.account.userField;

public class RestaurantFrame {
	private static Scanner sc = new Scanner(System.in);
	private static RestaurantDAO  single = RestaurantDAOImpl.getInstance();

	public static void run() {
		while (true) {
			menuPrint();
			int menuNo = menuSelect();

			if (menuNo == 1) {
				// 회원가입
				inserUser();
			} else if (menuNo == 2) {
				// 로그인
				login();
			} else if (menuNo == 3) {
				// 등록된 가게
				GO();
			} else if (menuNo == 4) {
				// 후기게시판
				post();
			} else if (menuNo == 5) {
				// 가게추가(메뉴추가)
				insertmenu();
			} else if (menuNo == 9) {
				// 프로그램 종료
				end();
				break;
			}
		}
	}

	public static void menuPrint() {
		System.out.println("------------------------------------------------------------------------");
		System.out.println("1. 회원가입 | 2. 로그인 | 3. 등록된 가게 | 4. 후기게시판 | 5. 가게(메뉴)추가 | 9. 종료");
		System.out.println("------------------------------------------------------------------------");
		System.out.print("메뉴선택 > ");

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

	

	public static void login() {
		String id = "";
		String pw = "";
		
		
		System.out.print("ID를 입력하세요 > ");
		id=sc.nextLine();
		if(loginUser == null) {
			System.out.println("회원정보가 없습니다."
						   + "\n다시한번 확인해주세요.");
		}else if (loginUser.getId().equals(id)) {
			System.out.print("비밀번호를 입력하세요 > ");
			pw=sc.nextLine();
			if()
		}
		/*
		 public static void loginUser(){ 
		 User user = inputLoginInfo(); 
		 User loginUser= UserDAOImpl.getInstance().selectUserInfo(user); 
		 if(loginUser == null){
		  system.out.println("회원정보를 확인해주세요.") 
		  } else if (loginUser.getAuth() == 0) {
		  //일반유저일때 실행하는 메뉴
		    new AccountFrame().run(); 
		    
		  }else if(loginUser.getAuth() ==1) { 
		  //일반회원일떄 실행하는 메뉴 } 
		    }
		 */

	}

	public static void GO() {
		// TODO Auto-generated method stub

	}

	public static void post() {
		// TODO Auto-generated method stub

	}

	public static void insertmenu() {
		// TODO Auto-generated method stub

	}

	public static void end() {
		// TODO Auto-generated method stub

	}

}
