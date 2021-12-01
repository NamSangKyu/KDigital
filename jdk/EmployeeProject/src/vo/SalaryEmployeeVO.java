package vo;

public class SalaryEmployeeVO extends EmployeeVO{
	private int point;
	
	public SalaryEmployeeVO(String employeeNo, String name, String department, int basicPay, int point) {
		super(employeeNo, name, department, basicPay);
		this.point = point;
	}
	
	@Override
	public int salary() {
		return basicPay + (int)(point * 0.3);
	}
	
	
}
