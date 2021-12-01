package constructor;

public class Car {
	protected int fuel;

	public Car(int fuel) {
		this.fuel = fuel;
	}
	
	public void run() {
		fuel -= 10;
		System.out.println("일반 주행 모드로 달립니다. - "+fuel);
	}
}
