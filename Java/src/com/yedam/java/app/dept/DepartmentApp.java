package com.yedam.java.app.dept;

import java.util.List;
import java.util.Scanner;

public class DepartmentApp {

	public static void main(String[] args) {
		boolean run = true;
		Scanner sc = new Scanner(System.in);
		DepartmentDAO dao = DepartmentDAO.getInstance();
		
		Department dept =null;
		int departmentId = 0;
		
		
		while(run) {
			System.out.println();
			System.out.println("=== 1.등록 2.수정 3.삭제 4.부서조회 5.전체조회 9.종료===");
			System.out.print("선택 >");
			int menuNo = Integer.parseInt(sc.nextLine());
	
			switch(menuNo) {
			case 1:
				dept = new Department();
				System.out.print("부서번호 > ");
				dept.setDepartmentId(Integer.parseInt(sc.nextLine()));
				System.out.print("부서이름 > ");
				dept.setDepartmentName(sc.nextLine());
				System.out.print("매니저번호 > ");
				dept.setManagerId(sc.nextLine());
				System.out.print("지역번호 > ");
				dept.setLocationId(Integer.parseInt(sc.nextLine()));
				dao.insert(dept);
				break;
			case 2:
				dept = new Department();
				System.out.print("부서번호 > ");
				dept.setDepartmentId(Integer.parseInt(sc.nextLine()));
				System.out.print("부서이름 > ");
				dept.setDepartmentName(sc.nextLine());
				
				dao.update(dept);
				break;
			case 3:
				System.out.print("부서번호 > ");
				departmentId = Integer.parseInt(sc.nextLine());
				
				dao.delete(departmentId);
				
				break;
			case 4:
				System.out.print("부서번호 > ");
				departmentId = Integer.parseInt(sc.nextLine());
				dept = dao.selectOne(departmentId);
				System.out.println(dept);
				
				break;
			case 5:
				List<Department> list = dao.selectAll();
				for(Department department : list) {
					System.out.println(department);
				}
				break;
			case 9:
				run = false;
				System.out.println("프로그램 종료");
				break;
			}
		
		}
	}

}
