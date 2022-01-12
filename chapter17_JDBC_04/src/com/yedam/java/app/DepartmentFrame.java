//package com.yedam.java.app;
//
//import java.sql.SQLException;
//import java.util.Scanner;
//import java.util.concurrent.ThreadPoolExecutor.DiscardOldestPolicy;
//
//import com.yedam.java.department.DepartmentDAO;
//import com.yedam.java.department.DepartmentDAOImpl;
//
//public class DepartmentFrame {
//	private DepartmentDAO deptDAO = DepartmentDAOImpl.getInstance();
//	private Scanner sc = new Scanner(System.in);
//
//	public DepartmentFrame() {
//		while (true) {
//			// 메뉴출력
//			menuPrint();
//
//			// 메뉴선택
//			int menuNo = menuSelect();
//			// 각 메뉴별 기능실행
//			if (menuNo == 1) {
//				// 등록
//				insertDepartment();
//			} else if (menuNo == 2) {
//				// 수정
////				updateDepartment();
////			} else if (menuNo == 3) {
////				// 삭제
////				deleteDepartment();
////			} else if (menuNo == 4) {
////				// 단건조회
////				selectOne();
////			} else if (menuNo == 5) {
////				// 전체조회
////				selectAll();
////			} else if (menuNo == 9) {
////				// 종료
////				end();
////				break;
////			}
//
//		}
//	}
//
//	private void insertDepartment() {
//		// TODO Auto-generated method stub
//		
//	}
//
//	private void menuPrint() {
//		System.out.println("=== 1.등록 2.수정 3.삭제 4.단건조회 5.전체조회 9.종료 ===");
//		System.out.print("선택 > ");
//
//	}
//
////	public int menuSelect() {
////		int menuNo = 0;
////		try {
////			menuNo = Integer.parseInt(sc.nextLine());
////		} catch (SQLException e) {
////			System.out.println("없는 메뉴입니다.");
////		}
////		return menuNo;
////	}
////	
////	
//
//}
