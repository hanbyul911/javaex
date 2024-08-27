package collection_framework;

import java.util.ArrayList;
import java.util.LinkedList;

public class PerformanceDemo {
  public static void main(String[] args) {
    ArrayList<Integer> alist = new ArrayList<>();
    LinkedList<Integer> llist = new LinkedList<>();

    long start = System.nanoTime();
    for (int i = 0; i < 100000; i++) {
      alist.add(0,i);
    }
    long end = System.nanoTime();
    System.out.println("ArrayList로 처리한 시간 : " + (end - start));

    start = System.nanoTime();
    for (int i = 0; i < 100000; i++) {
      llist.add(0,i);
    }
    end = System.nanoTime();
    System.out.println("LinkedList로 처리한 시간 : " +  (end - start));

    }
}
