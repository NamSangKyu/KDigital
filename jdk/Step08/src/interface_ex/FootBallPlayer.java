package interface_ex;

public class FootBallPlayer extends Player implements Walkout{

	public FootBallPlayer(String name, int backNumber) {
		super(name, backNumber);
	}

	@Override
	public void walkout() {
		System.out.println("선수가 항의 하면서 경기장을 나갔습니다.");
	}

}
