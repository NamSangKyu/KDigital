package date;

import java.util.Date;

public class Date2 {

	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date);
		System.out.println(date.toGMTString());
		System.out.println(date.toLocaleString());
		Date test = new Date(121, 11, 16);
		System.out.println(test.toLocaleString());
		Date today = new Date(System.currentTimeMillis());
		System.out.println(today.toLocaleString());
		test = new Date(0);
		System.out.println(test.toLocaleString());
	}

}
