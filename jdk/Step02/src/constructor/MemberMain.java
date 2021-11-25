package constructor;

public class MemberMain {

	public static void main(String[] args) {
		Member m = new Member("A0001", "12345", "홍길동", 20, false, false);
		System.out.println(m.id + " " + m.password + " "
				+ m.name + " " + m.age + " "
				+m.gender + " " + m.married);
	}

}
