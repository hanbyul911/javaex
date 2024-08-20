package object;

import java.util.ArrayList;
import java.util.Arrays;

public class DynamicArrayDemo {
  public static void main(String[] args) {
    ArrayList<Object> list = new ArrayList<>();
    list.add("A");
    list.add("B");
    list.add("C");
    list.remove(0);
    System.out.println(list);
    System.out.println(list.get(0));
    System.out.println(list.size());

    ArrayList<Circle> circles = new ArrayList<>();
    circles.add(new Circle(5));
    circles.add(new Circle(7));
    System.out.println(circles.get(0).getArea());

    ArrayList<Integer> numbers = new ArrayList<>();
    numbers.add(1);
    numbers.add(8);
    numbers.add(123);
    numbers.add(44);
    numbers.add(32);
    numbers.add(12);
    numbers.add(98);
    numbers.remove(6);
    int[] array = numbers.stream().mapToInt(i -> i).toArray();
    System.out.println(Arrays.toString(array));
  }
}
