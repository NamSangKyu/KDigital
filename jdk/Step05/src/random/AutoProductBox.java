package random;

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
		int[] boxEa = {350,650,1900,3600};
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
	public static String grade(int n) {
		switch(n) {
		case 0:
			return "S";
		case 1:
			return "A";
		case 2:
			return "B";
		default:
			return "F";
		}
	}
	public static void main(String[] args) {
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		
		int money = 0;
		
		while(true) {
			System.out.println("현재까지 뽑기에 투자한 금액 : "+money);
			System.out.println("1. 한번 뽑기");
			System.out.println("2. 10+1번 뽑기");
			System.out.println("0. 뽑기 종료");
			System.out.print("번호를 선택하세요 : ");
			int no = sc.nextInt();
			
			int[] gatcha = createGatcha();			
			if(no == 1) {
				int n = gatcha[r.nextInt(gatcha.length)];
				System.out.println(grade(n));
				money += 11000;
			}else if(no == 2) {
				for(int i=0;i<10;i++) {
					int n = r.nextInt(gatcha.length);
					if(gatcha[n] == -1) {
						i--;
						continue;
					}
					String str = grade(gatcha[n]);
					gatcha[n] = -1;
					System.out.println(str);
				}
				money += 110000;
			}else {
				break;
			}
		}

	}

}






