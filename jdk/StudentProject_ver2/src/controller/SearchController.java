package controller;

import java.util.Scanner;

import service.StudentService;
import vo.StudentVO;

public class SearchController extends Controller {

	@Override
	public void execute(Scanner sc) {
		System.out.println("학생 정보 검색을 시작합니다.");
		System.out.print("검색할 학번 입력 : ");
		String studntNo = sc.nextLine();
		
		StudentVO vo = StudentService.getInstance().searchStudent(studntNo);
		
		if(vo == null) {
			System.out.println("학번에 해당하는 학생 정보가 없습니다.");
		}else {
			vo.printStudentInfo();
			System.out.println();
		}
		
	}

}








