package main;

import java.util.Scanner;

import service.BookService;

public class BookMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BookService service = BookService.getInstance();
		while (true) {
			System.out.println("----도서관리 프로그램----");
			System.out.println("1. 도서정보 등록");
			System.out.println("2. 도서정보 제목 검색");
			System.out.println("3. 도서 대출");
			System.out.println("4. 도서 정보 수정");
			System.out.println("0. 프로그램 종료");
			System.out.println("원하시는 메뉴 번호를 입력하세요: ");
			int no = sc.nextInt();
			sc.nextLine();
			if (no == 0)
				break;

			switch (no) {
			case 1:
				service.insertBook(sc);
				break;
			case 2:
				service.selectSearchBook(sc);
				break;
			case 3:
				service.loanBook(sc);
				break;
			case 4:
				service.updateBook(sc);
				break;

			}

		}

	}

}
