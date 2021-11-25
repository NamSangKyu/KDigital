package basic;

public class MemberMain {

	public static void main(String[] args) {
		Member mem = new Member();
		//회원 클래스 생성 -> 바로 출력
		System.out.println(mem.id + " " + mem.password + " "
				+ mem.name + " " + mem.age + " "
				+mem.gender + " " + mem.married);
		
		mem.id = "A0001";
		mem.password = "123456";
		mem.name = "홍길동";
		mem.age = 20;
		mem.gender = false;
		mem.married = true;
		
		System.out.println(mem.id + " " + mem.password + " "
				+ mem.name + " " + mem.age + " "
				+mem.gender + " " + mem.married);

	}

}
