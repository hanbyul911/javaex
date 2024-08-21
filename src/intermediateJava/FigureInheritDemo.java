package intermediateJava;

public class FigureInheritDemo {
  public static void main(String[] args) {
    Triangle triangle = new Triangle(3, 3, 3);
    double triArea = triangle.getArea();
    System.out.println(triArea);

    Rectangle rectangle = new Rectangle(3,3,4);
    System.out.println(rectangle.getArea());
  }
}

class Figure {
  int poly;


  public double getArea() {
    return 0.0;
  }
}

class Triangle extends Figure {
  private int height;
  private int width;

  public Triangle(int height, int width, int poly) {
    this.height = height;
    this.width = width;
    this.poly = poly;
  }

  @Override
  public double getArea() {
    return width * height / (double) 2;
  }
}
class Rectangle extends Figure {
  private int height;
  private int width;

  public Rectangle(int height, int width, int poly) {
    this.height = height;
    this.width = width;
    this.poly = poly;
  }

  @Override
  public double getArea() {
    return height * width;
  }
}
class pentagon extends Figure {}
