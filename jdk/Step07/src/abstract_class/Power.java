package abstract_class;

public abstract class Power {
	protected boolean power;
	
	public abstract void powerOn();
	public abstract void powerOff();
	
	//final 메서드는 오버라이딩을 금지한 메서드
	public final void powerOnOff() {
		power = !power;
		if(power)
			System.out.println("전원 On");
		else 
			System.out.println("전원 Off");
	}
}
