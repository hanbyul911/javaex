package basic;

import object.Day;

import java.util.Scanner;

public class SwitchDemo3 {
  public static void main(String[] args) {
    Day dayOfWeek = Day.FRI;
    switch (dayOfWeek) {
      case MON:
      case TUE:
      case WED:
      case THU:
      case FRI:
        System.out.println("평일입니다.");
        break;
      case SAT:
      case SUN:
        System.out.println("주말입니다.");
        break;
      default:
        System.out.println("알 수 없는 문자가 입력되었습니다.");
    }
  }
}
