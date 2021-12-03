package multi_interface;

public class MultiImpl implements A, B{

	@Override
	public void printB() {
		System.out.println("printB");
	}

	@Override
	public void printA() {
		System.out.println("printA");
	}

}
