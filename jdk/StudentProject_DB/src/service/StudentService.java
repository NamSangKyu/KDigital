package service;

import java.util.ArrayList;

import dao.StudentDAO;
import vo.StudentVO;

public class StudentService {
	private static StudentService instance = new StudentService();

	private StudentService() {

	}

	public static StudentService getInstance() {
		if (instance == null)
			instance = new StudentService();
		return instance;
	}

	public boolean insertStudent(StudentVO studentVO) {
		return true;
	}

	public StudentVO searchStudent(String studentNo) {
		return StudentDAO.getInstance().selectStudent(studentNo);
	}

	public boolean deleteStudent(String studentNo) {
		return true;
	}

	public ArrayList<StudentVO> selectAllStudent() {
		return StudentDAO.getInstance().selectAllStudent();
	}

}






