package basic;

public class IncrementDecrementDemo {
  public static void main(String[] args) {
    int i = 0, j;

    j = i++; // 후위연산자, 연산을 먼저한 후 증가는 나중에
    System.out.printf("i는 %d, j는 %d\n", i, j);

    j = ++i; // 전위연산자, 값 증가를 먼저한 뒤 연산
    System.out.printf("i는 %d, j는 %d", i, j);
  }
}
