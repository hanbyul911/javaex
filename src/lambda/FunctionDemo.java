package lambda;

import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionDemo {
  public static void main(String[] args) {
    Function<String, Integer> checkLength = (s) -> s.length(); // 입력 값 타입과 리턴 타입이 달라도 됨, Operator 는 두 타입이 같음
    /*
    new Function<String, Integer>() {
      @Override
      public Integer apply(String s) {
      return s.length();
    }
     */
    System.out.println(checkLength.apply("I Love JY"));
  }
}
