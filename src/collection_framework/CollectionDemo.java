package collection_framework;

import javax.swing.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo {
  public static void main(String[] args) {
    /*Collection<Integer> collection = new ArrayList<Integer>();
    collection.add(10); // 맨 뒤에 추가
    collection.add(20);
    collection.add(30);
    System.out.println(collection);
    //System.out.println(collection);
    System.out.println(collection.contains(20));
    System.out.println(collection.contains(2));
//    collection.clear();
//    System.out.println(collection.isEmpty());
    collection.remove(10); // 제거 여부를 확인하는 boolean 값을 리턴함
    System.out.println(collection);
    System.out.println(collection.size());

    Integer[] iArray = collection.toArray(new Integer[collection.size()]);
    System.out.println(Arrays.toString(iArray));

    collection.clear();
    System.out.println(collection.size());*/

    Collection<String> strings = new ArrayList<>();
    strings.add("A");
    strings.add("B");
    strings.add("C");
    Iterator<String> iterator = strings.iterator();
    while (iterator.hasNext()) {
      System.out.println(iterator.next());
    }

  }
}
