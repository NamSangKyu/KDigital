package constructor;

public class PersonMain {

	public static void main(String[] args) {
		Person p = new Person();//기본 생성자 호출
		p = new Person("홍길동",20);
		p = new Person("홍길동");
		System.out.println(p.name + " " + p.age);
		System.out.println("프로그램 종료");
	}

}
