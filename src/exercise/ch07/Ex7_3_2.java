package exercise.ch07;

public class Ex7_3_2 {
  public static void main(String[] args) {
    Triangle t1 = new Triangle(10, 10);
    Triangle t2 = new Triangle(24, 5);

    if (t1.compareTo(t2) > 0) {
      System.out.println(t1.toString() + "이 더 큽니다.");
    } else if (t1.compareTo(t2) < 0) {
      System.out.println(t2.toString() + "이 더 큽니다.");
    } else {
      System.out.println("두 삼각형의 크기가 같습니다.");
    }
  }
}

class Triangle implements Comparable<Triangle> {
  int width, height;

  @Override
  public String toString() {
    return "삼각형[" +
        "width=" + width +
        ", height=" + height +
        ", 넓이=" + getArea() +
        ']';
  }

  public Triangle(int width, int height) {
    if (width <= 0 || height <= 0) {
      System.out.println("0 이하의 값이 변의 길이로 올 수 없습니다.");
      throw new IllegalArgumentException();
    }
    this.width = width;
    this.height = height;
  }

  public double getArea() {
    return width * height / (double) 2;
  }

  @Override
  public int compareTo(Triangle o) {
    if (getArea() < o.getArea()) {
      return -1;
    } else if (getArea() > o.getArea()) {
      return 1;
    } else {
      return 0;
    }
  }
}
