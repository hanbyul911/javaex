package exercise;

import java.util.Arrays;

public class Ex7_3_4 {
  public static void main(String[] args) {

    PersonEx[] person = {new PersonEx("박지성", 40, 175, 68), new PersonEx("홍길동", 32, 170, 75),
        new PersonEx("손흥민", 20, 180, 70)};

    //Arrays.sort(person, (a, b) -> a.height - b.height);
    Arrays.sort(person);

    for (PersonEx personEx : person) {
      System.out.println(personEx.toString());
    }
  }
}

class PersonEx implements Comparable<PersonEx> {
  String name;
  int age, height, weight;

  public PersonEx(String name, int age, int height, int weight) {
    this.name = name;
    this.age = age;
    this.height = height;
    this.weight = weight;
  }

  @Override
  public String toString() {
    return "PersonEx[" +
        "name='" + name + '\'' +
        ", age=" + age +
        ", height=" + height +
        ", weight=" + weight +
        ']';
  }

  @Override
  public int compareTo(PersonEx o) {
    return o.age - this.age;
  }
}
