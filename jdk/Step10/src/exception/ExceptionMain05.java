package exception;

import java.util.Scanner;

public class ExceptionMain05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int n1 = sc.nextInt();
		System.out.print("숫자 입력 : ");
		int n2 = sc.nextInt();
		if (n2 == 0) {
			System.out.println("0으로 나눌수 없습니다.");
		} else {
			int result = n1 / n2;
			System.out.println(result);
		}
		sc.close();
		System.out.println("프로그램 종료");
	}

}




