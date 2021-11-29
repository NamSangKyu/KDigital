package modifier;

public class Calculator {
	// static 키워드가 붙으면 Calculator를 생성하지 않고도 사용이 가능
	// static 키워드가 붙으면 미리 데이터영역에 선언 됨
	// Calculator 생성과 상관 없이 사용이 가능
	// Calculator 생성과는 무관하게 미리 할당되어 있음
	public static int count = 0;
	private int sumCount;
	
	public static void addCount() {
		//static은 non static에 접근할수 없음, 특정 객체 지칭이 안되서 접근이 불가
//		sumCount++;
		count++;
	}
	
	public int sum(int a, int b) {
		//sum이 생성된 시점에는 count가 메모리가 할당되어 있기때문에 접근이 가능
		//non static은 static에 접근이 가능
		count++;
		sumCount++;
		return a+b;
	}
}



