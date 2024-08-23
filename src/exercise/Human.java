package exercise;

public interface Human {
  void eat();

  /* 단순히 추상메소드를 만들면 해당 인터페이스를 상속받은 클래스에서 새로 구현을 해야하기 때문에
  static 이나 default 메서드를 만들어 따로 구현하지 않아도 되도록 한다.
   */

  default void print() {
    System.out.println("인간입니다.");
  }

  static void echo() {
    System.out.println("야호");
  }
}

// 기존 사용하던 class 에 영향을 받지 않게 구현
class Worker implements Human {
  @Override
  public void eat() {
    System.out.println("빵을 먹습니다.");
  }
}

class StudentHuman implements Human {
  int age;

  public StudentHuman(int age) {
    this.age = age;
  }

  @Override
  public void print() {
    System.out.println(age + "세의 학생입니다.");
  }

  @Override
  public void eat() {
    System.out.println("도시락을 먹습니다.");
  }
}
