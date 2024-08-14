package basic;

import java.util.Scanner;

public class WhileDemo2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int score;

    while (true) {
      System.out.print("점수를 입력해주세요. : ");
      score = sc.nextInt();
      if (score < 0) break;
      System.out.printf("입력하신 점수는 %d점이며 %s 등급입니다.\n", score, grade(score));
    }
  }

  public static String grade (int score) {
    if (score >= 90) {
      return "A";
    } else if (score >= 80) {
      return "B";
    } else {
      return "C";
    }
  }
}
