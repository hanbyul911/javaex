package advancedjava;

import java.util.ArrayList;
import java.util.Objects;

public class GenericTestDemo {
  public static void main(String[] args) {
    ArrayList<Integer> intArray = new ArrayList<>();// 객체를 담아야해서 Integer
    intArray.add(10);
    intArray.add(20);
    intArray.add(30);
    intArray.add(40);
    intArray.add(50);
    System.out.println(intArray);

    ArrayList<String> strArray = new ArrayList<>();
    strArray.add("Hello");
    strArray.add("World");
    System.out.println(strArray);

    ArrayList<Object> objectsList = new ArrayList<>();
    objectsList.add(new All());
    objectsList.add(new Any());
    objectsList.add(21);
    objectsList.add("objarray test");

    System.out.println(objectsList);
    Object o = objectsList.get(3); // obj로 담아서 obj로 꺼내짐
    Object o1 = objectsList.get(2);
    if (o instanceof Integer){
      Integer i = (Integer) o;
      System.out.println(i + 10);
    }
    System.out.println((String)objectsList.get(3) + 10);

    // 제너릭 타입끼리는 상속관계가 있지만 그것을 담은 ArrayList 는 상속관계에 있지 않다.
  }
}

class Any {
  int any;
}

class All {
  int all;
}
