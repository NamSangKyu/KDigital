package exception;

public class ExceptionMain11 {
	public static int average(int[] arr) throws Exception {
		int avg = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0)
				throw new Exception("배열에 0 값이 있습니다.");
			avg += arr[i];
		}

		return avg / arr.length;
	}

	public static void main(String[] args) {
		// 배열 선언 - 길이 자유롭게
		int[] arr = { 3, 23, 1, 77, 5, 2, 2145, 11 };
		// average 실행
		int avg;
		try {
			avg = average(arr);
			System.out.println(avg);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
