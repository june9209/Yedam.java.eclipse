package sideProject2201014.app;

import java.rmi.server.RemoteStub;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import sideProject220114.account.PostField;
import sideProject220114.account.RestaurantDAO;
import sideProject220114.account.RestaurantDAOImpl;
import sideProject220114.account.restaurantField;
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
				result = login();

			} else if (menuNo1 == 9) {
				// 프로그램 종료
				end();
				break;
			}

			// 관리자회원 로그인 성공시
			if (result == 1) {
				while (true) {
					menuPrint2();
					int menuNo2 = menuSelect();
					if (menuNo2 == 1) {
						// 등록된 가게
						GO();
					} else if (menuNo2 == 2) {
						// 후기게시판
						postMenu();

					} else if (menuNo2 == 3) {
						// 가게추가(메뉴추가)
						insertmenu();

					} else if (menuNo2 == 9) {
						back();
						break;
					}
				}

			}
			if (result == 2) {
				while (true) {
					menuPrint3();
					int menuNo2 = menuSelect();
					if (menuNo2 == 1) {
						// 등록된 가게
						GO();
					} else if (menuNo2 == 2) {
						// 후기게시판
						post();
					} else if (menuNo2 == 9) {
						back();
						break;
					}
				}
			}
		}

	}

	public static void postMenu() {
		while (true) {
			menuPrint4();
			int menuNo = menuSelect();
			if (menuNo == 1) {
				postList();
			} else if (menuNo == 2) {
				post();
			} else if (menuNo == 3) {
				postUpdate();
			} else if (menuNo == 4) {
				postDelete();
			} else if (menuNo == 9) {
				back();
				break;
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
		System.out.println("----------------------------------------------------");
		System.out.println("1. 등록된 가게 | 2. 후기게시판 | 3. 가게(메뉴)추가 |  9. 뒤로가기");
		System.out.println("----------------------------------------------------");
		System.out.print("메뉴선택 > ");
	}

	public static void menuPrint3() {
		System.out.println("------------------------------------");
		System.out.println("1. 등록된 가게 | 2. 후기게시판 |  9. 뒤로가기");
		System.out.println("------------------------------------");
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

	// 로그인메서드
	public static int login() {
		int result = 0;
		String userId = "";
		String userPw = "";
//		userField user = inputLoginInfo();
		System.out.print("ID를 입력하세요 > ");
		userId = sc.nextLine();
		System.out.print("PW를 입력하세요 > ");
		userPw = sc.nextLine();

		result = RestaurantDAOImpl.getInstance().login(userId, userPw);
		System.out.println(result);
		return result;

	}

	public static void GO() {
		List<restaurantField> list = single.store();
		for (restaurantField restaurant : list) {
			System.out.println(restaurant.toString());
		}
		menuPrint4();
	}

	public static void menuPrint4() {
		String answer;
		while (true) {
			try {
				System.out.print("가게선택 > ");
				String restaurant = sc.nextLine();
				List<restaurantField> list = single.searchRestaurant(restaurant);
				for (restaurantField menu : list) {
					System.out.println(menu);
				}
				System.out.println("주문하시겠습니까? y or n");
				answer = sc.nextLine();
				if (answer.toLowerCase().equals("y")) {
					List<restaurantField> list1 = single.searchRestaurant(restaurant);
					
					Bespeak();
					break;
				} else if (answer.toLowerCase().equals("n")) {
					break;
				}
				break;
			} catch (Exception e) {
				System.out.println("잘못 입력하셨습니다.");
				e.printStackTrace();
				break;
			}
		}
	}

	// 주문하는 메서드
	public static void Bespeak() {

//		restaurantField bespeak = single.searchRestaurant();
	}

	// 게시글 등록
	public static void post() {

		PostField post = inputPostInfo();

		single.post(post);
	}

	public static PostField inputPostInfo() {
		PostField post = new PostField();
		System.out.print("제목 > ");
		post.setTitle(sc.nextLine());
		System.out.print("내용 > ");
		post.setContent(sc.nextLine());
		System.out.print("비밀번호 > ");
		post.setPw(Integer.parseInt(sc.nextLine()));

		return post;
	}

	// 게시글 삭제
	public static void postDelete() {
		String posttitle = "";
		one: while (true) {
			System.out.println("===삭제할 글의 title,password를 입력하세요.===");
			System.out.print("삭제할 제목을 입력하세요. >");
			posttitle = sc.nextLine();
			System.out.print("비밀번호를 입력하시오.");
			int postPassword = Integer.parseInt(sc.nextLine());
			if (single.checkPw(posttitle, postPassword) == true) {
				single.postDelete(posttitle);
				break;
			} else {
				System.out.print("1번 입력시 다시 입력 \n2번 입력시 뒤로가기.");
				int choice = Integer.parseInt(sc.nextLine());
				try {
					if (choice == 1) {
						break one;
					} else if (choice == 2) {
						break;
					}
				} catch (Exception e) {
					System.out.println("잘못 입력하였습니다. 다시 입력하세요.");
				}
			}
		}

	}

	// 게시글 수정
	public static void postUpdate() {
		String posttitle = "";

		one: while (true) {
			System.out.println("===수정할 글의 title,password를 입력하세요.===");
			System.out.print("제목을 입력하세요. >");
			posttitle = sc.nextLine();
			System.out.print("비밀번호를 입력하시오.");
			int postPassword = Integer.parseInt(sc.nextLine());
			if (single.checkPw(posttitle, postPassword) == true) {

				System.out.print("제목");
				String newcontent = sc.nextLine();
				System.out.print("내용");
				String newtitle = sc.nextLine();
				single.postUpdate(newtitle, newcontent, posttitle);
				break;
			} else {
				System.out.print("1번 입력시 다시 입력 \n2번 입력시 뒤로가기.");
				int choice = Integer.parseInt(sc.nextLine());
				try {
					if (choice == 1) {
						break one;
					} else if (choice == 2) {
						break;
					}
				} catch (Exception e) {
					System.out.println("잘못 입력하였습니다. 다시 입력하세요.");
				}
			}
		}
	}

	// 게시글 목록
	public static void postList() {
		List<PostField> list = single.postList();
		for (PostField PL : list) {
			System.out.println(PL);
		}

	}

	public static void insertmenu() {
		restaurantField menu = inputmenu();
		single.enterStore(menu);
	}

	public static restaurantField inputmenu() {
		restaurantField menu1 = new restaurantField();

		System.out.print("가게 이름 > ");
		menu1.setRestaurant(sc.nextLine());
		System.out.print("메뉴 > ");
		menu1.setMenu(sc.nextLine());
		System.out.print("가격 > ");
		menu1.setPrice(Integer.parseInt(sc.nextLine()));

		return menu1;
	}

	public static void back() {
		System.out.println("뒤로가기");
	}

	public static void end() {
		System.out.println("===프로그램 종료===`");
	}

}
//public static userField inputLoginInfo() {
//List<userField> list = single.selectAllUser();
//String pw = "";
//String id = "";
//System.out.print("ID를 입력하세요 > ");
//id = sc.nextLine();
//for (userField user : list) {
//	if (user.getId().contains(id)) {
//		System.out.print("ID입력 성공");
//		if (user.getPw().contains(pw)) {
//
//		} else {
//			System.out.println("비밀번호 입력 오류");
//		}
//	} else {
//		System.out.println("해당하는 ID가 없습니다.");
//	}
//}
//
////if (loginUser == null) {
////	System.out.println("회원정보가 없습니다." + 
////						"\n다시한번 확인해주세요.");
////} else if (loginUser.getId().equals(id)) {
////	System.out.print("비밀번호를 입력하세요 > ");
////	pw = sc.nextLine();
////}
//return null;
//}
//
/*
 * public static void loginUser(){ User user = inputLoginInfo(); User loginUser=
 * UserDAOImpl.getInstance().selectUserInfo(user); if(loginUser == null){
 * system.out.println("회원정보를 확인해주세요.") } else if (loginUser.getAuth() == 0) {
 * //일반유저일때 실행하는 메뉴 new AccountFrame().run();
 * 
 * }else if(loginUser.getAuth() ==1) { //일반회원일떄 실행하는 메뉴 } }
 */