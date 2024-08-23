package interface_package;

public interface MyInterface {
  int max = 10; // 상수 , public static final 이 생략되어 있다.

  void sayHello(); // abstract 추상메서드, public abstract 가 생략되어 있다.

  default void byeHello() {
    System.out.println("상수값은 " + getMax());
    System.out.println("bye");
  }

  static void method() {
    System.out.println("static method 입니다.");
  }

  private int getMax() {
    return max;
  }
}
