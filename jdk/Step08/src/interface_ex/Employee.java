package interface_ex;

public class Employee implements Pay{
	private String name;
	private String position;
	
	public Employee(String name, String position) {
		super();
		this.name = name;
		this.position = position;
	}
	
	public void work() {
		System.out.println(name + " " + position + "이 업무를 봅니다.");
	}

	@Override
	public void pay(int money) {
		System.out.println(name + " 회사원은 월급으로 "+ money + "원 받았습니다.");
	}

}



