package constructor;

public class AnimalMain {

	public static void main(String[] args) {
		Animal animal = new Animal("개", 1, true);
		System.out.println(animal.type);
		System.out.println(animal.age);
		System.out.println(animal.gender);
	}

}
