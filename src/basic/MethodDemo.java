package basic;

public class MethodDemo {
  public static void main(String[] args) {
    System.out.println(sumRepeat(1,100));
    System.out.println(sumRepeat(35,1));
    System.out.println(sumRepeat(1,35));
    System.out.println(sumRepeat(11,50));
  }

  /**
   * 두 개의 숫자를 입력 받아서 작은 수 부터 큰 수까지의 합을 구하는 method
   * @param a
   * @param b
   * @return
   */
  public static int sumRepeat (int a, int b) {
    if (a > b) {
      int tmp;
      tmp = a;
      a = b;
      b = tmp;
    }

    int sum = 0;
    for (int i = a; i <= b; i++) {
      sum += i;
    }

    return sum;
  }
}
