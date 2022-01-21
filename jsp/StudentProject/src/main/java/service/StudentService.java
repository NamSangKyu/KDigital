package service;

import java.util.ArrayList;
import java.util.HashMap;

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

	public ArrayList<StudentDTO> selectAllStudnet() {
		return StudentDAO.getInstance().selectAllStudent();
	}

	public ArrayList<HashMap<String, Object>> selectAllMajor() {
		return StudentDAO.getInstance().selectAllMajor();
	}

	public int insertStudent(StudentDTO studentDTO) {
		return StudentDAO.getInstance().insertStudent(studentDTO);
	}

	public int deleteStudent(String sno) {
		return StudentDAO.getInstance().deleteStudent(sno); 
	}

	public StudentDTO selectStudent(String sno) {
		return StudentDAO.getInstance().selectStudent(sno);
	}

	public int updateStudent(StudentDTO studentDTO) {
		return StudentDAO.getInstance().updateStudent(studentDTO);
	}
	
	
	
}





