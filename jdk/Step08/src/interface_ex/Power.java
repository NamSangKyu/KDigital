package interface_ex;

public interface Power {
	public abstract void powerOn();
	//public abstract 자동으로 붙음
	void powerOff();
	
	//public static final 자동으로 붙음
	public static final boolean POWER_ON = true;
	boolean POWER_OFF = false;
}
