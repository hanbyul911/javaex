package basic;

public class Calculator {
  public int add (int a, int b) {
  return a + b;
}

  public int minus (int a, int b) {
    return a - b;
  }

  public int multiply (int a, int b) {
    return a * b;
  }

  public int divide (int a, int b) {
    if (b == 0) {
      return 0;
    }
    return a / b;
  }

  public int[] divideModule (int a, int b) {
    if (b == 0) {
      return null;
    }
    int[] result = new int[2];
    result[0] = a / b;
    result[1] = a % b;
    return result;
  }
}
