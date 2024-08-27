package exercise.inter;

public class HumanTest {
  public static void main(String[] args) {
    Human.echo();
    StudentHuman studentHuman = new StudentHuman(20);
    studentHuman.print();
    studentHuman.eat();

    Human p = new Worker();
    p.print();
    p.eat();
  }
}
