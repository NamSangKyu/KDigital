package controller;

import java.util.Scanner;

import service.StudentService;

public class DeleteController extends Controller {

	@Override
	public void execute(Scanner sc) {
		System.out.println("학생 정보 삭제를 시작 합니다..........");
		System.out.print("삭제할 학번 입력 : ");
		String studntNo = sc.nextLine();
		
		boolean result = StudentService.getInstance().deleteStudent(studntNo);
		
		if(result)
			System.out.println("학생 정보 삭제 완료");
		else
			System.out.println("삭제할 학번에 해당하는 학생 정보가 없습니다.");
	}

}



