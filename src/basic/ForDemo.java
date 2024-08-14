package basic;

public class ForDemo {
  public static void main(String[] args) {
    for (int i = 0; i < 3; i++) {
      System.out.printf("%d번째 Hello World\n", i);
    }
    // for() 조건 안에서 설정한 변수는 블록 안에서만 작동된다.
    // for(변수 선언(초기값); 변수 범위(종료조건); 변수 규칙)

    int sum = 0;
    for (int i = 1; i <= 10; i++) {
      sum += i;
    }
    System.out.println("1부터 10까지 합은 " + sum);

    sum = 0;
    for (int i = 10; i <= 100; i++) {
      sum += i;
    }
    System.out.println("10부터 100까지 합은 " + sum);

    sum = 0;
    for (int i = 100; i <= 1000; i++) {
      sum += i;
    }
    System.out.println("100부터 1000까지 합은 " + sum);
  }
}
