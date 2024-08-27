package exercise.ch11;

import java.net.SecureCacheResponse;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Ex4 {
  public static void main(String[] args) {
    List<Integer> scores = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    int score = 0;

    while (score >= 0) {
      try {
        System.out.print("점수를 입력하세요 : ");
        score = sc.nextInt();
        if (score > 100) {
          System.out.println("최고점은 100점을 넘을 수 없습니다.");
        } else if (score >= 0) scores.add(score);
      } catch (InputMismatchException e) {
        System.out.println("잘못된 값이 입력되었습니다. 숫자를 입력해주세요.");
        sc.nextLine();
        //throw new InputMismatchException();
      }
    }

    System.out.println("전체 학생은 " + scores.size() + "명이다.");
    System.out.print("학생들의 성적 : ");

    int total = 0, avg = 0;
    for (Integer i : scores) {
      System.out.print(i + " ");
      total += i;
    }
    System.out.println("\n학생들의 총 점수 합은 " + total + "점이며 평균은 "
        + (total / (double) scores.size()) + "점이다.");



  }
}
