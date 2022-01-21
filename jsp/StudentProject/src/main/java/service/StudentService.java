package service;

import dao.StudentDAO;
import dto.StudentDTO;

public class StudentService {
	private static StudentService instance = new StudentService();

	private StudentService() {
	}

	public static StudentService getInstance() {
		if(instance == null)
			instance = new StudentService();
		return instance;
	}

	public StudentDTO login(String sno, String name) {
		return StudentDAO.getInstance().login(sno,name);
	}
	
	
	
}
