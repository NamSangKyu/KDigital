package abstract_class;

public class PowerMain {

	public static void main(String[] args) {
		IotApp app = new IotApp();
		app.deviceAllPowerOn();
		app.deviceAllPowerOff();
		
		app.addDevice(new Light());
		app.deviceAllPowerOn();
	}

}
