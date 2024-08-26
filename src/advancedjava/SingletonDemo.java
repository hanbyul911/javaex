package advancedjava;

public class SingletonDemo {
  public static void main(String[] args) {
    // Singleton singleton = new Singleton(); 생성자로 새로 생성 불가
    // 왜.. 쓰는 거지? 전체 프로그램에서 한번만 쓰고 싶어서 그런건가. 그러면 final 상수로 쓰면 되지 않나?
    Singleton.getValue();

    Singleton singleton = Singleton.getInstance();
    Singleton singleton2 = Singleton.getInstance();

    if (singleton == singleton2) {
      System.out.println("같은 객체입니다.");
    } else {
      System.out.println("같은 객체가 아닙니다.");
    }
  }
}

class Singleton {
  private static Singleton singleton = new Singleton();

  private Singleton() {
  }

  public static int getValue() {
    return 0;
  }

  public static Singleton getInstance() {
    return singleton;
  }
}
