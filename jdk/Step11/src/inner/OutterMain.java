package inner;

import inner.OutterClass.InnerClass;

public class OutterMain {

	public static void main(String[] args) {
		OutterClass outter = new OutterClass(100);
		InnerClass in = outter.new InnerClass(200);
		System.out.println(in.sum());
		
		OutterStaticClass outterStatic = new OutterStaticClass();
		OutterStaticClass.InStaticClass inClass = new OutterStaticClass.InStaticClass();
		inClass.printInNum();

	}

}
