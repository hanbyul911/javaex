package advancedjava2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class StreamDemo {
  public static void main(String[] args) {
    //before
    List<Integer> list = new ArrayList<Integer>();
    Random r = new Random();

    for (int i = 0; i < 10; i++) {
      list.add(r.nextInt(30));
    }

    List<Integer> gt10 = new ArrayList<>();
    for (Integer i : list) {
      if (i > 10) gt10.add(i);
    }

    Collections.sort(gt10);
    //System.out.println(list);
    System.out.println(gt10);
    //System.out.println(gt10.size());

    //after
    list.stream().filter(x -> x > 10)
        .sorted()
        .forEach(System.out::println);
  }
}
