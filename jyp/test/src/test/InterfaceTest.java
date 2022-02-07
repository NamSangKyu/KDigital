package test;

class A {
	void autoPlay(I i) {
		i.play();
	}
}

interface I{
	public abstract void play();
}

class B implements I {
	
	public void play() {
		System.out.println(" class B");
	}
}

class C implements I {
    public void play() {
         System.out.println("play in C class");
    }
}


public class InterfaceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A();
		a.autoPlay(new B());
		a.autoPlay(new C());
	}

}
