
public class PersonMain {

	public static void main(String[] args) {
		Person p1 = new Person();//Person 객체 생성
		p1.name = "홍길동";//p1안에 있는 name에 홍길동을 저장
		p1.age = 20;
		//Person 객체 생성 이름 - 김철수, 나이 - 33
		Person p2 = new Person();
		p2.name = "김철수";
		p2.age = 33;
		
		//p1, p2 저장하고 있는 내용 출력
		System.out.println(p1.name + " , "+p1.age);
		System.out.println(p2.name + " , "+p2.age);
	}

}
