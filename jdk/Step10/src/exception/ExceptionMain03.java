package exception;

public class ExceptionMain03 {

	public static void main(String[] args) {
		try {
			int arr[] = { 1, 2, 3, 0, 4, 5 };
			int n = 10;

			for (int i = 0; i < 7; i++) {
				System.out.println(n / arr[i]);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열 인덱스 번호가 벗어났습니다.");
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눌수 없습니다.");
		}finally {
			System.out.println("finally 영역");
		}

	}

}
