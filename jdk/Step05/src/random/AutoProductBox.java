package random;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class AutoProductBox {
	/*		0		1		2		3
	 * 		S		A		B		C
	 * 		6		40		1400	5054
	 * 		0.09%	0.61%	21.5%	77.7%	
	 */
	public static int[] createGatcha() {
		Random r = new Random();
		//등급별 개수
		int[] boxEa = {6,40,1400,5054};
		//현재 저장된 가챠 개수
		int[] count = new int[4];
	
		//가챠 박스
		int[] gatcha = new int[6500];
		//가챠 박스 생성
		for(int i=0;i<gatcha.length;i++) {
			int n = r.nextInt(4);
			if(boxEa[n]==count[n]) {
				i--;
				continue;
			}
			gatcha[i] = n;
			count[n]++;
		}
		return gatcha;
	}
	public static void main(String[] args) {
		Random r = new Random();
		Scanner sc = new Scanner(System.in);

		int[] gatcha = createGatcha();

		System.out.println(Arrays.toString(gatcha));
		System.out.println("프로그램 종료");
	}

}
