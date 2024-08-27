package exercise.ch06;

public class Ex4 {
  public static void main(String[] args) {
    Parent p = new Child();
    System.out.println(p.name);
    p.print();

    Child c = new Child();
    System.out.println(c.getSuperName());
  }
}

class Parent {
  String name = "영조";

  void print() {
    System.out.println("뭐하라는 건지 안알려줬는디요");
  }
}

class Child extends Parent {
  String name = "사도세자";

  public String getSuperName() {
    return super.name;
  }

  @Override
  void print() {
    System.out.println("야는 아들이어라");
  }
}
