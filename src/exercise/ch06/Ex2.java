package exercise.ch06;

public class Ex2 {
  public static void main(String[] args) {
    Point point = new Point(3,4);
    System.out.println(point.toString());

    MovablePoint movablePoint = new MovablePoint(3,4, 10, 2);
    movablePoint.setxSpeed(60);
    System.out.println(movablePoint.toString());
  }
}

class Point {
  private int x;
  private int y;

  // 생성자
  public Point(int x, int y) {
    this.x = x;
    this.y = y;
  }

  // 메서드 (getter, setter, toString)
  @Override
  public String toString() {
    return "Point{" +
        "x=" + x +
        ", y=" + y +
        '}';
  }

  public int getX() {
    return x;
  }

  public void setX(int x) {
    this.x = x;
  }

  public int getY() {
    return y;
  }

  public void setY(int y) {
    this.y = y;
  }
}

class MovablePoint extends Point {
  // 필드
  private int xSpeed, ySpeed;

  // 생성자
  public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
    super(x, y);
    this.xSpeed = xSpeed;
    this.ySpeed = ySpeed;
  }

  // 메서드 (getter, setter, toString)
  // private 으로 은닉시켜둔 부모의 필드를 가져오기
  @Override
  public String toString() {
    return "Point{x=" + super.getX() +
        ", y=" + super.getY() + "}, " +
        "MovablePoint{" +
        "xSpeed=" + xSpeed +
        ", ySpeed=" + ySpeed +
        '}';
  }

  public int getxSpeed() {
    return xSpeed;
  }
  public void setxSpeed(int xSpeed) {
    this.xSpeed = xSpeed;
  }
  public int getySpeed() {
    return ySpeed;
  }
  public void setySpeed(int ySpeed) {
    this.ySpeed = ySpeed;
  }
}
