package exercise.ch11;

import java.rmi.StubNotFoundException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

public class Ex2 {
  public static void main(String[] args) {
    Set<Person> set = new HashSet<>();
    set.add(new Person("김열공", 20));
    set.add(new Person("최고봉", 56));
    set.add(new Person("우등생", 16));
    set.add(new Person("우등생", 16));
    set.add(new Person("나자바", 35));
    set.add(new Person("나자바", 35));
    // 동일한 사람을 추가해도 된다. hashcode 와 equals 구현이 안되어 있기 때문
    Iterator<Person> iterator = set.iterator();
    Person person;
    while (iterator.hasNext()) {
      person = iterator.next();
      System.out.println(person.name + " : " + person.age);
    }

    iterator = set.iterator();
    while (iterator.hasNext()) {
      System.out.print(iterator.next() + " ");
    }
  }
}

class Person {
  String name;
  int age;

  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Person person)) return false;
    return age == person.age && Objects.equals(name, person.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, age);
  }

  /*
  class 비교 포함
  @Override
  public boolean equals(Object o) {
    *//*
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Person person = (Person) o;
    return age == person.age && Objects.equals(name, person.name);*//*
    if (o != null && o instanceof Person) {
      Person person = (Person) o;
      return this.name.equals(person.name) && this.age == person.age;
    }
    return false;
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, age);
  }*/

  @Override
  public String toString() {
    return "Person[" + name + " : " + age + "]";
  }
}
