package controller;

import java.util.Scanner;

import service.StudentService;
import vo.StudentVO;

public class RegisterController implements Controller {

	@Override
	public void execute(Scanner sc) {
		System.out.println("학생정보 등록을 시작합니다...........");
		System.out.print("학번 : ");
		String stduentNo = sc.nextLine();
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("학과 : ");
		String major = sc.nextLine();
		System.out.print("평점 : ");
		double score = sc.nextDouble(); sc.nextLine();
		
		boolean result = StudentService.getInstance().
				insertStudent(new StudentVO(stduentNo, name, major, score));
		
		if(result)
			System.out.println("학생 정보 등록 완료");
		else
			System.out.println("학생 정보 등록 실패");
	}

}







