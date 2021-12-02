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
			//배열을 재할당
		}
		list[idx++]=vo;
		return true;
	}
}





