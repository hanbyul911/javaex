package lambda;

public class MethodRefDemo {
  public static void main(String[] args) {
    Mathematical m;
    m = Math::abs;
    System.out.println(m.calculate(-34));
  }
}

interface Mathematical {
  double calculate(double d);
}

