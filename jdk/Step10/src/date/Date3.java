package date;

import java.util.Calendar;

public class Date3 {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.toString());
		System.out.println(cal.get(Calendar.YEAR));
		System.out.println(cal.get(Calendar.MONTH));
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));
		System.out.println(cal.get(Calendar.HOUR_OF_DAY));
		System.out.println(cal.get(Calendar.MINUTE));
		System.out.println(cal.get(Calendar.SECOND));
		System.out.println(cal.getTimeInMillis());//현재 시간을 밀리초 단위로 뽑음
		cal.set(Calendar.MONTH, 5);//6월 셋팅
		cal.set(Calendar.DAY_OF_MONTH, 10);//10일 셋팅
		
	}

}
