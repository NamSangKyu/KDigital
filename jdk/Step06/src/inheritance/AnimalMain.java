package inheritance;

public class AnimalMain {

	public static void main(String[] args) {
		Animal animal = new Animal();
		System.out.println("------------");
		Person person = new Person();
		System.out.println("------------");
		Dog dog = new Dog();
		System.out.println("------------");
		
		animal.eat();
		person.eat();
		dog.eat();
	}

}
