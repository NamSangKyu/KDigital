package org.mvc.service;

import java.util.ArrayList;
import java.util.HashMap;

import org.mvc.dao.StudentDAO;
import org.mvc.dto.StudentDTO;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
	
	private StudentDAO dao;
	
	public StudentService(StudentDAO dao) {
		this.dao = dao;
	}

	public StudentDTO login(String sno, String name) {
		return dao.login(sno,name);
	}

	public ArrayList<StudentDTO> selectAllStudnet() {
		return dao.selectAllStudent();
	}

	public ArrayList<HashMap<String, Object>> selectAllMajor() {
		return dao.selectAllMajor();
	}

	public int insertStudent(StudentDTO studentDTO) {
		return dao.insertStudent(studentDTO);
	}

	public int deleteStudent(String sno) {
		return dao.deleteStudent(sno); 
	}

	public StudentDTO selectStudent(String sno) {
		return dao.selectStudent(sno);
	}

	public int updateStudent(StudentDTO studentDTO) {
		return dao.updateStudent(studentDTO);
	}
	
	
	
}





