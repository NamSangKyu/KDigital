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

	public int insertStudent(StudentVO studentVO) {
		return StudentDAO.getInstance().insertStudent(studentVO);
	}

	public StudentVO searchStudent(String studentNo) {
		return StudentDAO.getInstance().selectStudent(studentNo);
	}

	public int deleteStudent(String studentNo) {
		return StudentDAO.getInstance().deleteStudent(studentNo);
	}

	public ArrayList<StudentVO> selectAllStudent() {
		return StudentDAO.getInstance().selectAllStudent();
	}

	public int updateStudent(StudentVO studentVO) {
		return StudentDAO.getInstance().updateStudent(studentVO);
	}

}






