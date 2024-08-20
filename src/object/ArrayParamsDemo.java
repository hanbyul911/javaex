package object;

public class ArrayParamsDemo {
  public static void main(String[] args) {
    if (args.length == 1) {
      System.out.println("메인 메서드로 전달된 인자는 " + args[0] + " 입니다.");
      return;
    }

    int[] x = {0};
    System.out.println("호출전 ==> " + x[0]);

    increment(x);
    System.out.println("호출후 ==> " + x[0]);
  }

  public static void increment(int[] x) {
    System.out.println("메서드 안에서 증가하기 전 ==> " + x[0]);
    x[0]++;
    System.out.println("메서드 안에서 증가시킨 후 ==> " + x[0]);
  }
}
