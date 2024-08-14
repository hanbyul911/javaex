package basic;

public class MethodDemo3 {
  public static void main(String[] args) {
    // 두 숫자가 주어지면 더해서 int 형으로 반환하는 add method
    System.out.println("=== Add Method ===");
    System.out.println(add(2, 3));
    System.out.println(add(10, 20));
    System.out.println(add(100, 200));

    // 두 숫자가 주어지면 빼서 int 형으로 반환하는 minus method
    System.out.println("=== Minus Method ===");
    System.out.println(minus(2, 3));
    System.out.println(minus(20, 10));
    System.out.println(minus(200, 100));

    // 두 숫자가 주어지면 곱해서 int 형으로 반환하는 multiply method
    System.out.println("=== Multiply Method ===");
    System.out.println(multiply(2, 3));
    System.out.println(multiply(20, 10));
    System.out.println(multiply(200, 100));

    // 두 숫자가 주어지면 나눠서 그 몫을 int 형으로 반환하는 divide method
    System.out.println("=== Divide Method ===");
    System.out.println(divide(2, 3));
    System.out.println(divide(20, 10));
    System.out.println(divide(200, 100));

    // 두 숫자가 주어지면 나눠서 몫과 나머지를 int 형으로 반환하는 divideModule method
    System.out.println("=== DivideModule Method ===");
    int[] divided = new int[2];
    divided = divideModule(2, 3);
    System.out.printf("%d 을 %d 로 나누었을 때 몫은 %d, 나머지는 %d이다.\n", 2, 3, divided[0], divided[1]);
    divided = divideModule(20, 10);
    System.out.printf("%d 을 %d 로 나누었을 때 몫은 %d, 나머지는 %d이다.\n", 20, 10, divided[0], divided[1]);
    divided = divideModule(200, 100);
    System.out.printf("%d 을 %d 로 나누었을 때 몫은 %d, 나머지는 %d이다.\n", 20, 100, divided[0], divided[1]);

  }

  public static int add (int a, int b) {
    return a + b;
  }

  public static int minus (int a, int b) {
    return a - b;
  }

  public static int multiply (int a, int b) {
    return a * b;
  }

  public static int divide (int a, int b) {
    return a / b;
  }

  public static int[] divideModule (int a, int b) {
    int[] result = new int[2];
    result[0] = a / b;
    result[1] = a % b;
    return result;
  }
}
