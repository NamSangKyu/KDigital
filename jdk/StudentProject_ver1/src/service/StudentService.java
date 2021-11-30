package service;

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

	
}
