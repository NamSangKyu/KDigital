package service;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

import exception.StudentException;
import log.PrintLog;
import vo.StudentVO;

public class StudentService {
	private static StudentService instance = new StudentService();
	private ArrayList<StudentVO> list;

	private StudentService() {
		list = new ArrayList<StudentVO>();
		//파일 연결
		File file = new File("student.dat");
		//스트림 초기화
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		
		try {
			fis = new FileInputStream(file);
			ois = new ObjectInputStream(fis);
			//파일 읽기
			while(true)
				list.add((StudentVO) ois.readObject());
		} catch (FileNotFoundException e) {
			//로그
			PrintLog.getInstance().printLog("student.dat 파일이 없습니다");
			System.out.println("student.dat 파일이 없습니다");
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
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






