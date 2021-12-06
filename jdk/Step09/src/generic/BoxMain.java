package generic;

public class BoxMain {

	public static void main(String[] args) {
		/*
		 * 1. Box 생성
		 * 2. Apple 생성 후 Box에 저장
		 * 3. Box에서 getObj로 객체 읽어온 후 printApple 실행
		 * 4. Animal 생성 후 Box에 저장
		 * 5. Box에서 getObj로 객체 읽어온 후 printAnimal 실행
		*/
		Box box = new Box();
		Apple apple = new Apple();
		box.setObj(apple);
		//box.setObj(new Animal());
		Apple ap = (Apple) box.getObj();//타입이 Object일 경우 반드시 형변환이 필요함
		ap.printApple();
		Animal animal = new Animal();
		box.setObj(animal);
		Animal ani = (Animal) box.getObj();
		ani.printAnimal();
	}

}




