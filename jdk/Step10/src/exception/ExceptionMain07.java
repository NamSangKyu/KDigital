package exception;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class ExceptionMain07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.print("숫자 입력 : ");
			int n1 = sc.nextInt();
			System.out.print("숫자 입력 : ");
			int n2 = sc.nextInt();

			int result = n1 / n2;

			System.out.println(result);
		} catch (Exception e) { //Exception 클래스는 모든 Exception 클래스의 부모 클래스
			SimpleDateFormat sdf = new SimpleDateFormat("YYYY_MM_dd_hh_mm_ss");
			Calendar cal = Calendar.getInstance();
			System.out.println(sdf.format(cal.getTime())+
					" "+ e.getClass().getName() + " " + e.getMessage());
		}finally {
			sc.close();
		}
		System.out.println("프로그램 종료");
	}

}





