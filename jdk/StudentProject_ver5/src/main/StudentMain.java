package main;

import java.util.Scanner;

import controller.Controller;
import controller.HandlerMapping;
import log.PrintLog;

public class StudentMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("--- 학적 관리 프로그램 ---");
			System.out.println("1. 학생정보 등록");
			System.out.println("2. 학생정보 검색");
			System.out.println("3. 학생정보 삭제");
			System.out.println("4. 학생정보 수정");
			System.out.println("5. 학생정보 전체 조회");
			System.out.println("0. 프로그램 종료");
			System.out.print("원하시는 메뉴 번호 입력 : ");
			int no = sc.nextInt(); sc.nextLine();
			
			Controller controller = HandlerMapping.getInstance().createController(no);
			
			if(controller != null)
				controller.execute(sc);
			
			if(no == 0) break;
		}
		PrintLog.getInstance().close();
		System.out.println("프로그램을 종료합니다.");
	}

}






