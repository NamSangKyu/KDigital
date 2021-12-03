package object;

public class ObjectMain {

	public static void main(String[] args) {
		Person p1 = new Person("김철수", 20);
		System.out.println(p1.toString());
		System.out.println(p1);
		System.out.println(p1.hashCode());
	}

}
