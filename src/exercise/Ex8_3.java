package exercise;

import advancedjava.CalendarDemo;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Ex8_3 {
  public static void main(String[] args) {
    String[] weekName = {"일", "월", "화", "수", "목", "금", "토"};
    String[] noonName = {"오전", "오후"};
    Calendar c = Calendar.getInstance();

    int year = c.get(Calendar.YEAR);
    int month = c.get(Calendar.MONTH) + 1;
    int day = c.get(Calendar.DAY_OF_MONTH);
    int weekDay = c.get(Calendar.DAY_OF_WEEK) - 1;
    int noon = c.get(Calendar.AM_PM);
    int hour = c.get(Calendar.HOUR_OF_DAY);
    int minute = c.get(Calendar.MINUTE);
    int second = c.get(Calendar.SECOND);

    System.out.println(year + "년 " + month + "월 " + day + "일");
    System.out.println(weekName[weekDay] + "요일 " + noonName[noon]);
    System.out.println(hour + ":" + minute + ":" + second);

  }
}
