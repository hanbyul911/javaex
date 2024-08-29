package lambda;

import java.util.function.Supplier;

public class SupplierDemo {
  public static void main(String[] args) {
    Supplier<String> sayHello = () -> "Hello"; // Supplier<Return Type>
    System.out.println(sayHello.get());
  }
}
