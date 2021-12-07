package exception;

import java.util.Scanner;

public class ExceptionMain09 {
	public static int average(int[] arr) throws ArithmeticException, ArrayIndexOutOfBoundsException {
		// 받아온 배열의 평균을 리턴
		int sum = 0;
		for (int i = 0; i < arr.length; i++)
			sum += arr[i];
		return sum / arr.length;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 배열 개수를 입력 받아서 초기화
		System.out.print("배열 길이를 입력 : ");
		int ea = sc.nextInt();
		int[] arr = new int[ea];
		// 배열에 숫자를 입력 받아서 average 호출하고 그 결과를 출력
		for (int i = 0; i < arr.length; i++) {
			System.out.print("숫자 입력 : ");
			arr[i] = sc.nextInt();
		}
		try {
			int avg = average(arr);
			System.out.println(avg);
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
	}

}



