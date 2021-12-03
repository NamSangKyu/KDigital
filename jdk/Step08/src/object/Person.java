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
	
	
	
}






