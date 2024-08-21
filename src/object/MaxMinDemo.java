package object;

import java.util.Arrays;

public class MaxMinDemo {
  public static void main(String[] args) {
    int[] scores = {40, 30, 70, 90, 87, 100};

    int max = findMax(scores);
    int min = findMin(scores);

    System.out.println("최대값 : " + max);
    System.out.println("최소값 : " + min);

   // Arrays.stream(scores).max().ifPresent(System.out::println);
   // Arrays.stream(scores).min().ifPresent(System.out::println);

    System.out.println(Arrays.toString(scores));
  }

  public static int findMax(int[] scores) {
    /*int[] tmp = scores.clone();
    Arrays.sort(tmp);
    int max = tmp[tmp.length - 1];
    */
    int max = Integer.MIN_VALUE;
    for (int score : scores) {
      max = Math.max(max, score);
    }
    return max;
  }

  public static int findMin(int[] scores) {
    /*int[] tmp = scores.clone();
    Arrays.sort(tmp);
    int min = tmp[0];
    */
    int min = Integer.MAX_VALUE; // 배열 첫번째 값으로 설정하고 두번째 인자부터 비교하는 방법도 있음
    for (int score : scores) {
      min = Math.min(min, score);
    }
    return min;
  }
}
