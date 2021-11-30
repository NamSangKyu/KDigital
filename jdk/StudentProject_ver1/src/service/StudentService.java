package service;

import java.util.Scanner;

import vo.StudentVO;

//싱글톤 패턴 적용
public class StudentService {
	private static StudentService instance = new StudentService();
	private StudentVO[] arr;
	private int idx;
	
	private StudentService() {
		arr = new StudentVO[5];
	}

	public static StudentService getInstance() {
		if(instance == null)
			instance = new StudentService();
		return instance;
	}

	public void insertStudent(Scanner sc) {
		//학생데이터 추가
		//1. 저장할 공간이 있는지 체크
		//if, idx, arr.length, 배열길이와 idx가 같으면 더 이상 저장할 공간이 없다.
		if(idx == arr.length) {
			System.out.println("저장할 공간이 없습니다.");
			return;
		}
		System.out.println("학생정보 등록을 시작합니다........");
		//2. 학생데이터 입력 후 StudentVO 생성
		//	 학번, 이름, 학과, 평점 ---> 입력
		System.out.print("학번 : ");
		String studentNo = sc.nextLine();
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("학과 : ");
		String major = sc.nextLine();
		System.out.println("평점 : ");
		double score = sc.nextDouble();
		StudentVO vo = new StudentVO(studentNo, name, major, score);
		//3. 배열에 추가 후 idx 증가
		arr[idx++] = vo;
		System.out.println("학생정보 등록 완료.");
	}

	
}







