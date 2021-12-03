package default_method;

public interface B extends A{
	default void printB() {
		System.out.println("printB");
	}

	@Override
	default void printA() {
		// TODO Auto-generated method stub
		System.out.println("B - printA");
	}
	
}
