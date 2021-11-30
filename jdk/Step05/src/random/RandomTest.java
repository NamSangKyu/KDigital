package random;

import java.util.Random;

public class RandomTest {

	public static void main(String[] args) {
		Random r = new Random();
		
		System.out.println(r.nextInt());//정수를 랜덤하게 뽑음 --> 양수 음수 둘다 나옴
		System.out.println(r.nextInt(10));//0~9까지 랜덤하게 뽑음 --> 0이상 나옴 
		System.out.println(r.nextDouble());//0.0~0.99999999999까지 랜덤하게 뽑음
		System.out.println(r.nextBoolean());//true false 랜덤하게 뽑음
		System.out.println("-----------");
		
		//10~20까지의 숫자를 랜덤으로 뽑음   %  +
		// x % 20  --> 0 ~ 19 --> r.nextInt(20)
		// x % 10  --> 0 ~ 9  --> r.nextInt(10)
		// x % 11 + 10  --> 10 ~ 20 --> r.nextInt(11) + 10
		// x % (최대값 - 최소값 + 1) + 최소값
		for(int i=0;i<10;i++)
			System.out.println(r.nextInt(11)+10);
		
		//nextDouble() --> 0.0 ~ 0.99999    *  +
		//10 ~ 20		   0.0 ~ 10.9999
		//(int)( x * (최대값 - 최소값 + 1) ) + 최소값
		System.out.println("-----------");
		for(int i=0;i<10;i++) {
			int n = (int)(r.nextDouble() * 11) + 10;
			System.out.println(n);
		}
		
	}

}







