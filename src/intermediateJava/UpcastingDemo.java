package intermediateJava;

public class UpcastingDemo {
  public static void main(String[] args) {
    /*Student s = new Student();
    System.out.println(s.name);
    System.out.println(s.number);
    s.whoami();
    s.work();

    Person p = s;*/
    // System.out.println(p.number);
    // p.work();
    // upcasting 하는 경우 부모 클래스가 가지고 있는 필드와 메서드만 사용 가능하다.

    // 부모 클래스의 배열로 업캐스팅해서 배열에 넣으면 기존 코드를 수정하지 않아도 되는 solid 함
    Person[] persons = new Person[5];
    persons[0] = new Student();
    System.out.println(persons[0].seq);
    persons[1] = new Army();
    System.out.println(persons[1].seq);
    persons[2] = new Owner();
    System.out.println(persons[2].seq);
    persons[3] = new Employee();
    System.out.println(persons[3].seq);
    persons[4] = new Employee();
    System.out.println(persons[4].seq);
  }
}

class Person {
  static int seq;
  String name = "사람";

  void whoami() {
    System.out.println("나는 사람이다.");
  }

  public Person() {
    seq++;
  }
}

class Student extends Person {
  int number = 7;

  void work() {
    System.out.println("나는 공부한다.");
  }
}

class Employee extends Person {
  int number = 10;

  void work() {
    System.out.println("나는 일한다.");
  }
}

class Owner extends Employee {
  int number = 3;
  void work() {
    System.out.println("나는 회사를 관리한다.");
  }
}

class Army extends Person {
  int number = 1;
  void work() {
    System.out.println("나는 국가를 지킨다.");
  }
}