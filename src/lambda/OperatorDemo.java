package lambda;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class OperatorDemo {
  public static void main(String[] args) {
    UnaryOperator<String> addStrings = s -> s + "!!";
    System.out.println(addStrings.apply("hello"));

    BinaryOperator<String> concatStr = (s1, s2) -> (s1 + " " + s2);
    System.out.println(concatStr.apply("hello", "world"));
  }
}
