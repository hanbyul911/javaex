package advancedjava;

import java.lang.management.MemoryUsage;

public class GenericMethodDemo {
  public static void main(String[] args) {
    Integer[] integer = {1,23,4,5,6};
    String[] strings = {"hello", "world"};
    Double[] doubles = {1.0,2.0,3.0};
    Character[] chars = {'a','b','c'};

    MyUtils.showArray(integer);
    MyUtils.showArray(strings);
    MyUtils.showArray(doubles);
    MyUtils.showArray(chars);

    System.out.println();

    System.out.println("last : " +MyUtils.getLast(integer));
    System.out.println("last : " +MyUtils.getLast(strings));
    System.out.println("last : " +MyUtils.getLast(doubles));
    System.out.println("last : " +MyUtils.getLast(chars));
  }
}

class MyUtils {
  public static void showArray(Integer[] integers) {
    for (Integer integer : integers) {
      System.out.println(integer);
    }
  }

  public static void showArray(String[] strings) {
    for (String string : strings) {
      System.out.println(string);
    }
  }

  public static <T> void showArray(T[] array) {
    for (T element : array) {
      System.out.println(element);
    }
  }

  public static <T> T getLast(T[] tArray) {
    return tArray[tArray.length - 1];
  }
}
