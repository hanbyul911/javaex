package advancedjava;

import java.util.ArrayList;
import java.util.LinkedList;

public class SystemDemo {
  public static void main(String[] args) {
    ArrayList al = new ArrayList();
    LinkedList ll = new LinkedList();
    // 실행 횟수가 적을 때는 arraylist 가 효율적이고 데이터가 많고 계산을 많이해야 할 때는 linkedlist 가 더 효율적..
    // 인데 실제 결과는 그렇진 않은 걸?!
    // 각각 적합한 데이터 타입을 사용하면 좋다.

    long before = System.nanoTime();
    for (int i = 0; i < 1000000; i++) {
      al.add(i);
    }
    long after = System.nanoTime();
    System.out.println("ArrayList 실행시간 :" + (after - before));

    before = System.nanoTime();
    for (int i = 0; i < 1000000; i++) {
      ll.addFirst(i);
    }
    after = System.nanoTime();
    System.out.println("LinkedList 실행시간 :" + (after - before));

    // currentTimeMillis 는 너무 작은 시간 단위는 측정하지 못한다.
    /*
    after = System.currentTimeMillis();
    System.out.println("ArrayList 실행시간 :" + (after - before));

    before = System.currentTimeMillis();
    for (int i = 0; i < 100; i++) {
      ll.add(i);
    }
    after = System.currentTimeMillis();
    System.out.println("LinkedList 실행시간 :" + (after - before));
*/

  }
}
