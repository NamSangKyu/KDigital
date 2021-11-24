import java.util.Scanner;

public class ArrayEx {
	/*
	 * 정수형 배열을 길이가 10인 배열을 생성 후
	 * 배열에 모든 값을 입력 받은 후
	 * 짝수의 개수를 출력
	 * 
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		int count = 0;
		for(int i=0;i<arr.length;i++) {
			System.out.print("숫자 입력 : ");
			arr[i] = sc.nextInt();
		}
		for(int i=0;i<arr.length;i++) {
			if(arr[i] % 2 == 0) 
				count++;
		}
		System.out.println("짝수 개수 : "+count);
	}

}



