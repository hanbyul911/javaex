package exercise.ch08;

public class Ex8_2 {
  public static void main(String[] args) {
    System.out.println(new NewStudent("김삿갓"));
    System.out.println(new NewStudent("홍길동"));
  }
}

class NewStudent {
  String name;

  public NewStudent(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "학생[" + name + "]";
  }
}