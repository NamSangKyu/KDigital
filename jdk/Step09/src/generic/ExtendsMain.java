package generic;

public class ExtendsMain {

	public static void main(String[] args) {
		GenericExtends<Animal> box = new GenericExtends<Animal>();
		box.setObj(new Animal());
		box.printAnimal();
	}

}
