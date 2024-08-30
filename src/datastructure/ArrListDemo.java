package datastructure;

import java.util.ArrayList;
import java.util.Stack;

public class ArrListDemo {
  public static void main(String[] args) {
    System.out.println("======= my array ======");
    ArrList<Integer> myArr = new ArrList<>();
    System.out.println(myArr);
    System.out.println(myArr.add(10));
    System.out.println(myArr.add(20)); // 크기를 수정하지 않고 add 하면 ArrayIndexOutOfBoundsException 발생
    // System.out.println(myArr.remove()); // 항상 마지막 값을 삭제하고 리턴해준다.
    // System.out.println(myArr.remove()); // 항상 마지막 값을 삭제하고 리턴해준다.
    myArr.add(30);
    myArr.add(40);
    System.out.println(myArr.toString());
    System.out.println(myArr.peek(3));

    System.out.println("======= java array ======");
    ArrayList<Integer> javaArr = new ArrayList<>();
    System.out.println(javaArr);
    System.out.println(javaArr.size());
    javaArr.add(10);
    javaArr.add(20);
    System.out.println(javaArr.size());
    javaArr.remove(0);
    javaArr.remove(0);
    //javaArr.remove(0);
  }
}
