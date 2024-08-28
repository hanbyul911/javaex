package collection_framework;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class MapDemo {
  // MAP interface
  // key 는 중복되지 않음 (set의 성격을 가짐)
  // HashMap, HashTable -> 단일스레드는 map 사용 But, 멀티스레드인 경우 위험
  public static void main(String[] args) {
    Map<String, Integer> map = Map.of("딸기",5, "바나나",3, "사과", 2);
    System.out.println(map);
    HashMap<String, Integer> hashMap = new HashMap<>(map);
    System.out.println("딸기의 개수 : " + hashMap.get("딸기"));
    hashMap.put("딸기", 10);
    System.out.println("딸기의 개수 : " + hashMap.get("딸기"));
    hashMap.put("딸기", hashMap.get("딸기") + 1); // 존재하면 update, 존재하지 않으면 add
    hashMap.put("수박", 1);
    System.out.println("딸기의 개수 : " + hashMap.get("딸기"));
    System.out.println("수박 : " + hashMap.get("수박"));

    Map<Fruit, Integer> fruitMap = new HashMap<>();
    Fruit apple1 = new Fruit("사과");
    Fruit apple2 = new Fruit("사과");
    fruitMap.put(apple1, 5);
    fruitMap.put(apple2, 2); // hashcode 를 구현하지 않으면 다른 객체로 인식해서 두번 들어감
    fruitMap.put(null, 3);
    System.out.println(fruitMap.get(apple1));
    System.out.println(fruitMap.get(apple2));
    System.out.println(fruitMap.size());
    System.out.println(fruitMap);
  }
}

class Fruit {
  String name;

  public Fruit(String name) {
    this.name = name;
  }

/*
  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Fruit fruit)) return false;
    return Objects.equals(name, fruit.name);
  }

  @Override
  public int hashCode() {
    return Objects.hashCode(name);
  }
*/

  @Override
  public String toString() {
    return "Fruit[" + name + "]";
  }
}
