package modifier;

public class StaticEx {

	public static void main(String[] args) {
		//static 멤버 접근시
		//클래스명.변수명 or 클래스명.메서드명([값])
		Calculator.count = 100;
		Calculator.addCount();
		System.out.println(Calculator.count);
	}

}
