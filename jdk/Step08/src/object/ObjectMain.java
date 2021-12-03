package object;

public class ObjectMain {

	public static void main(String[] args) {
		Person p1 = new Person("김철수", 20);
		System.out.println(p1.toString());
		System.out.println(p1);
		System.out.println(p1.hashCode());
		
		Person p2 = new Person("김철수", 20);
		System.out.println(p2.toString());
		System.out.println(p2);
		System.out.println(p2.hashCode());
		//메모리 주소 비교
		System.out.println(p1 == p2);
		System.out.println(p1.equals(p2));
		Person p3 = null;
		System.out.println(p1.equals(p3));
		
	}

}
