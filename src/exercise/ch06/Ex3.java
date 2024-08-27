package exercise.ch06;

public class Ex3 {
  public static void main(String[] args) {
    Person[] people = new Person[3];
    people[0] = new Person("길동이", 22);
    people[1] = new Student("황진이", 23, 100);
    people[2] = new ForeignStudent("Amy", 30, 200, "U.S.A");

    for (Person person : people) {
      System.out.println(person.show());
    }
  }
}

class Person {
  private String name;
  private int age;

  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public String show() {
    return String.format("사람[이름 : %s, 나이 : %d]", name, age);
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }
}

class Student extends Person {
  private int number;

  public Student(String name, int age, int number) {
    super(name, age);
    this.number = number;
  }

  @Override
  public String show() {
    return String.format("사람[이름 : %s, 나이 : %d, 학번 : %d]", super.getName(), super.getAge(), number);
  }

  public int getNumber() {
    return number;
  }
}

class ForeignStudent extends Student {
  private String nation;

  public ForeignStudent(String name, int age, int number, String nation) {
    super(name, age, number);
    this.nation = nation;
  }

  @Override
  public String show() {
    return String.format("사람[이름 : %s, 나이 : %d, 학번 : %d, 국적 : %s]", super.getName(), super.getAge(), super.getNumber(), nation);
  }

  public String getNation() {
    return nation;
  }
}