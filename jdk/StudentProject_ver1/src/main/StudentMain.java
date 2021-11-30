package main;

import java.util.Scanner;

import service.StudentService;

public class StudentMain {

	public static void main(String[] args) {
		StudentService service = StudentService.getInstance();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("1. 학생정보 추가");
			System.out.println("2. 학생정보 검색");
			System.out.println("3. 학생정보 수정");
			System.out.println("4. 학생정보 삭제");
			System.out.println("5. 전체 학생정보 조회");
			System.out.println("0. 프로그램 종료");
			System.out.println("원하시는 메뉴 번호를 입력하세요 :");
			int no = sc.nextInt();
			sc.nextLine();//줄바꿈 문자 제거
			
			switch(no) {
			case 1:
				service.insertStudent(sc);
				break;
			case 2:
				service.selectStudent(sc);
				break;
			case 5:
				service.printAllStudent();
				break;
			}
			
			
			if(no == 0) break;
		}
		
	}

}




