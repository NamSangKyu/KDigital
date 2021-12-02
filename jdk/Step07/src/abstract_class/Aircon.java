package abstract_class;

public class Aircon extends Power{

	@Override
	public void powerOn() {
		power = true;
		System.out.println("에어컨 전원 On");
	}

	@Override
	public void powerOff() {
		power = false;
		System.out.println("에어컨 전원 Off");
	}

}
