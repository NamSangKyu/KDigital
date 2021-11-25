package arr;
import java.util.Scanner;

public class ArrayInput {
	/*
	 * 정수형 배열 길이가 5인 배열을 생성
	 * 생성 후 배열에 숫자를 입력하신 후 출력
	 */
	public static void main(String[] args) {
		int[] arr = new int[5];
		Scanner sc = new Scanner(System.in);
		int idx = 0;
		while(idx != arr.length) {
			System.out.print("숫자 입력 : ");
			arr[idx++] = sc.nextInt();
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}

}
