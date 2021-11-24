
public class IfEx1 {
	/*
	 * 1~100까지 숫자들 중
	 * 3과 5의 배수를 출력, 공배수는 한번만 출력 
	 */
	public static void main(String[] args) {
		for(int i=1;i<=100;i++) {
			if(i % 3 == 0)
				System.out.println(i);
			else if(i % 5 == 0)
				System.out.println(i);
		}
	}

}
