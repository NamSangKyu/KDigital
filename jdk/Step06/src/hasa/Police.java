package hasa;

public class Police {
	private Gun gun;
	private int handCuff;
	public Police(int handCuff) {
		gun = new Gun();
		this.handCuff = handCuff;
	}
	
	public void shot() {
		gun.shot();
	}
	
	public void reload() {
		gun.reload();
	}
	
	public void changeGun(Gun gun) {
		this.gun = gun;
	}
}



