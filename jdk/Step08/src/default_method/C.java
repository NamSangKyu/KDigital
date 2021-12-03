package default_method;

public interface C extends A {
	
	@Override
	default void printA() {
		System.out.println("C - printA");
	}

	default void printC() {
		System.out.println("printC");
	}
}
