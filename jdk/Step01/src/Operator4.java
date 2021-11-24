import java.util.Scanner;

public class Operator4 {
	/*
	 * 정수형 변수 두개 선언
	 * 숫자 두개 입력 받은 후
	 * 모든 관계연산자를 수행하고 결과를 출력 
	 */
	public static void main(String[] args) {
		int n1, n2;
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		n1 = sc.nextInt();
		System.out.print("숫자 입력 : ");
		n2 = sc.nextInt();
		
		System.out.println(n1 > n2);
		System.out.println(n1 < n2);
		System.out.println(n1 >= n2);
		System.out.println(n1 <= n2);
		System.out.println(n1 == n2);
		System.out.println(n1 != n2);
	}
}
