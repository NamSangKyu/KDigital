package constructor;

public class Animal {
	String type;
	int age;
	boolean gender;
	
	public Animal() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Animal(String type, int age, boolean gender) {
		super();
		this.type = type;
		this.age = age;
		this.gender = gender;
	}

	public Animal(String type, int age) {
		super();
		this.type = type;
		this.age = age;
	}
	
	
}
