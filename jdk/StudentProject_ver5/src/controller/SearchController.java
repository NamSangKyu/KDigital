package controller;

import java.util.Scanner;

import exception.StudentException;
import log.PrintLog;
import service.StudentService;
import vo.StudentVO;

public class SearchController implements Controller {

	@Override
	public void execute(Scanner sc) {
		System.out.println("학생 정보 검색을 시작합니다..........");
		System.out.print("검색할 학번을 입력하세요 : ");
		String studentNo = sc.nextLine();
		
		StudentVO vo;
		try {
			vo = StudentService.getInstance().searchStudent(studentNo);
			System.out.println(vo);
		} catch (StudentException e) {
			PrintLog.getInstance().printLog(e.getMessage());
			System.out.println(e.getMessage());
		}
	}

}




