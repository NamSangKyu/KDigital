package method;

public class AnimalMain {

	public static void main(String[] args) {
		Animal animal = new Animal("개", 4);
		animal.eat("사료");
		animal.printInfo();
	}

}
