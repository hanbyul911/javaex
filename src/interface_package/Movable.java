package interface_package;

public interface Movable {
  void move(int distance);
}

class Vehicle implements Movable {
  @Override
  public void move(int distance) {
    System.out.println("모든 탈 것은 " + distance + "만큼 움직인다.");
  }
}

class Car extends Vehicle {
  int gears;

  @Override
  public void move(int distance) {
    System.out.println("자동차는 " + distance + " 거리만큼 이동한다.");
  }

  public void show() {
    System.out.println("");
  }
}