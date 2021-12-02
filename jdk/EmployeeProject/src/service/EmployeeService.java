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

	public void printAllEmployee() {
		System.out.println("전체 사원 정보를 출력합니다.........");
		for(int i=0;i<index;i++) {
			list[i].printEmployeeInfo();
			System.out.println();
		}
	}

	public EmployeeVO searchEmployee(String employeeNo) {
		for(int i=0;i<index;i++) {
			if(list[i].getEmployeeNo().equals(employeeNo))//사원번호가 일치?
				return list[i];//일치하는 해당 사원 객체를 리턴
		}
		return null; //일치하는 사원번호가 없을 때
	}
	
}









