package interface_package;

public class InterfaceDemo6 {
  public static void main(String[] args) {
    Movable m = new Car();
    m.move(100);
    ((Car)m).show();
    Car c = (Car) m;

    c.move(100);
    c.show();
  }
}
