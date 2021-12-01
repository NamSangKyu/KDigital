package inheritance;

public class Person extends Animal{

	public Person() {
		System.out.println("Person 생성자");
	}

	public void addAge() {
		age++;
	}

	@Override
	public void eat() {
		System.out.println("사람은 밥을 먹습니다.");
	}
	
	
	
}
