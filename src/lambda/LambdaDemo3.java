package lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class LambdaDemo3 {
  public static void main(String[] args) {
    String[] strings = {"abcde", "a", "abc"};

    /*
    Arrays.sort(strings, new Comparator<String>() {
      @Override
      public int compare(String o1, String o2) {
        return o1.length() - o2.length();
      }
    });
    */

    Arrays.sort(strings, (a, b) -> a.length() - b.length());
    System.out.println(Arrays.toString(strings));
  }
}
