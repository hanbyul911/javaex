package interface_package;

public class InterfaceDemo {
  public static void main(String[] args) {
    C1 c1 = new C1();
    c1.sayHello();
  }
}

// 구현해야 한다.
class C1 implements MyInterface {
  @Override
  public void sayHello() {
    System.out.println("Hello");
  }
}
