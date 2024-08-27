package exercise.ch06;

public class Ex6 {
  public static void main(String[] args) {
    Car c = new Car("파랑", 200, 1000, 5);
    c.show();

    System.out.println();
    Vehicle v = c;
    // v.gears; 업캐스팅하면 부모 필드와 메서드만 이용 가능하다
    v.show();
  }
}

class Vehicle {
  String color;
  int speed;

  public Vehicle(String color, int speed) {
    this.color = color;
    this.speed = speed;
  }

  void show() {
    System.out.println("Color: " + color + ", Speed: " + speed);
  }
}

class Car extends Vehicle {
  int displacement;
  int gears;

  public Car(String color, int speed, int displacement, int gears) {
    super(color, speed);
    this.displacement = displacement;
    this.gears = gears;
  }

  @Override
  void show() {
    System.out.println("Color: " + color + ", Speed: " + speed + ", Displacement: " + displacement + ", Gears: " + gears);
  }
}
