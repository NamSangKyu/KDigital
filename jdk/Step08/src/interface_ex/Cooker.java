package interface_ex;

public class Cooker implements Pay{
	private String name;
	
	public Cooker(String name) {
		super();
		this.name = name;
	}
	public void cooking() {
		System.out.println(name + " 요리사가 음식을 만들고 있습니다.");
	}
	@Override
	public void pay(int money) {
		System.out.println(name + " 요리사는 급여로 " + money + "원 받았습니다.");
	}

}
