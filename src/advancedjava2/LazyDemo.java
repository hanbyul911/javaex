package advancedjava2;

import java.util.stream.IntStream;

public class LazyDemo {
  public static void main(String[] args) {
    IntStream intStream = IntStream.rangeClosed(1, 5);

    intStream.filter(i -> {
      System.out.println("filter : " + i);
      return i % 2 == 0;
    }).map(i -> {
      System.out.println("map : " + i);
      return i * i;
    }).forEach(System.out::println);

    // 최종연산을 만나지 못하면 그 전까지 작동하지 않는다. 오 신기하다!
   // intStream.forEach(System.out::println);
  }
}
