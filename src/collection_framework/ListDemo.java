package collection_framework;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
  public static void main(String[] args) {
    List<Integer> l = new ArrayList<Integer>();
    boolean add = l.add(10);
    l.add(0, 20); // return 값이 없다, 해당 인덱스에 있던 값은 뒤로 밀림
    System.out.println(l);
    // l.add(4, 80); size 를 벗어난 인덱스 지정 불가
    l.set(1, 20);
    System.out.println(l);
    System.out.println(l.lastIndexOf(20));
    l.add(0,2);
    System.out.println(l);
    // l.remove(Integer.valueOf(2));
    // integer의 경우 index와 헷갈릴 수 있기 때문에 valueOf 값을 묶어서 넘겨줌
    l.remove(2);
    System.out.println(l);
    l.set(l.indexOf(20), 80);
    System.out.println(l);
  }
}
