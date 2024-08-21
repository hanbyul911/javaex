package object;

import java.util.Arrays;
import java.util.stream.Collectors;

public class VarArgsDemo {
  public static void main(String[] args) {
    printSum(1, 3, 5, 3);
    printSum(1, 10);
    joinString("hello"," world");
  }

  private static void joinString(String... str) {
  }

  // 가변 개수 인자 - 동일한 데이터타입을 여러개 입력하면 배열로 받음
  // 가변 개수는 매개변수의 가장 뒷자리에만 올 수 있다.
  private static void printSum(int... i) {
    int sum = 0;
    for (int n : i) {
      sum += n;
    }
    System.out.println(sum);
  }
}
