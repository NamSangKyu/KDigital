package method;

public class TVMain {

	public static void main(String[] args) {
		TV tv = new TV();
		tv.powerOnOff();
		for(int i=0;i<300;i++)
			tv.volumeDown();
		
	}

}
