package hasa;

public class Gun {
	protected int bullet;

	public Gun() {
		bullet = 20;
	}
	
	public void shot() {
		if(bullet>0) {
			bullet--;
			System.out.println("BBang!!");
		}else {
			reload();
		}
	}

	public void reload() {
		System.out.println("reload reload!");
		bullet = 20;
	}
	
	
}
