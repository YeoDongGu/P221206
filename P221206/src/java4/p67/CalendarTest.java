package java4.p67;

import java.util.Calendar;

public class CalendarTest {

	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();

		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH);
		int day = now.get(Calendar.DAY_OF_MONTH);

		System.out.print(year + "년 ");
		System.out.print(month + "월 ");
		System.out.println(day + "일");

		int ampm = now.get(Calendar.AM_PM);
		String strampm = null;
		if (ampm == Calendar.AM) {
			strampm = "오전";
		} else {
			strampm = "오후";
		}

		System.out.print(strampm + " ");

		int hour = now.get(Calendar.HOUR);
		int minute = now.get(Calendar.MINUTE);
		int second = now.get(Calendar.SECOND);

		System.out.print(hour + "시 ");
		System.out.print(minute + "분 ");
		System.out.println(second + "초 ");
	}

}
