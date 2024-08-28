package exercise.ch11;

import java.util.*;

public class Ex3 {
  public static void main(String[] args) {
    Map<String, Integer> map = Map.of("김열공", 80, "최고봉", 90, "우등생", 95, "나자바", 88);
    Scanner sc = new Scanner(System.in);
    System.out.print("이름을 입력하세요 : ");
    String s = sc.nextLine();
    if (map.containsKey(s)) {
      System.out.println(map.get(s));
    } else {
      System.out.println("해당하는 이름이 존재하지 않습니다.");
    }
  }
}
