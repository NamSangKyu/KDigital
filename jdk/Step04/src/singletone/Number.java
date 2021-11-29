package singletone;

public class Number {
	private static Number instance = new Number();
	
	private int num;
	
	//private 생성자는 외부에서 생성이 안됨
	private Number() {	}
	
	public static Number getInstance() {
		if(instance == null)
			instance = new Number();
		return instance;
	}
	
	public void addNum() {
		num++;
	}
	
	public int getNum() {
		return num;
	}
	
}


