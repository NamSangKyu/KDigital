import java.util.Scanner;

public class LoopInLoop {
	/*
	 * 숫자 하나 입력 받아서
	 * 숫자에 해당하는 줄 수 만큼 피라미드를 출력
	 * 6입력시 6줄짜리 피라미드 출력 
	 * 		*			1		줄번호 * 2 -1
	 * 	   ***			3
	 *    *****			5
	 *   *******		7
	 *  *********		9
	 * ***********		11	  
	 */
	public static void main(String[] args) {
		int line;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("줄 개수 입력 : ");
		line = sc.nextInt();
		
		String result = "";
		
		for(int i=1;i<=line;i++) {
			for(int j=0;j<line-i;j++) {
				result += " ";
			}
			for(int j=0;j<i*2-1;j++) {
				result += "*";
			}
			result += "\n";//엔터 줄바꿈
		}
		System.out.println(result);
		
	}
}















