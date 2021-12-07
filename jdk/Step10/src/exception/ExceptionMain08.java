package exception;

import java.util.Scanner;

public class ExceptionMain08 {

	public static int div(int n1, int n2) throws ArithmeticException{
		int result = 0;
		result = n1 / n2;
		return result;
	}

	public static void main(String[] args) {
		int n1, n2;
		Scanner sc = new Scanner(System.in);

		System.out.print("숫자 입력 : ");
		n1 = sc.nextInt();
		System.out.print("숫자 입력 : ");
		n2 = sc.nextInt();
		try {
			System.out.println(div(n1, n2));
		}catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}
	}

}



