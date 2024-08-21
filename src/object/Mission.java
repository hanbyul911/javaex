package object;

import java.util.ArrayList;
import java.util.Scanner;

public class Mission {
  public static void main(String[] args) {
    // 학생의 점수를 입력받아서 저장하고 sum과 avg를 구하라.
    // 학생의 수는 정해져 있지 않다. 더 이상 입력받지 않으려면 - 값을 입력한다.
    // (재사용성을 고려)

    Scanner sc = new Scanner(System.in);
    int score, sum = 0;
    double avg;
    ArrayList<Integer> scores = new ArrayList<>();

    /*    while (true) {
      System.out.print("점수를 입력해주세요. (입력을 종료하려면 음수 값을 입력해주세요.) : ");
      score = sc.nextInt();
      if (score < 0) {
        System.out.println("점수 입력을 종료합니다.");
        break;
      } else {
        scores.add(score);
      }
    }
    */

    do {
      System.out.print("점수를 입력해주세요. (입력을 종료하려면 음수 값을 입력해주세요.) : ");
      score = sc.nextInt();
      if (score >= 0) {
        scores.add(score);
      }
    } while (score >= 0);
    System.out.println("점수 입력을 종료합니다.");

    for (Integer i : scores) {
      sum += i;
    }
    avg = sum / (double) scores.size();

    System.out.println("입력한 학생들의 점수는 " + scores + "입니다.");
    System.out.printf("입력한 %d명의 학생들의 점수 합은 %d 이고 평균 점수는 %.2f 입니다.", scores.size(), sum, avg);
  }
}
