package service;

import vo.StudentVO;

public class StudentService {
	private static StudentService instance = new StudentService();
	private StudentVO[] list;
	private int idx;

	private StudentService() {
		list = new StudentVO[10];
	}// StudentService

	public static StudentService getInstance() {
		if (instance == null)
			instance = new StudentService();
		return instance;
	}// getInstance

	public boolean registerStudent(StudentVO vo) {
		if (idx == list.length) {
			// 임시 배열 생성
			StudentVO[] temp = new StudentVO[list.length + 3];
			// 임시 배열에 기존 배열에 있는 값을 복사
			for (int i = 0; i < list.length; i++) {
				temp[i] = list[i];
			} // for
				// 기존 배열에 임시 배열을 저장
			list = temp;
		} // if
			// ---------------
			// 학번 중복 체크
		if (searchStudent(vo.getStudentNo()) != null) {
			System.out.println("중복된 학생 정보가 있습니다.");
			return false;
		} // if
			// ---------------
		list[idx++] = vo;
		return true;
	}// registerStudent

	public StudentVO searchStudent(String studntNo) {
		for (int i = 0; i < idx; i++) {
			if (list[i].getStudentNo().equals(studntNo))
				return list[i];
		}
		return null;
	}

	public boolean deleteStudent(String studentNo) {
		for(int i=0;i<list.length;i++) {
			if(list[i].getStudentNo().equals(studentNo)) {
				for(int j=i;j<idx-1;j++)
					list[j] = list[j+1];
				idx--;
				return true;
			}
		}
		return false;
	}// deleteStudent

	public void printAllStudent() {
		for(int i=0;i<idx;i++)
			list[i].printStudentInfo();
	}
}







