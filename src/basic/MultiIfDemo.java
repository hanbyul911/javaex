package basic;

import java.util.Scanner;

public class MultiIfDemo {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // System.out.println("점수를 입력해주세요. (10점 만점의 정수) : ");

    /*float score = sc.nextFloat();
    String grade = "";

    if (score == 10) {
      grade = "A";
    } else if (score >= 9) {
      grade = "B";
    }else if (score >= 8) {
      grade = "C";
    } else {
      grade = "D";
    }

    System.out.printf("당신의 점수는 %.2f점이며 학점은 %s입니다.", score, grade);*/

    System.out.print("점수를 입력해주세요. (100점 만점의 정수) : ");
    int score = sc.nextInt();
    String grade = "";

    if (score >= 90) {
      grade = "A";
    } else if (score >= 80) {
      grade = "B";
    } else if (score >= 70) {
      grade = "C";
    } else {
      grade = "D";
    }

    System.out.printf("당신의 점수는 %d점이며, 학점은 %s등급입니다.", score, grade);

  }
}
