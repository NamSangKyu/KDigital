package access;

public class PersonMain {

	public static void main(String[] args) {
		Person p = new Person("홍길동", 21);
		//p.age = 33;//private 멤버는 외부 접근 X
		p.setAge(33);
		p.setAge(-1);
		p.printPersonInfo();
	}

}
