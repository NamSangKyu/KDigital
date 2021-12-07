package exception;

public class ExceptionMain12 {

	public static void main(String[] args) {
		int no = 10;

		try {
			if (no % 2 == 0)
				throw new EvenException("숫자가 짝수면 안됩니다.");
			System.out.println("no는 홀수 입니다.");
		} catch (EvenException e) {
			System.out.println(e.getMessage());
		}
	}

}
