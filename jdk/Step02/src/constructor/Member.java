package constructor;

public class Member {
	String id;
	String password;
	String name;
	int age;
	boolean gender;
	boolean married;
	
	//전체 필드 초기화하는 생성자 작성
	Member(String i, String p, String n, int a, boolean g, boolean m){
		id = i;
		password = p;
		name = n;
		age = a;
		gender = g;
		married = m;
	}
	Member(){
		
	}
}


