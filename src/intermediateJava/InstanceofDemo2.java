package intermediateJava;

public class InstanceofDemo2 {
  public static void main(String[] args) {
    Circle c1 = new Circle(10);
    Circle c2 = new Circle(10);
    Circle c3 = new Circle(3);
    Person person = new Person();
    System.out.println(c1.radius);

    System.out.println(c1.equals(c2));
    System.out.println(c1.equals(c3));
    System.out.println(c1.equals(person));

    Triangle t1 = new Triangle(3, 5);
    Triangle t2 = new Triangle(15, 1);
    Triangle t3 = new Triangle(4, 4);

    System.out.println(t1.equals(t2));
    System.out.println(t1.equals(t3));
    System.out.println(t2.equals(t3));
    System.out.println(t1.equals(c1));

  }
}

class Circle {
  int radius;

  public Circle(int radius) {
    this.radius = radius;
  }

  // 파라미터 범위를 줄이거나 exception 을 추가할 수 없다.
  @Override
  public boolean equals(Object obj) {
    return (obj instanceof Circle c && c.radius == this.radius);
  }
}
