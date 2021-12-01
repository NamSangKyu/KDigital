package hasa;

public class PoilceMain {

	public static void main(String[] args) {
		Gun gun = new Gun();
		Police p = new Police(2);
		AK47 ak = new AK47();
		p.changeGun(ak);
		for(int i=0;i<30;i++)
			p.shot();
	}

}
