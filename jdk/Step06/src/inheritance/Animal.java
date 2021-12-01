package inheritance;

public class Animal {
	//protected는 상속 받은 클래스까지 접근이 가능
	protected int age;
	
	public Animal() {
		System.out.println("Animal 생성자");
	}

	public void eat() {
		System.out.println("동물이 먹이를 먹습니다.");
	}
}
