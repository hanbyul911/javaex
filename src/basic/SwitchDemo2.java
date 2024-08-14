package basic;

import java.util.Arrays;
import java.util.Scanner;

public class SwitchDemo2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("요일을 입력하세요. (월요일 ~ 일요일) : ");
    String day = sc.nextLine();

    switch (day) {
      case "월요일":
        System.out.println("평일입니다.");
        break;
      case "화요일":
        System.out.println("평일입니다.");
        break;
      case "수요일":
        System.out.println("평일입니다.");
        break;
      case "목요일":
        System.out.println("평일입니다.");
        break;
      case "금요일":
        System.out.println("평일입니다.");
        break;
      case "토요일":
        System.out.println("주말입니다.");
        break;
      case "일요d일":
        System.out.println("주말입니다.");
        break;
      default:
        System.out.println("알 수 없는 문자가 입력되었습니다.");
    }
  }
}
