package intermediateJava;

public class InstanceOfDemo {
  public static void main(String[] args) {
    Student s = new Student();
    Person p = new Person();
    Army a = new Army();

    System.out.println(s instanceof Person);
    System.out.println(s instanceof Student);
    System.out.println(s instanceof Object);
    // System.out.println(s instanceof String);

    // p = s;

    downcast(p);
    downcast(a);
  }

  private static void downcast(Person p) {
    if (p instanceof Student s) {
      System.out.println(s.number);
      s.work();
    } else if (p instanceof Army a) {
      System.out.println(a.name);
      a.work();
    } else {
      System.out.println("다운 캐스팅할 수 없습니다.");
    }
  }
}
