import java.util.Scanner;

public class IfEx2 {
	/*
	 * 숫자 두개를 입력받아서 작은 숫자부터 큰 숫자까지 합을 출력 
	 * 100 1 ---> 5050 
	 * 1 100 ---> 5050
	 */
	public static void main(String[] args) {
		int n1, n2, total = 0;
		Scanner sc = new Scanner(System.in);

		System.out.print("숫자 입력 : ");
		n1 = sc.nextInt();
		System.out.print("숫자 입력 : ");
		n2 = sc.nextInt();

		if(n1 > n2) {
			int temp = n1;
			n1 = n2;
			n2 = temp;
		}
		
		for (int i = n1; i <= n2; i++)
			total += i;
		System.out.println("총합 : " + total);
	}

}




