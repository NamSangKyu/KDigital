package multi_interface;

public class MultiMain {

	public static void main(String[] args) {
		MultiImpl m = new MultiImpl();
		
		A a = m;
		B b = m;
		
		a.printA();
		b.printB();
	}

}
