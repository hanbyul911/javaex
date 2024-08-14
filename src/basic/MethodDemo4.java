package basic;

import java.util.Arrays;

public class MethodDemo4 {
  public static void main(String[] args) {
    int a = 1_000_000, b = 2_000_000;
    long long1 = 123_223_253_111_333L, long2 = 222_345_311_245_786L;

    // 두 숫자가 주어지면 더해서 int 형으로 반환하는 add method
    System.out.println("=== Add Method ===");
    System.out.println(add(a, b));
    System.out.println(longAdd(long1, long2));

    // 두 숫자가 주어지면 빼서 int 형으로 반환하는 minus method
    System.out.println("=== Minus Method ===");
    System.out.println(minus(a, b));
    System.out.println(longMinus(long1, long2));

    // 두 숫자가 주어지면 곱해서 int 형으로 반환하는 multiply method
    System.out.println("=== Multiply Method ===");
    System.out.println(multiply(a, b));
    System.out.println(longMultiply(a, b));

    // 두 숫자가 주어지면 나눠서 그 몫을 int 형으로 반환하는 divide method
    System.out.println("=== Divide Method ===");
    System.out.println(divide(a, b));
    System.out.printf("%.4f\n", doubleDivide(a, b));

    // 두 숫자가 주어지면 나눠서 몫과 나머지를 int 형으로 반환하는 divideModule method
    System.out.println("=== DivideModule Method ===");
    int[] divided = new int[2];
    divided = divideModule(a, b);
    System.out.printf("%d 을 %d 로 나누었을 때 몫은 %d, 나머지는 %d이다.\n", 2, 3, divided[0], divided[1]);
  }

  public static int add (int a, int b) {
    return a + b;
  }

  public static long longAdd (long a, long b) {
    return a + b;
  }

  public static int minus (int a, int b) {
    return a - b;
  }

  public static long longMinus (long a, long b) {
    return a - b;
  }

  public static int multiply (int a, int b) {
    return a * b;
  }

  public static long longMultiply (int a, int b) {
    return (long) a * b;
  }

  public static int divide (int a, int b) {
    if (b == 0) {
      return 0;
    }
    return a / b;
  }

  public static double doubleDivide (int a, int b) {
    if (b == 0) {
      return 0;
    }
    return (double) a / b;
  }

  public static int[] divideModule (int a, int b) {
    if (b == 0) {
      return null;
    }
    int[] result = new int[2];
    result[0] = a / b;
    result[1] = a % b;
    return result;
  }
}
