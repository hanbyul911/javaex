package collection_framework;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
  // 순서 X 중복된 데이터 저장 X
  // 해시코드 자체를 인덱스로 사용하여 contains 에 걸리는 시간복잡도 O(1)
  public static void main(String[] args) {
    Set<String> set = Set.of("포도", "수박", "사과", "키위", "망고");
    System.out.println(set);
    HashSet<String> set1 = new HashSet<>(set);
    set1.add("복숭아");
    boolean addResult = set1.add("복숭아");// 오류가 나지는 않지만 중복 값이 들어가지 않음
    System.out.println(addResult);
    Iterator<String> iterator = set1.iterator();
    while (iterator.hasNext()) {
      System.out.println(iterator.next());
    }
    TreeSet<String> set2 = new TreeSet<>(set);
  }
}
