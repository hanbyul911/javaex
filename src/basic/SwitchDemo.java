package basic;

import java.util.Scanner;

public class SwitchDemo {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("점수를 입력해주세요. (100점 만점의 정수) : ");
    int score = sc.nextInt();
    String grade;

    // case 에는 중복된 값을 넣을 수 없다.
    // 낙하방식
    switch (score) {
      case 10:
        grade = "A";
        break;
      case 9:
        grade = "B";
        break;
      case 8:
        grade = "C";
        break;
      default:
        grade = "D";
        break;
    }

    if (score == 10) {
      grade = "A";
    } else if (score == 9) {
      grade = "B";
    } else if (score == 8) {
      grade = "C";
    } else {
      grade = "D";
    }

    System.out.printf("당신의 점수는 %d점이며, 학점은 %s등급입니다.", score, grade);

  }
}
