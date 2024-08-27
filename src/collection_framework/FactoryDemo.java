package collection_framework;

import java.util.ArrayList;
import java.util.List;

public class FactoryDemo {
  public static void main(String[] args) {
    List<Integer> l = List.of(10,20,30);
    System.out.println(l);
    // l.add(40); UnsupportedOperationException -> Immutable 하기 때문
    // l.set(0,1);

    // 그럼 List.of 를 왜 쓰는거지..?? 용도를 모르겠음, 처음에 값을 넣고 한번에 list로 변경하는 식으로 이용
    List<Integer> integers = new ArrayList<>(l);
    integers.add(10);
    integers.add(1, 20);
    System.out.println(integers);
  }
}
