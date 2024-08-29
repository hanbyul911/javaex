package lambda;


import java.util.Collections;
import java.util.Comparator;

public class CarDemo {
  public static void main(String[] args) {
    Car car = new Car("K3", true, 4, 25000);
    System.out.println(car);
    /*int cnt = 0;
    for (Car c : Car.cars) {
      if (c.getModel().equals("소나타")) {
        cnt++;
      }
      System.out.println(c);
    }

    System.out.println("소나타는 모두 " + cnt + "대 입니다.");*/

    Collections.sort(Car.cars, (car1, car2) -> car1.getAge() - car2.getAge());
    System.out.println(Car.cars);
    System.out.println();
    Collections.sort(Car.cars, (car1, car2) -> car2.getMileage() - car1.getMileage());
    System.out.println(Car.cars);

    Comparator<Car> modelComparator = Comparator.comparing(Car::getModel);

    Collections.sort(Car.cars, modelComparator);
    System.out.println(Car.cars);

  }
}
