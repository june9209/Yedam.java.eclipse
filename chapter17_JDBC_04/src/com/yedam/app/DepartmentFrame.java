package com.yedam.app;

import java.util.Scanner;

import com.yedam.java.department.Department;
import com.yedam.java.department.DepartmentDAO;
import com.yedam.java.department.DepartmentDAOImpl;

public class DepartmentFrame {
	private DepartmentDAO deptDAO = DepartmentDAOImpl.getInstance();
	private Scanner sc = new Scanner(System.in);

	public DepartmentFrame() {
		while (true) {
			//메뉴 출력
			menuPrint();
			//메뉴 선택
			int menuNo = menuSelect();
			//각 메뉴별 기능 실행
			if(menuNo == 1) {
				insertDept();
			}else if(menuNo ==2) {
				updateDept();
			}else if(menuNo ==3) {
				deleteDept();
			}else if(menuNo == 4) {
				searchOne();
			}else if(menuNo == 5) {
				searchAll();
			}else if(menuNo == 9) {
				end();
				break;
			}
			
		}
	}

	private void updateDept() {
		// TODO Auto-generated method stub
		
	}

	public void menuPrint() {
		System.out.println("");
		System.out.println("=== 1.등록   2.수정  3.삭제  4. 사원조회  5. 전체조회 9. 종료===");
		System.out.print("선택 > ");
	}
	
	
	private int menuSelect() {
		int menuNo = 0;
			
		try {
			menuNo = Integer.parseInt(sc.nextLine());
		}catch(Exception e) {
			System.out.println("없는 메뉴입니다.");
		}
		return menuNo;
	}
	
	private void insertDept() {
		Department dept = ;
		deptDAO.insert(dept);
	}
}
