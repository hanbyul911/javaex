package object;

public class WithArrayDemo {
  public static void main(String[] args) {
    // 배열 : 동일한 type 의 변수가 연속된 메모리에 집합되어 있는 구조
    //int[] scores = new int[4];
    int[] scores = {90, 75, 85, 75, 80, 90, 100, 60, 99, 88};
    int sum = 0;

    System.out.println(scores.length);
    for (int i = 0; i < scores.length ; i++) {
      System.out.println(scores[i]);
      sum += scores[i];
    }
    // 평균값 구하기 : 소수점 두번째 자리까지, 재사용성을 고려하여
    double average = (double) sum / scores.length;
    System.out.println("sum = " + sum);
    System.out.printf("average = %.2f", average);
  }
}
