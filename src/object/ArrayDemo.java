package object;

public class ArrayDemo {
  public static void main(String[] args) {
    // 배열 선언 방법 1
    int[] scores = new int[]{10, 20, 30, 40, 50};

    for (int i = 0; i < scores.length; i++) {
      System.out.print(scores[i] + " ");
    }
    System.out.println();

    // 배열 선언 방법 2
    int[] scores2 = new int[10];
    for (int i = 0; i < scores2.length; i++) {
      scores2[i] = (i + 1) * 10;
      System.out.print(scores2[i] + " ");
    }

    // 배열 선언 방법 3
    int[] scores3 = {1, 2, 3, 4, 5};

    // 배열의 크기는 불변, 그 안의 값은 바꿀 수 있다.
  }
}
