package object;

class Circle {
  // Field
  private int radius = 1;

  // 생성자 (기본생성자, 초기값 입력 등등)
  /*기본 생성자는 따로 작성하지 않아도 작동됨
  public Circle() {}*/


  // Method

  /**
   * 원의 반지름을 출력하는 메서드
   * 인스턴스를 생성해야 호출할 수 있는 메서드
   * 매개변수 X 리턴값 X
   */
  public void printRadius() {
    System.out.println("원의 반지름 : " + radius);
  }

  public Circle(int radius) {
    this.radius = radius;
  }

  /**
   * 원의 넓이를 구하여 반환하는 메서드
   * 매개변수 X 리턴값 O (double)
   */
  public double getArea() {
    final double PI = 3.14;
    return PI * radius * radius;
  }

  public int getRadius() {
    return radius;
  }

  public void setRadius(int radius) {
    if (radius <= 0) {
      System.out.println("원의 반지름은 0 이하일 수 없습니다.");
    } else {
      this.radius = radius;
    }
  }

  @Override
  public String toString() {
    return "원의 반지름이 " + getRadius() + "이고," +
        "넓이가 " + getArea() + "인 원입니다.";
  }
}
