package test;

abstract class Animal {
    abstract void cry();
}

class Cat extends Animal{
	void cry() {
		System.out.println("具克具克");
	}
}

class Dog extends Animal{
	void cry() {
		System.out.println("港港");
	}
}


public class Devcation {

	public static void main(String[] args) {
		Cat cat = new Cat();
		cat.cry();
		
		Dog dog = new Dog();
		dog.cry();
		
	}

}


