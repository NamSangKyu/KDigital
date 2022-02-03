package jypProject;


class Calculator {
	public static String appName = "Calculator";
	
	public static int add(int x, int y) {
	    
	    return x + y;
	}

	public int min(int x, int y) {
	    return x - y;
	}
}

public class Dev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(Calculator.add(1, 2));
//		Calculator.min(1, 2);
		
		Calculator cal = new Calculator();
		System.out.println(Calculator.add(1, 2));
		System.out.println(cal.min(1, 2));
	}

}
