package basic;

public class IncrementDemo {
  public static void main(String[] args) {
    int num = 0;

    System.out.println("increment 호출 전 x = " + num);
    increment(num);
    System.out.println("increment 호출 후 x = " + num);
  }

  public static void increment(int i) {
    System.out.println("increment 메소드 시작 x = " + i);
    i++;
    System.out.println("increment 메소드 종료 x = " + i);
  }
}
