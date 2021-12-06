package generic;

public class BoxGenericMain {

	public static void main(String[] args) {
		BoxGeneric<Animal> box1 = new BoxGeneric<Animal>();
		box1.setObj(new Animal());
		Animal animal = box1.getObj();
		animal.printAnimal();
		
		BoxGeneric<Apple> box2 = new BoxGeneric<Apple>();
		box2.setObj(new Apple());
		Apple apple = box2.getObj();
		apple.printApple();
	}

}
