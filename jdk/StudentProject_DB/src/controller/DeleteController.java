package controller;

import java.util.Scanner;

import service.StudentService;

public class DeleteController implements Controller {

	@Override
	public void execute(Scanner sc) {
		System.out.println("학생 정보 삭제를 시작합니다..........");
		System.out.print("삭제할 학생 번호 : ");
		String studentNo = sc.nextLine();
		
		int result = StudentService.getInstance().deleteStudent(studentNo);
		
		if(result > 0)
			System.out.println("학생 정보 삭제에 성공하였습니다.");
		else
			System.out.println("학번에 해당하는 학생이 없습니다.");
	}

}







