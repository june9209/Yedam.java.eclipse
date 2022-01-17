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
						postMenu();
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
			} else if (menuNo == 5) {
				postSearch();
			}else if (menuNo == 9) {
				back();
				break;
			}
		}

	}

	

	private static void menuPrint4() {
		System.out.println("---------------------------------------------------------------------------------");
		System.out.println("1. 게시글 목록 | 2. 게시글 등록 |  3. 게시글 수정 | 4. 게시글 삭제 | 5. 게시글 검색 | 9. 뒤로가기");
		System.out.println("---------------------------------------------------------------------------------");
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
		menuPrint5();
	}

	public static void menuPrint5() {
		String answer;
		while (true) {
			try {
				System.out.print("가게선택 > ");

				String restaurant = sc.nextLine();
				List<restaurantField> list = single.searchRestaurant(restaurant);
				int[] menuNo = new int[list.size()];
				for (int i = 0; i < list.size(); i++) {
					restaurantField menu = list.get(i);
					menuNo[i] = menu.getPrice();
					System.out.println(menu.toString1());
				}

				try {

					System.out.println("주문하시겠습니까? y or n");
					answer = sc.nextLine();
					if (answer.toLowerCase().equals("y")) {
						int result = 0;
						while (true) {
							System.out.println("메뉴번호를 입력하세요.");
							int menuNo1 = Integer.parseInt(sc.nextLine());
							System.out.println("수량을 입력하세요.");
							int Num = Integer.parseInt(sc.nextLine());

							result += menuNo[menuNo1 - 1] * Num;
							System.out.println(result + "원입니다.");

							System.out.println("주문을 종료하시겠습니까? y or n");
							answer = sc.nextLine();
							if (answer.toLowerCase().equals("y")) {
								System.out.println("총 가격 " + result + " 입니다.");
								break;
							} else if (answer.toLowerCase().equals("n")) {
								continue;
							}else {
								System.out.println("잘못입력하셨습니다.");
								continue;
							}
						}
						break;

					} else if (answer.toLowerCase().equals("n")) {
						break;
					} else {
						System.out.println("잘못입력하셨습니다.");
						continue;
					}
				} catch (Exception e) {
					System.out.println("잘못 입력하셨습니다.");
					break;
				}

			} catch (Exception e) {
				System.out.println("잘못 입력하셨습니다.");
				continue;
			}
		}
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
		List<PostField> list = single.postList();
		post.setNum(list.size()+1);

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
			System.out.print("비밀번호를 입력하시오. > ");
			int postPassword = Integer.parseInt(sc.nextLine());
			if (single.checkPw(posttitle, postPassword) == true) {
				System.out.println("수정할 제목과 내용을 입력하세요.");
				System.out.print("제목 > ");
				String newcontent = sc.nextLine();
				System.out.print("내용 > ");
				String newtitle = sc.nextLine();
				single.postUpdate(newtitle, newcontent, posttitle);
				break;
			} else {
				System.out.print("1번 입력시 다시 입력 \n2번 입력시 뒤로가기.\n");
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

	//게시글 검색
		public static void postSearch() {
			
			System.out.println("제목or 글 번호 입력하세요 > ");
			String postTitle = sc.nextLine();
			List<PostField> list =RestaurantDAOImpl.getInstance().postList();
			
			for (PostField postField : list) {
				if(postTitle == postField.getTitle() && postTitle == Integer.toString(postField.getNum())) {
					System.out.println(postField.toString());
				}
					
			}
		
		
		}
		
	// 메뉴추가
	public static void insertmenu() {
		restaurantField menu = inputmenu();
		single.enterStore(menu);
	}

	
	public static restaurantField inputmenu() {
		restaurantField menu1 = new restaurantField();

		
		System.out.print("가게 이름 > ");
		String name = sc.nextLine();
		menu1.setRestaurant(name);
		System.out.print("메뉴 > ");
		menu1.setMenu(sc.nextLine());
		System.out.print("가격 > ");
		menu1.setPrice(Integer.parseInt(sc.nextLine()));
		
		List<restaurantField> list = single.searchRestaurant(name);
		menu1.setMenuNo(list.size()+1);
//		int[] menuNo = new int[list.size()];
//		for (int i = 0; i < list.size(); i++) {
//			restaurantField menu = list.get(i);
//			menu1.setMenuNo(i);
//			
//		}
		return menu1;
	}

	public static void back() {
		System.out.println("뒤로가기");
	}

	public static void end() {
		System.out.println("===프로그램 종료===");
	}

}
