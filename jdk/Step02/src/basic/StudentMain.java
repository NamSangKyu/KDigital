package basic;

public class StudentMain {

	public static void main(String[] args) {
		Student std = new Student();
		std.no = "200012312";
		std.name = "홍길동";
		std.major = "경영학과";
		std.score = 4.2;
		
		System.out.println(std.no + " " + std.name + 
				" " + std.major + " " + std.score);

	}

}
