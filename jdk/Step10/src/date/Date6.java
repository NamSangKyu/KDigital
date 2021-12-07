package date;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Date6 {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.HOUR_OF_DAY, 15);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd-EEEE HH:mm:ss");
		System.out.println(sdf.format(cal.getTime()));
		sdf.applyPattern("yy-MMM-dd-EE a hh:mm:ss");
		System.out.println(sdf.format(cal.getTime()));
	}

}
