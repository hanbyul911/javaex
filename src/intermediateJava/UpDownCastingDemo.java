package intermediateJava;

public class UpDownCastingDemo {
  public static void main(String[] args) {
  /*  Person p = new Person();
    Student s = (Student) p; // 업캐스팅 하지 않은 부모 클래스를 다운캐스팅 하려고 하면 오류가 난다.*/

    Student s = new Student();
    Person p = s;

    // p.number;
    // p.work;
  }
}
