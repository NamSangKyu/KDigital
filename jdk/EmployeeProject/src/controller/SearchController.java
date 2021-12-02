package controller;

import java.util.Scanner;

import service.EmployeeService;
import vo.EmployeeVO;

public class SearchController extends Controller {
	@Override
	public void execute(Scanner sc) {
		//검색할 사원번호 입력
		System.out.println("사원정보 검색을 시작합니다.....");
		System.out.print("검색할 사원 번호 입력 : ");
		String employeeNo = sc.nextLine();
		
		//service에 검색어 전달하고 결과를 EmployeeVO로 받음
		EmployeeVO result = EmployeeService.getInstance().searchEmployee(employeeNo);
		if(result != null) {
			System.out.println("검색 결과");
			result.printEmployeeInfo();
		}else {
			System.out.println(employeeNo + "에 대한 검색 결과가 없습니다.");
		}
		
	}
}





