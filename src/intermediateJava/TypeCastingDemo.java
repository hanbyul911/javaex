package intermediateJava;

import com.sun.security.jgss.GSSUtil;

public class TypeCastingDemo {
  public static void main(String[] args) {
    Vehicle v = new Car(); // 자동형변환, upcasting

    System.out.println(v.name);
    System.out.println(((Car) v).name);
    v.whoami(); // 오버라이딩 된 메서드는 기존 클래스가 아닌 오버라이딩 된 메서드가 실행된다.
    v.move();
    ((Car) v).move();

    Vehicle v2;
    // System.out.println("업캐스팅 전 v2 주소 : " + System.identityHashCode(v2)); 선언만으로는 주소가 생성되지 X
    Car c1 = new Car();
    System.out.println("업캐스팅 전 c1 주소 : " + System.identityHashCode(c1));
    v2 = c1;
    System.out.println("업캐스팅 후 v2 주소 : " + System.identityHashCode(v2));
    System.out.println("v2를 다운캐스팅한 주소 : " + System.identityHashCode((Car) v2));
    // up, downcasting 후 주소는 모두 동일하다. 그러면 값만 제한하는 건지 궁금하다. 음 객체자체는 따로 생성되니까 접근을 따로 하는 것 같다

    SportsCar sp = new SportsCar();
    System.out.println(sp.name);
    sp.whoami();
    sp.move(); // SportsCar.move();
    sp.equal();
  }
}

class Vehicle {
  String name = "탈 것";

  void whoami() {
    System.out.println("나는 탈 것입니다.");
  }

  // static 메서드는 클래스 소속이므로 자식 클래스에 상속되지 않는다.
  static void move() {
    System.out.println("이동하다.");
  }
}

class Car extends Vehicle {
  String name = "자동차";

  @Override
  void whoami() {
    System.out.println("나는 자동차입니다.");
  }

  static void move() {
    System.out.println("달리다.");
  }
}

class SportsCar extends Vehicle {
  String name = "스포츠카";

  void equal () {
    System.out.println("나의 이름 : " + this.name);
    System.out.println("부모의 이름 : " + super.name);
  }

  // 동적바인딩, 컴파일할 때 덮어씌움
  @Override
  void whoami() {
    System.out.println("나는 스포츠카입니다.");
  }

  static void move () {
    System.out.println("빠르게 달리다.");
  }
}

