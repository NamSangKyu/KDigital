package model;

final class Singleton {
	private static Singleton s = new Singleton();
	private Singleton() {
		
		//
	}
	public static Singleton getInstance() {
		
		if (s == null) {
			s = new Singleton();
		}
		
		return s;
	}
	
}

public class TimeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Singleton singleton = new Singleton();
//		Singleton singleton = Singleton.getInstance();
		
	}

}
