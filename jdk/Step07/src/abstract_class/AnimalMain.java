package abstract_class;

public class AnimalMain {

	public static void main(String[] args) {
		//Animal animal = new Animal();
		Animal animal = new Dog();
		animal.eat();
		animal = new Person();
		animal.eat();
	}

}
