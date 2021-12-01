package main;

import java.util.Scanner;

import controller.Controller;
import controller.HandlerMapping;

public class EmployeeMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("1. 사원 정보 등록");
			System.out.println("2. 사원 정보 검색");
			System.out.println("3. 사원 정보 삭제");
			System.out.println("4. 사원 정보 수정");
			System.out.println("5. 사원 정보 전체 조회");
			System.out.println("0. 프로그램 종료");
			System.out.print("원하는 번호를 입력하세요 : ");
			int no = sc.nextInt();
			sc.nextLine();
			
			Controller controller = HandlerMapping.getInstance().createController(no);
			
			if(controller != null)
				controller.execute(sc);
			
			if(no == 0) break;
		}
	}

}






