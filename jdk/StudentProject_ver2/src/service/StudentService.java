package service;

import vo.StudentVO;

public class StudentService {
	private static StudentService instance = new StudentService();
	private StudentVO[] list;
	private int idx;
	private StudentService() {
		list = new StudentVO[10];
	}

	public static StudentService getInstance() {
		if(instance == null)
			instance = new StudentService();
		return instance;
	}

	public boolean registerStudent(StudentVO vo) {
		if(idx == list.length) {
			//임시 배열 생성			
			StudentVO[] temp = new StudentVO[list.length+3];
			//임시 배열에 기존 배열에 있는 값을 복사
			for(int i=0;i<list.length;i++) {
				temp[i] = list[i];
			}
			//기존 배열에 임시 배열을 저장
			list = temp;
		}
		list[idx++]=vo;
		return true;
	}
}





