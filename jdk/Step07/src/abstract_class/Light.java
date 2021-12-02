package abstract_class;

public class Light extends Power{

	@Override
	public void powerOn() {
		power = true;
		System.out.println("실내등 전원 On");
	}

	@Override
	public void powerOff() {
		power = true;
		System.out.println("실내등 전원 Off");
	}
	
}
