package exercise.ch11;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Test8 {
  public static void main(String[] args) {
    Set<Student> set = new HashSet<>();

    set.add(new Student(1, "홍길동"));
    set.add(new Student(2, "한별"));
    set.add(new Student(1, "이주연"));

    System.out.println("저장된 객체의 수 : " + set.size());
    for (Student student : set) {
      System.out.println(student.studentNum + " : " + student.name);
    }
  }
}

class Student {
  int studentNum;
  String name;

  public Student(int studentNum, String name) {
    this.studentNum = studentNum;
    this.name = name;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj instanceof Student) {
      return studentNum == ((Student) obj).studentNum;
    }
    return false;
  }

  @Override
  public int hashCode() {
    return Objects.hash(studentNum);
  } // 내부적으로 쓰여서 우리가 따로 호출하지 않아도 구현해둬야한다.
}
