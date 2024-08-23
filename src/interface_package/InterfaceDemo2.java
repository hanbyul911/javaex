package interface_package;

public class InterfaceDemo2 {
  public static void main(String[] args) {
    C2 c2 = new C2();
    c2.byeHello();

    System.out.println(c2.max);
    MyInterface.method();
    System.out.println(MyInterface.max);
    // MyInterface.getMax();
  }
}

class C2 implements MyInterface {
  @Override
  public void sayHello() {
    System.out.println("졸려죽ㅇ르거같은데요..");
  }
}
