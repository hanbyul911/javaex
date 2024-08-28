package lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LambdaDemo {
  public static void main(String[] args) {
    // 1. (a, b) -> a > b ? a : b
    // 2. (name, i) -> System.out.println(name + "=" + i)
    // 3. x -> x * x;
    // 4. () -> < (int)(Math.random() * 6)
   /* Object obj = new Object(){
      int max(int a, int b) {
        return a > b ? a : b;
      }
    };*/

    //int max = obj.max(1,2); // Object에는 max라는 메소드가 없음

    MyFunction f = new MyFunction() {
      @Override
      public int max(int a, int b) {
        return a > b ? a : b;
      }
    };

    System.out.println(f.max(10, 8));

    List<String> list = Arrays.asList("abc", "aaa", "bbb", "ccc");
    Collections.sort(list, (o1, o2) -> o1.compareTo(o2));
    System.out.println(list);


  }
}

interface MyFunction {
  public abstract int max (int a, int b);
}

@FunctionalInterface // abstract 메소드가 하나!만 있음
interface NewFunction {
  int min(int a, int b);
  // boolean test();
}
