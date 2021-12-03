package controller;

import java.util.Scanner;

import service.StudentService;
import vo.StudentVO;

public class UpdateController extends Controller {

	@Override
	public void execute(Scanner sc) {
		System.out.println("학생 정보 수정을 시작합니다.");
		System.out.print("수정할 학번 입력 : ");
		String studntNo = sc.nextLine();
		
		StudentVO vo = StudentService.getInstance().searchStudent(studntNo);
		
		if(vo == null) {
			System.out.println("수정할 학생 정보가 없습니다.");
			return;			
		}
		
		System.out.print("수정할 이름 입력 : ");
		String name = sc.nextLine();
		vo.setName(name);
		System.out.print("수정할 학과 입력 : ");
		String major = sc.nextLine();
		vo.setName(major);
		System.out.print("수정할 평점 입력 : ");
		double score = sc.nextDouble(); sc.nextLine();
		vo.setScore(score);
		
		System.out.println("학생 정보 수정이 완료되었습니다.");		
	}

}








