package method;

import java.util.Scanner;

public class Calculator {
	//결과를 정수로 되돌려주고, 정수형 데이터 두개의 데이터를 받는 메서드
	//리턴 O		매개변수 O
	int sum(int a, int b) {
		int result = a+b;
		return result;//결과값을 되돌려 주는 부분
	}
	//리턴 O		매개변수 X
	int inputNumber() {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int num = sc.nextInt();
		return num;
	}
}
