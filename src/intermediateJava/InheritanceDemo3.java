package intermediateJava;

import java.util.Arrays;

public class InheritanceDemo3 {
  public static void main(String[] args) {
    Child child = new Child();
    child.method3();
    child.method1();
    child.method2();
  }
}

class Parent {
  void method1 () {
    System.out.println("method1 == parent");
  }

  void method2 () {
    System.out.println("method2 == parent");
  }
}

class Child extends Parent {
  @Override // 어노테이션 유무로 컴파일러한테 알려주는 역할, 어노테이션을 안적으면 컴파일러가 안알려줌
  void method2() {
    System.out.println("method2 == modified by child");
  }

  void method3 () {
    System.out.println("method3 == added by child");
  }
}
