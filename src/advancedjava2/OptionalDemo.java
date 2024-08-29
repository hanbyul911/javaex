package advancedjava2;

import java.util.Optional;

public class OptionalDemo {
  public static void main(String[] args) {
    String s1 = "hello";
    String s2 = null;

    Optional<String> o1 = Optional.ofNullable(s1);
    Optional<String> o2 = Optional.ofNullable(s2);

    if (o2.isPresent()) {
      Util.print(o2);
    } else {
      Util.print(o2);
      System.out.println("값이 없음");
    }

    if (o1.isPresent()) {
      Util.print(o1.get()); // optional 로 반환되는 경우 그 값을 get() 으로 꺼내줘야한다.
    }

    o1.ifPresent(Util::printWithParenthesis);
    /*String result = o2.orElse("값이 없음"); // 값이 없을 때 디폴트값 지정
    System.out.println(result);*/
    Util.printWithParenthesis(o2.orElse("값이 없음"));
  }
}
