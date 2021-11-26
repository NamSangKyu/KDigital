package method;

public class Animal {
	String type;
	int age;
	
	public Animal(String type, int age) {
		this.type = type;
		this.age = age;
	}
	
	/*			
	 *			변수타입 메서드이름(매개변수){
	 *				실행할 코드
	 * 			}
	 */
	// 리턴 X		매개변수 O		-  void는 데이터 타입 X 그래서 리턴할 값이 없음
	void eat(String food) {
		System.out.println(type +"이(가) "+food+"를 먹습니다.");
	}
	// 리턴 X		매개변수 X
	void printInfo() {
		System.out.println("종류 : "+type);
		System.out.println("나이 : "+age);
	}
}





