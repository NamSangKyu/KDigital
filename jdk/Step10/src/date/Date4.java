package date;

import java.util.Calendar;

public class Date4 {

	public static void main(String[] args) {
		Calendar start = Calendar.getInstance();
		Calendar end = Calendar.getInstance();
		end.set(Calendar.MONTH, 11);
		end.set(Calendar.DAY_OF_MONTH, 31);
		long diff = end.getTimeInMillis() - start.getTimeInMillis();
		diff = diff / (1000 * 60 * 60 * 24);
		System.out.println(diff+"일 남았습니다.");
	}

}
