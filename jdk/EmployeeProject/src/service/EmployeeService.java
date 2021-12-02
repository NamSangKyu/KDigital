package service;

import vo.EmployeeVO;

public class EmployeeService {
	private static EmployeeService instance = new EmployeeService();
	private EmployeeVO[] list;
	private int index;
	private EmployeeService() {
		list = new EmployeeVO[10];
	}

	public static EmployeeService getInstance() {
		if(instance == null)
			instance = new EmployeeService();
		return instance;
	}

	public void insertEmployee(EmployeeVO employee) {
		//배열에 남은 공간이 있는지 체크
		if(index == list.length) {
			System.out.println("더이상 저장할 공간이 없습니다.");
			return ;
		}
		list[index] = employee;
		index++;
		System.out.println("사원 정보 등록이 완료 되었습니다.");
	}
	
}









