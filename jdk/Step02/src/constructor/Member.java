package constructor;

public class Member {
	String id;
	String password;
	String name;
	int age;
	boolean gender;
	boolean married;
	
	//전체 필드 초기화하는 생성자 작성
	
	Member(){
		
	}

	public Member(String id, String password, String name, int age, boolean gender, boolean married) {
		super();
		this.id = id;
		this.password = password;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.married = married;
	}
}


