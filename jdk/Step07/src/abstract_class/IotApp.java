package abstract_class;

public class IotApp {
	private Power[] device;
	private int idx;
	public IotApp() {
		device = new Power[5];
		device[idx++] = new TV();
		device[idx++] = new Aircon();
		device[idx++] = new Light();
	}
	
	public void deviceAllPowerOn() {
		for(int i=0;i<idx;i++)
			device[i].powerOn();
	}
	public void deviceAllPowerOff() {
		for(int i=0;i<idx;i++)
			device[i].powerOff();
	}
	
	public void addDevice(Power power) {
		device[idx++] = power;
	}
	
}









