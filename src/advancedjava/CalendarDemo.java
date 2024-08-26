package advancedjava;

import java.util.Calendar;

public class CalendarDemo {
  public static void main(String[] args) {
    Calendar cal = Calendar.getInstance();
    System.out.println(cal);
    System.out.println(cal.get(Calendar.YEAR));
    System.out.println(cal.get(2) + 1);
    System.out.println(cal.get(Calendar.DAY_OF_MONTH));
  }
}
