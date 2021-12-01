package constructor;

public class CarMain {
	public static void main(String[] args) {
		AICar car = new AICar(100, "A00001");
		car.changeMode();
		car.changeMode();
		car.run();
		car.run();
		car.run();
		car.changeMode();
		car.run();
		car.run();
		car.run();
	}
}
