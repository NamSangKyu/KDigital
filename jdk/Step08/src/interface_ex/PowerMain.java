package interface_ex;

public class PowerMain {

	public static void main(String[] args) {
		//인터페이스는 직접적으로 생성 X
		//Power power = new Power();
		TV tv = new TV();
		Aircon aircon = new Aircon();
		
		Power power = tv;
		power.powerOff();
		power.powerOn();
		//power.powerOnOff();
		
		power = aircon;
		power.powerOff();
		power.powerOn();
	}

}
