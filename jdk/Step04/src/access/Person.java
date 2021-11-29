package access;

public class Person {
	// 이름
	private String name;
	// 나이
	private int age;

	// 이름 나이 초기화 하는 생성자
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int a) {
		if(a > 0) //데이터가 정상인지 체크
			age = a;
	}
	
	public int getAge() {
		return age;
	}
	
	// Person 정보 출력하는 메서드 - printPersonInfo() - void
	public void printPersonInfo() {
		System.out.println("이름 : " + name + ", 나이 : " + age);
	}
}










