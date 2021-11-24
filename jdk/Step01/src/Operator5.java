import java.util.Scanner;

public class Operator5 {
	/*
	 *  정수형 변수 두개 선언(n1,n2)
	 * 	숫자 2개 입력 받은 후
	 *  n1이 5보다 크고, n2는 10보다 작은지?
	 *  n1이 짝수고, n2는 10보다 크고, 15보다 작은지?
	 *  위에 두개 연산식을 작성하고 결과를 출력하시오
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1, n2;
		System.out.print("숫자 입력 : ");
		n1 = sc.nextInt();
		System.out.print("숫자 입력 : ");
		n2 = sc.nextInt();
		System.out.println(n1 > 5 && n2 < 10);
		System.out.println(n1 % 2 == 0 && n2 > 10 && n2 < 15);
	}
}
