package constructor;

public class Animal {
	private int age;

	public Animal(int age) {
		this.age = age;
	}
	
	public void printInfo() {
		System.out.println("나이 : "+age);
	}
	
	public void eat() {
		System.out.println("동물이 먹이를 먹습니다.");
	}
}
