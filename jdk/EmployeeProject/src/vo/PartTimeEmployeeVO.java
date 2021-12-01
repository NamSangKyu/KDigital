package vo;

public class PartTimeEmployeeVO extends EmployeeVO{
	private int time;
	private int hourPay;
	
	public PartTimeEmployeeVO(String employeeNo, String name, String department, int time, int hourPay) {
		super(employeeNo, name, department, 0);
		this.time = time;
		this.hourPay = hourPay;
	}
	
	@Override
	public int salary() {
		return time*hourPay;
	}
}
