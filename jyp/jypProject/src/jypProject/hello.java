package jypProject;



public class hello {
	int test;
	
	public static void main(String[] args) {
//		testMethod(0, "안녕하세요");
		
//		int result;
//		result = sumTest(1,2);
//		System.out.println(result);
		
//		System.out.println(sumTest(1,2));
		
//		testMethod();
		
	// 함수 하나만 만들어서  calc(정수값1, 정수값2, 부호 )
		System.out.println(calc(10, 20, "+"));
		
		
		System.out.println("3 factorial: " + factorial(16));
			
	} 
	
	public static int factorial(int n) {
	     if(n == 1)
	         return 1;
	     else
	         return n * factorial(n-1);
	}
	  
	public static double calc(double num1, double num2, String op) {
		double result = 0.0;
		
		if (op.equals("+")) {
			//+
			result =  num1 + num2;
//			return num1 + num2;
		}else if (op.equals("-")) {
			//-
			result = num1 - num2;
//			return num1 - num2;
		}else if (op.equals("*")) {
			//*
			result = num1 * num2;
//			return num1 * num2;
		}else if (op.equals("/")) {
			// /
			result = num1 / num2;
//			return num1 / num2;
		}else {
//			return 0.0;
		}
		
		return result;
		
	}
	
	public static int sumTest(int num1, int num2) {
		
		int result = num1 + num2;
//		System.out.println(result);
		return result;
		
	}
	
	public static void testMethod() {

		int result;
		result = sumTest(1,2);
		System.out.println(result);
		
		System.out.println(sumTest(1,2));
		
		
	}
	
}







