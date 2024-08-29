package exercise.ch12;

import java.util.Arrays;
import java.util.List;

public class Book7 {
  public static void main(String[] args) {
    List<Member> list = Arrays.asList(
        new Member("홍길동", "개발자"),
        new Member("한별", "홈프로텍터"),
        new Member("페이커", "프로게이머")
    );

    List<Member> developers = list.stream().filter(Member::isDeveloper).toList();
    developers.stream().forEach(m -> System.out.println(m.getName()));
  }
}
