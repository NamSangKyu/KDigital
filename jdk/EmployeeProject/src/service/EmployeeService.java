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
		
	}
	
}
