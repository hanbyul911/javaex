package intermediateJava;

public class ClassCastDemo {
  public static void main(String[] args) {
    Triangle triangle = new Triangle(3, 3);
    // Eagle e = triangle; 서로 다른 형이라 대입이 안된다.
    Figure f = triangle;
    System.out.println(f.poly);
  }
}
