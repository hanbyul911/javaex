package exercise.ch12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class Book6 {
  public static void main(String[] args) {
    List<Member> list = Arrays.asList(
        new Member("홍길동", 30),
        new Member("한별", 32),
        new Member("이민형", 24)
    );

    Double average = list.stream()
        .mapToInt(i -> i.getAge())
        .average().orElse(0.0);
    // orElse 조건 없으면 optional 로 꺼내짐
    System.out.println(average);
  }
}

class Member {
  private String name;
  private int age;
  private String job;

  public Member(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public Member(String name, String job) {
    this.name = name;
    this.job = job;
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  public boolean isDeveloper() {
    return this.job.equals("개발자");
  }
}
