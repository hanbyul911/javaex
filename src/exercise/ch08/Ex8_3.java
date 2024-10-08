package exercise.ch08;

import java.util.Calendar;

public class Ex8_3 {
  public static void main(String[] args) {
    String[] weekName = {"일", "월", "화", "수", "목", "금", "토"};
    String[] noonName = {"오전", "오후"};
    Calendar c = Calendar.getInstance();

    int year = c.get(Calendar.YEAR);
    int month = c.get(Calendar.MONTH) + 1;
    int day = c.get(Calendar.DAY_OF_MONTH);
    String week = weekName[c.get(Calendar.DAY_OF_WEEK) - 1];
    String noon = noonName[c.get(Calendar.AM_PM)];
    int hour = c.get(Calendar.HOUR_OF_DAY);
    int minute = c.get(Calendar.MINUTE);
    int second = c.get(Calendar.SECOND);

    System.out.println(year + "년 " + month + "월 " + day + "일");
    System.out.println(week + "요일 " + noon);
    System.out.println(hour + ":" + minute + ":" + second);

  }
}
