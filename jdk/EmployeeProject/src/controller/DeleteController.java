package controller;

import java.util.Scanner;

import service.EmployeeService;

public class DeleteController extends Controller {
	@Override
	public void execute(Scanner sc) {
		System.out.println("사원 정보 삭제를 시작합니다.....");
		System.out.print("삭제할 사원 번호 입력 : ");
		String employeeNo = sc.nextLine();
		
		boolean result = EmployeeService.getInstance().deleteEmployee(employeeNo);
		
		if(result)
			System.out.println("사원 정보 삭제 완료.");
		else
			System.out.println("삭제할 사원 정보가 없습니다.");
	}
}






