package interface_ex;

public class Player implements Pay {
	private String name;
	private int backNumber;
	
	public Player(String name, int backNumber) {
		super();
		this.name = name;
		this.backNumber = backNumber;
	}
	
	public void play() {
		System.out.println(name +"  선수가 경기를 뛰고 있습니다.");
	}

	@Override
	public void pay(int money) {
		System.out.println(name + " 선수는 주급으로 "+money + "원 받았습니다.");
	}

}



