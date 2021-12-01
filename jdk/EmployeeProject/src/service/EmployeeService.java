package service;

public class EmployeeService {
	private static EmployeeService instance = new EmployeeService();

	private EmployeeService() {	}

	public static EmployeeService getInstance() {
		if(instance == null)
			instance = new EmployeeService();
		return instance;
	}
	
}
