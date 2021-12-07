package exception;

import java.util.Scanner;

public class ExceptionMain10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 정수형 배열 길이 10인 배열 생성
		int[] arr = new int[10];
		try {
			// 배열 값을 입력하고 총합을 출력
			for (int i = 0; i < arr.length; i++) {
				System.out.print("숫자 입력 : ");
				arr[i] = sc.nextInt();
				if (arr[i] == 0)
					throw new Exception("0을 입력할수 없습니다.");
			}
			int sum = 0;
			for (int i = 0; i < arr.length; i++) {
				sum += arr[i];
			}
			System.out.println("총합 : " + sum);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
