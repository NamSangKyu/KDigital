package object;
//이름 나이 저장하고, 내용을 출력하는 메서드 
public class Person {
	private String name;
	private int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void printInfo() {
		System.out.println(name + " , " + age);
	}

	//객체가 담고 있는 값을 문자열로 표현할때.
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

	@Override
	public int hashCode() {
		// 객체가 가지고 있는 데이터를 수학적인 수식을 이용해서 숫자로 변경
		return name.hashCode() + age;
	}
	
	//obj는 현재 객체와 동일한 지 비교할 객체
	//obj의 내용이 this 객체와 내용이 동일한지 판단 - equals
	@Override
	public boolean equals(Object obj) {
		//1. obj가 null 인지?
		if(obj == null) return false;
		//2. 메모리 주소 비교
		if(obj == this) return true;
		//3. obj 클래스가 Person 클래스로 형변환 되는지 체크
		if(obj instanceof Person) {
			Person temp = (Person) obj;
			//필드값이 전부 동일한 비교
			return temp.age == age && name.equals(temp.name);
		}
		return false;
	}
	
	
	
}






