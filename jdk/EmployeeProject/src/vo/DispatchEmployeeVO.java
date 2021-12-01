package vo;

public class DispatchEmployeeVO extends EmployeeVO{
	
	private char grade;

	public DispatchEmployeeVO(String employeeNo, String name, String department, int basicPay, char grade) {
		super(employeeNo, name, department, basicPay);
		this.grade = grade;
	}
	
	@Override
	public int salary() {
		double ratio = 0.0;
		switch(grade) {
		case 'A':
			ratio = 0.4;
			break;
		case 'B':
			ratio = 0.35;
			break;
		case 'C':
			ratio = 0.3;
			break;
		case 'D':
			ratio = 0.2;
			break;
		
		}
		return (int)(basicPay * ratio)+basicPay;
	}
	

}
