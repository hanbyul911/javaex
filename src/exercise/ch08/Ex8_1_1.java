package exercise.ch08;

public class Ex8_1_1 {
  public static void main(String[] args) {
    NewCircle newCircle = new NewCircle(10);
    NewCircle newCircle2 = new NewCircle(10);

    if (newCircle.equals(newCircle2)) {
      System.out.println("두 원은 같습니다.");
    } else {
      System.out.println("두 원은 같지 않습니다.");
    }
  }
}

class NewCircle {
  int radius;

  public NewCircle(int radius) {
    this.radius = radius;
  }

  @Override
  public boolean equals(Object obj) {
    if (obj instanceof NewCircle) {
      NewCircle c = (NewCircle) obj;
      return c.radius == radius;
    }
    return false;
  }
}
