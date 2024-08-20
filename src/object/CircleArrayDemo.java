package object;

import object.Circle;

import java.util.Arrays;

public class CircleArrayDemo {
  // Circle 을 원소로 가지는 배열 circles 를 생성하라. 배열의 크기는 5
  // 첫번째와 두번째 원소만 원의 반지름이 각각 3,4가 되도록 circle 객체를 생성하라.
  // 객체가 생성되어 있을 경우에만, 원의 넓이를 구하여 출력하라.
  public static void main(String[] args) {
    Circle[] circles = new Circle[5];
    circles[0] = new Circle(3);
    circles[1] = new Circle(4);

    System.out.println(Arrays.toString(circles));

   /* for (int i = 0; i < circles.length; i++) {
      if (circles[i] != null) {
        System.out.printf("%d번째 circle의 넓이는 %.2f이다.\n", i + 1, circles[i].getArea());
      }
    }*/

    for (Circle circle : circles) {
      if (circle != null) {
        circle.toString();
      }
    }
  }

}
