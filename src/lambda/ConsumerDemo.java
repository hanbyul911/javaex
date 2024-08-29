package lambda;

import java.util.function.Consumer;
import java.util.function.ObjIntConsumer;

public class ConsumerDemo {
  public static void main(String[] args) {
    Consumer<String> consumer = System.out::println;
    /* 1. new Consumer<String>() {
      @Override
      public void accept(String s) {
        System.out.println(s);
      }
    };*/
    /* 2. s -> System.out.println(s); */

    consumer.accept("How tired");

    ObjIntConsumer<String> printItimes = (s, i) -> {
      for (int j = 0; j < i; j++) {
        System.out.println(s);
      }
    };
        /*new ObjIntConsumer<>() {
      @Override
      public void accept(String s, int value) {
        for (int i = 0; i < value; i++) {
          System.out.println(s);
        }
      }
    };*/
    printItimes.accept("repeat", 3);
  }
}
