package hasa;

public class AK47 extends Gun{

	public AK47() {
		super();
		bullet = 24;
	}
	
	@Override
	public void shot() {
		bullet -= 3;
		System.out.println("Bang! Bang! Bang! - " + bullet );
	}
	
	@Override
	public void reload() {
		System.out.println("reload! reload!");
		bullet = 24;
	}
}




