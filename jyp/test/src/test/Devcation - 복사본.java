package test;

abstract class Animal {
    abstract void cry();
}

class Cat extends Animal{
	void cry() {
		System.out.println("�߿˾߿�");
	}
}

class Dog extends Animal{
	void cry() {
		System.out.println("�۸�");
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


