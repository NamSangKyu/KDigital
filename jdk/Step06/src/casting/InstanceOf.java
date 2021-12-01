package casting;

public class InstanceOf {
	public static void eat(Animal animal) {
		animal.eat();
	}
	public static void main(String[] args) {
		Dog dog = new Dog();
		Animal animal = dog;
		animal.eat();
		animal = new Person();
		animal.eat();
		
//		dog = (Dog) animal;
		Person p = (Person)animal;
		p.eat();
		
		eat(new Animal());
		eat(p);
		eat(dog);
	}

}


