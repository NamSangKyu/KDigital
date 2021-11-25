package constructor;

public class StudentMain {

	public static void main(String[] args) {
		Student std = new Student("200012313","홍길동","경영학과",3.14);
		System.out.println(std.no);
		System.out.println(std.name);
		System.out.println(std.major);
		System.out.println(std.score);
		System.out.println(std.grade);
	}

}
