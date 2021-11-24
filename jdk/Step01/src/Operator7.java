import java.util.Scanner;

public class Operator7 {
	/*
	 * 	숫자 하나 입력 받아서
	 *  숫자가 짝수면 짝수, 홀수면 홀수라고 출력
	 *  삼항연산자, String 변수타입을 이용
	 * 
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.print("숫자 입력 : ");
		n = sc.nextInt();
		String result = n % 2 == 0 ? "짝수" : "홀수";
		System.out.println(result);
	}

}
