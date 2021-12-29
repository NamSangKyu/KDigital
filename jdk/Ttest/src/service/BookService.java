package service;

import java.util.ArrayList;
import java.util.Scanner;

import vo.BookVO;

public class BookService {
	private ArrayList<BookVO> list;
	private static BookService instance = new BookService();
	
	private BookService() {
		list = new ArrayList<BookVO>();
	}
	
	public static BookService getInstance() {
		if(instance == null)
			instance = new BookService();
		return instance;
	}
	
	//도서등록 
	public void insertBook(Scanner sc) {
		System.out.println("도서정보 등록을 시작합니다.............");
		
		//도서데이터 입력 
		System.out.println("도서 제목 입력: ");
		String title = sc.nextLine();
		System.out.println("저자 입력: ");
		String writer = sc.nextLine();
		System.out.println("출판사 입력: ");
		String publisher = sc.nextLine();
		
		list.add(new BookVO(title, writer, publisher));
		System.out.println("도서 정보 등록 성공");
	}

	//도서정보 제목 검색 
	public void selectSearchBook(Scanner sc) {
			System.out.println("도서정보 조회를 시작합니다.........");
			System.out.println("검색할 도서명 입력: ");
			String title = sc.nextLine();
			for(int i=0; i<list.size(); i++) {
				if(list.get(i).getTitle().equals(title))
					list.get(i).printInfo();
			}
	}
	//도서 대출 실행 
	public void loanBook(Scanner sc) {
		System.out.println("도서 대출을 시작합니다.......");
		System.out.println("대출할 도서명 입력: ");
		String title = sc.nextLine();
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getTitle().equals(title) ) {
				if(list.get(i).isLoan()) {
					System.out.println("해당 도서는 이미 대출 중입니다.");
					return;
				} else {
					System.out.println("대출이 완료되었습니다.");
				}
			}
		}
		System.out.println("대출할 도서 정보가 없습니다.");
	}
	//도서 수정 
	public void updateBook(Scanner sc) {
		System.out.println("도서정보 수정를 시작합니다.......");
		System.out.println("수정할 도서명 입력: ");
		String title = sc.nextLine();
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getTitle().equals(title)) {
				
				System.out.println("저자 입력: ");
				String writer = sc.nextLine();
				System.out.println("출판사 입력: ");
				String publisher = sc.nextLine();
				
				list.set(i, new BookVO(title, writer, publisher));
				System.out.println("도서 정보 수정 완료");
				return;
			
			}
		}
		System.out.println("도서정보 수정 실패! 해당 도서가 없습니다.");
	}
}