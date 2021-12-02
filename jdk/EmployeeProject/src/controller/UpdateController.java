package controller;

import java.util.Scanner;

import service.EmployeeService;
import vo.DispatchEmployeeVO;
import vo.EmployeeVO;
import vo.PartTimeEmployeeVO;
import vo.SalaryEmployeeVO;

public class UpdateController extends Controller {
	@Override
	public void execute(Scanner sc) {
		// 수정할 사원 번호 입력
		System.out.print("수정할 사번 : ");
		String employeeNo = sc.nextLine();
		
		//사원 정보를 검색 - employee가 검색 결과를 받아옴
		EmployeeVO employee = EmployeeService.getInstance().searchEmployee(employeeNo);
		
		if(employee == null) {
			System.out.println("수정할 사원 정보가 없습니다.");
			return;
		}

		System.out.print("수정할 이름 : ");
		String name = sc.nextLine();
		System.out.print("수정할 부서 : ");
		String department = sc.nextLine();
		int basicPay;
		
		if(employee instanceof SalaryEmployeeVO) {
			System.out.print("기본급 : ");
			basicPay = sc.nextInt();
			sc.nextLine();
			System.out.print("영업포인트 : ");
			int point = sc.nextInt();
			sc.nextLine();
			employee = new SalaryEmployeeVO(employeeNo, name, department, basicPay, point);	
		}else if(employee instanceof PartTimeEmployeeVO) {
			System.out.print("근무시간: ");
			int time = sc.nextInt();
			sc.nextLine();
			System.out.print("시급 : ");
			int hourPay = sc.nextInt();
			sc.nextLine();
			employee = new PartTimeEmployeeVO(employeeNo, name, department, time, hourPay);
		}else if(employee instanceof DispatchEmployeeVO) {
			System.out.print("기본급 : ");
			basicPay = sc.nextInt();
			sc.nextLine();
			System.out.print("파견지 등급 : ");
			char grade = sc.nextLine().charAt(0);
			employee = new DispatchEmployeeVO(employeeNo, name, department, basicPay, grade);
		}else {
			System.out.print("기본급 : ");
			basicPay = sc.nextInt();
			sc.nextLine();
			employee = new EmployeeVO(employeeNo, name, department, basicPay);
		}
		
		EmployeeService.getInstance().updateEmployee(employee); //수정된 객체 전달
		
	}
}









