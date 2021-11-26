package method;

public class CalculatorMain {

	public static void main(String[] args) {
		Calculator cal = new Calculator();
		System.out.println(cal.sum(10, 20));
		int n1 = cal.inputNumber();
		int n2 = cal.inputNumber();
		System.out.println(cal.sum(n1, n2));
		
	}

}
