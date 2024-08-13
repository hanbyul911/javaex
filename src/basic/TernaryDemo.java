package basic;

import java.util.Scanner;

public class TernaryDemo {
  public static void main(String[] args) {
    /*int i = 2;
    int res = i % 2;
    String name = "";

    if (res == 0) {
      name = "짝수";
    } else {
      name = "홀수";
    }

    System.out.println(name);

    name = i % 2 == 0 ? "짝수" : "홀수";
    System.out.printf("%d(은)는 %s입니다.", i, name);*/
    Scanner sc = new Scanner(System.in);

    System.out.print("정수 하나를 입력해주세요. : ");
    int x = sc.nextInt();
    String flag = "";

    flag = x >= 0 ? "양수" : "음수";

    System.out.printf("입력하신 %d는 %s입니다.", x, flag);
  }
}
