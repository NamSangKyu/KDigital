package inheritance;

public class Dog extends Animal{

	public Dog() {
		System.out.println("Dog 생성자");
	}
	
	public void eat() {
		System.out.println("개는 사료를 먹습니다.");
	}
}
