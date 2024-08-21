package object;

import java.util.Scanner;

public class StringEx3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = "";
    String sLower ="";

    do {
      System.out.print("URL을 입력하세요. : ");
      str = sc.nextLine();
      sLower = str.toLowerCase();
      if (sLower.equals("bye")) {
        break;
      }
      if (sLower.endsWith("com")) {
        System.out.println(str + "은 'com'으로 끝납니다.");
      }
      if (sLower.contains("java")) {
        System.out.println(str + "은 'java'를 포함합니다.");
      }
    } while (!sLower.equals("bye"));
  }
}
