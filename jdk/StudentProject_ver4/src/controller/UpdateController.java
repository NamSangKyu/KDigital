package controller;

import java.util.Scanner;

import exception.StudentException;
import service.StudentService;
import vo.StudentVO;

public class UpdateController implements Controller {

	@Override
	public void execute(Scanner sc) {
		//학번 입력
		System.out.println("학생 정보 수정을 시작합니다..........");
		//검색
		System.out.print("수정할 학번 : ");
		String studentNo = sc.nextLine();
		StudentVO vo;
		try {
			vo = StudentService.getInstance().searchStudent(studentNo);
			//	이름, 학과, 평점 입력 받아서 최신화
			System.out.print("이름 : ");
			String name = sc.nextLine();
			System.out.print("학과 : ");
			String major = sc.nextLine();
			System.out.print("평점 : ");
			double score = sc.nextDouble(); sc.nextLine();
			vo.setName(name);
			vo.setMajor(major);
			vo.setScore(score);
		} catch (StudentException e) {
			System.out.println(e.getMessage());
		}
		
	}

}







