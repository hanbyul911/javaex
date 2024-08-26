package advancedjava;

import java.io.FilterOutputStream;
import java.util.Arrays;

public class ArraysDemo {
  public static void main(String[] args) {
    Integer[] array = {2,4,6,8,10};
    String[] strArray = {"사과", "도넛", "바나나"};
    int[] iArray = {1, 2, 3};

    // Integer 같은 wrapper 클래스는 Arrays.메서드에 들어가지 않고  Object 타입 변수로 받아짐
    System.out.println(array);
    System.out.println(Arrays.binarySearch(array, 10));
    System.out.println(iArray);

  }
}
