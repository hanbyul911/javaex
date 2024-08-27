package exercise.inter;

public class LineTest {
  public static void main(String[] args) {
    //Line line1 = new Line(10);
    String line2 = "test";
    Line line1 = new Line(20);

    if (line2.compareTo(line2) == -999) {
      System.out.println("길이를 비교할 수 없습니다.");
      return;
    }

    if (line1.compareTo(line2) == 1) {
      System.out.println(line1.toString() + "이 더 깁니다.");
    } else if (line1.compareTo(line2) == -1) {
      System.out.println(line2.toString() + "이 더 깁니다.");
    } else if (line1.compareTo(line2) == 0) {
      System.out.println("길이가 동일합니다.");
    }
  }
}
