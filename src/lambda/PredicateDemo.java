package lambda;

import java.util.function.BiPredicate;
import java.util.function.IntPredicate;
import java.util.function.Predicate;

public class PredicateDemo {
  public static void main(String[] args) {
    IntPredicate even = i -> i % 2 == 0;
    /* new IntPredicate() {
      @Override
      public boolean test(int value) {
        return value % 2 == 0;
      }
    };
*/
    System.out.println(even.test(5));
    System.out.println(even.test(4));

    BiPredicate<Integer, Integer> bi = (i, j) -> i == j;
        /*new BiPredicate<Integer, Integer>() {
      @Override
      public boolean test(Integer integer, Integer integer2) {
        return false;
      }
    }*/
    System.out.println(bi.test(1,2));
    System.out.println(bi.test(2,2));

    Predicate<Integer> p = i -> i > 0;
//        new Predicate<Integer>() {
//      @Override
//      public boolean test(Integer integer) {
//        return false;
//      }
//    };
    System.out.println(p.test(-10));
    System.out.println(p.test(7));
  }
}
