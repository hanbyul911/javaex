package object;

import java.util.Arrays;

public class ArrayDemo2 {
  public static void main(String[] args) {
    int[] nums = new int[]{10, 20, 30};

    for (int i = 0; i < nums.length; i++) {
      System.out.print(nums[i]);
      if (i != nums.length - 1) {
        System.out.print(", ");
      }
    }

    System.out.println();
    int[] newNum = new int[5];
    for (int i = 0; i < nums.length; i++) {
      newNum[i] = nums[i];
    }
    nums = newNum;
    System.out.println(Arrays.toString(nums));

    // System.arraycopy(복사할 array, scrPos, 목표 array, destPos, length)
    // 길이는 복사할 array 의 길이를 넘을 수 없다.
    int[] scores = {1,2,3,4,5,6};
    int[] newScores = new int[10];
    System.arraycopy(scores, 3, newScores, 4, 3);
    System.out.println(Arrays.toString(newScores));

    newScores[4] = 2411;
    System.out.println(newScores[4] + " " +  scores[4]);

    // Arrays.copyOf(), = 으로 복사할 경우 주소값을 가져와서 elements 값 까지 변경됨
    // Object.clone() 으로 새로운 객체를 만들면 된다.
  }
}
