package constructor;

public class Person extends Animal {
	/*
	 * 부모 클래스 생성자가 데이터를 필요로하면
	 * 자식 클래스가 데이터를 받아서 부모 클래스 생성자로 전달
	 */
	public Person(int age) {
		super(age);//부모생성자 호출, 받아온 데이터 전달
	}

	@Override
	public void eat() {
		System.out.println("Person eat");
		super.eat();//Animal eat 메서드 실행
	}
	
	
}
