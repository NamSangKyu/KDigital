package interface_ex;

public class Aircon implements Power{
	private boolean power;
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
	
	public void powerOnOff() {
		power = !power;
		if(power)
			System.out.println("에어컨 전원 On");
		else
			System.out.println("에어컨 전원 Off");
	}

}




