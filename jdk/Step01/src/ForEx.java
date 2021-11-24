import java.util.Scanner;

public class ForEx {
	/*
	 * 숫자 하나 입력 받은 후
	 * 입력한 숫자의 팩토리얼 값을 출력
	 * 입력 5 --> 120
	 */
	public static void main(String[] args) {
		int n, fac=1 ;
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		n = sc.nextInt();
		for(int i=1;i<=n;i++) {
			fac *= i;
		}
		System.out.println(fac);
	}

}
