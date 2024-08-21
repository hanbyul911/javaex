package object;

import java.util.Scanner;

public class Mission3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = "";

    do {
      System.out.print("URL을 입력하세요. : ");
      str = sc.nextLine();
      str = str.toLowerCase();
      if (str.equals("bye")) {
        break;
      }
      if (str.endsWith("com")) {
        System.out.println(str + "은 'com'으로 끝납니다.");
      }
      if (str.contains("java")) {
        System.out.println(str + "은 'java'를 포함합니다.");
      }
    } while (!str.equals("bye"));
  }
}
