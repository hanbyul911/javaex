package basic;

import java.util.Scanner;

public class MethodDemo2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num;
    while(true) {
      System.out.print("정수를 하나 입력해주세요. (\"end\"를 입력하면 프로그램이 종료됩니다.) : ");
      String str = sc.nextLine();
      if (str.equals("end")) {
        System.out.println("프로그램이 종료됩니다.");
        break;
      }
      try {
        num = Integer.parseInt(str);
        System.out.printf("입력하신 %d는 %s입니다.\n", num, oddOrEven(num));
      } catch (NumberFormatException e) {
        System.out.println("숫자를 잘못 입력하셨습니다. 숫자 또는 \"end\"를 입력해주세요.");
      }
    }
  }

  public static String oddOrEven (int num) {
    return num % 2 == 0 ? "짝수" : "홀수";
  }
}
