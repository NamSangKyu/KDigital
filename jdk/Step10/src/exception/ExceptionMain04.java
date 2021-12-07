package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionMain04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.print("숫자 입력 : ");
			int n1 = sc.nextInt();
			System.out.print("숫자 입력 : ");
			int n2 = sc.nextInt();

			int result = n1 / n2;

			System.out.println(result);
		} catch (InputMismatchException | ArithmeticException e) {
			System.out.println(e.getMessage());
		}finally {
			sc.close();
		}
		System.out.println("프로그램 종료");
	}

}







