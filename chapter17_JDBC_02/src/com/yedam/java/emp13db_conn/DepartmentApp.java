package com.yedam.java.emp13db_conn;

import java.util.List;
import java.util.Scanner;

public class DepartmentApp {

	public static void main(String[] args) {
		boolean run = true;
		DepartmentDAO dao = DepartmentDAO.getInstance();
		Scanner sc = new Scanner(System.in);
		
		Department arl = null;
		int employee_id = 0;
		
		while(run) {
			System.out.print("=== 1.등록 2.수정 3.삭제 4. 부서조회 5. 전체조회 9.종료 ===");
			int menuNo = Integer.parseInt(sc.nextLine());
			switch(menuNo) {
			case 1:
				arl = new Department();
				System.out.print("부서번호 > ");
				arl.setEmployee_id(Integer.parseInt(sc.nextLine()));
				System.out.print("성 > ");
				arl.setFirst_name(sc.nextLine());
				System.out.print("Job_id > ");
				arl.setJob_id(sc.nextLine());
				System.out.print("연봉 > ");
				arl.setSalary(Integer.parseInt(sc.nextLine()));
				System.out.print("commission_pct > ");
				arl.setCommission_pct((sc.nextLine()));
				System.out.print("부서이름 > ");
				arl.setDepartment_name(sc.nextLine());
				System.out.print("location_id > ");
				arl.setLocation_id(Integer.parseInt(sc.nextLine()));
				
				dao.insert(arl);
				break;
			case 2:
				arl = new Department();
				System.out.println("부서번호 > ");
				arl.setEmployee_id(Integer.parseInt(sc.nextLine()));
				System.out.println("연봉 > ");
				arl.setSalary(Integer.parseInt(sc.nextLine()));
				
				dao.update(arl);
				
				break;
			case 3:
				System.out.print("부서번호 > ");
				employee_id = Integer.parseInt(sc.nextLine());
				
				dao.delete(employee_id);
				break;
			case 4:
				System.out.print("부서번호 > ");
				employee_id = Integer.parseInt(sc.nextLine());
				arl= dao.selectOne(employee_id);
				System.out.println(arl);
				break;
			case 5:
				List<Department> list = dao.selectAll();
				for (Department Department : list) {
					System.out.println(Department);
				}
				
				break;
			case 9:
				run = false;
				System.out.println("=== 프로그램 종료 ===");
				break;
					
				
					
			}
			
		}
	}

}
