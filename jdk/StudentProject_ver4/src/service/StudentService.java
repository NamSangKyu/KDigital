package service;

import java.util.ArrayList;

import exception.StudentException;
import vo.StudentVO;

public class StudentService {
	private static StudentService instance = new StudentService();
	private ArrayList<StudentVO> list;

	private StudentService() {
		list = new ArrayList<StudentVO>();
	}
	
	public ArrayList<StudentVO> getList() {
		return list;
	}

	public static StudentService getInstance() {
		if (instance == null)
			instance = new StudentService();
		return instance;
	}

	public void insertStudent(StudentVO studentVO) throws StudentException {
		// 동일한 객체가 있는지 체크 -- 학번으로만 비교
		if (list.contains(studentVO))
			throw new StudentException("학번이 중복됩니다. 다른 학번을 입력하세요");
		list.add(studentVO);
	}

	public StudentVO searchStudent(String studentNo) throws StudentException {
		StudentVO vo = new StudentVO(studentNo, null, null, 0);
		int no = list.indexOf(vo);
		if (no == -1)
			throw new StudentException("검색결과 학번에 해당하는 학생이 없습니다.");
		return list.get(no);
	}

	public boolean deleteStudent(String studentNo) {
		StudentVO vo = new StudentVO(studentNo, null, null, 0);
		return list.remove(vo);
	}

}






