package default_method;

public interface D extends B, C{
	default void printD() {
		printA();
	}

	@Override
	default void printA() {
		B.super.printA();
		C.super.printA();
	}
}
