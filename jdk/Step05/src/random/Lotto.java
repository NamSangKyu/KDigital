package random;

import java.util.Arrays;
import java.util.Random;

public class Lotto {
	
	public static void main(String[] args) {
		/*
		 * 정수형 배열 길이가 6인 배열을 생성
		 * 배열에 로또번호 1~45 번호를 랜덤하게 채움
		 * 단, 배열에 저장된 숫자들 중에 중복된 숫자가 있으면 안됨 
		 */
		Random r = new Random();
		int[] arr = new int[6];
		
		for(int i=0;i<arr.length;i++) {//겹치지 않는 숫자 6번 뽑기 위한 반복
			int num = r.nextInt(45) + 1;//로또번호 하나 뽑음
			//중복내용 체크
			if(checkNumber(arr,num))
				i--;
			else
				arr[i] = num;
		}
		//배열 전체 내용 출력
		System.out.println(Arrays.toString(arr));
	}
	public static boolean checkNumber(int[] arr, int n) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==n)
				return true;
		}
		return false;
	}
}













