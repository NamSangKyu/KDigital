import java.util.Scanner;

public class DoWhileEx {
	/*
	 * 숫자 하나 입력 받은 후
	 * 숫자에 해당하는 구구단을 출력 
	 */
	public static void main(String[] args) {
		int i=1,dan;
		Scanner sc = new Scanner(System.in);
		System.out.print("단 입력 : ");
		dan = sc.nextInt();
		
		do {
			System.out.println(dan + " * "+ i + " = " + dan*i);
			i++;
		}while(i < 10);
	}

}
