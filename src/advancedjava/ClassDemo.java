package advancedjava;

import exercise.Line;

public class ClassDemo {
  public static void main(String[] args) {
    Line line = new Line(10);

    Class aClass = line.getClass(); // 임의의 class 에 대입됨
    System.out.println(aClass.getName());
    System.out.println(aClass.getSimpleName());
    System.out.println(aClass.getTypeName());
    System.out.println(aClass.getPackage());
  }
}
