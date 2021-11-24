import java.util.Scanner;

public class WhileEx {
	/*
	 * 	숫자(양수) 하나 입력
	 *  1부터 입력한 숫자까지 합을 출력 
	 */
	public static void main(String[] args) {
		int i=1, n, total=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 하나 입력 : ");
		n = sc.nextInt();
		
		while(i<=n) {
			total += i;
			i++;
		}
		System.out.println(total);
	}

}
