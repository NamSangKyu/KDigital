package controller;

import java.util.Scanner;

import service.EmployeeService;
import vo.DispatchEmployeeVO;
import vo.EmployeeVO;
import vo.PartTimeEmployeeVO;
import vo.SalaryEmployeeVO;

public class RegisterController extends Controller {
	@Override
	public void execute(Scanner sc) {
		//사원정보 입력
		System.out.println("사원정보 등록을 시작합니다.");
		System.out.println("1. 일반 직원");
		System.out.println("2. 영업직");
		System.out.println("3. 파트타임 직원");
		System.out.println("4. 파견 직원");
		System.out.print("원하시는 번호를 선택하세요 : ");
		int no = sc.nextInt();
		sc.nextLine();
		
		EmployeeVO employee = null;
		
		System.out.print("사번 : ");
		String employeeNo = sc.nextLine();
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("부서 : ");
		String department = sc.nextLine();
		int basicPay;
		switch(no) {
		case 1:
			System.out.print("기본급 : ");
			basicPay = sc.nextInt();sc.nextLine();
			employee = new EmployeeVO(employeeNo, name, department, basicPay);
			break;
		case 2:
			System.out.print("기본급 : ");
			basicPay = sc.nextInt();sc.nextLine();
			System.out.print("영업포인트 : ");
			int point = sc.nextInt();sc.nextLine();
			employee = new SalaryEmployeeVO(employeeNo, name, department, basicPay, point);
			break;
		case 3:
			System.out.print("근무시간: ");
			int time = sc.nextInt();sc.nextLine();
			System.out.print("시급 : ");
			int hourPay = sc.nextInt();sc.nextLine();
			employee = new PartTimeEmployeeVO(employeeNo, name, department, time, hourPay);
			break;
		case 4:
			System.out.print("기본급 : ");
			basicPay = sc.nextInt();sc.nextLine();
			System.out.print("파견지 등급 : ");
			char grade = sc.nextLine().charAt(0);
			employee = new DispatchEmployeeVO(employeeNo, name, department, basicPay, grade);
			break;
		}
		EmployeeService.getInstance().insertEmployee(employee);
	}
}










