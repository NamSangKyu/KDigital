package vo;

public class EmployeeVO {
	protected String employeeNo;
	protected String name;
	protected String department;
	protected int basicPay;
	protected int bonus;
	
	public EmployeeVO(String employeeNo, String name, String department, int basicPay) {
		this.employeeNo = employeeNo;
		this.name = name;
		this.department = department;
		this.basicPay = basicPay;
	}

	public String getEmployeeNo() {
		return employeeNo;
	}

	public void setEmployeeNo(String employeeNo) {
		this.employeeNo = employeeNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getBasicPay() {
		return basicPay;
	}

	public void setBasicPay(int basicPay) {
		this.basicPay = basicPay;
	}
	
	public void printEmployeeInfo() {
		System.out.println("사번 : "+employeeNo);
		System.out.println("이름 : "+name);
		System.out.println("부서 : "+department);
		System.out.println("월급여 : "+salary());
	}
	
	public int salary() {
		return basicPay+bonus;
	}
}















