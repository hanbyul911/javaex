package basic;

import java.util.concurrent.Callable;

public class ShortCircuitDemo {
  public static void main(String[] args) {
    // String 동일 비교 동등 비교
    /*String s1 = new String("Hello"); // 할당 전 참조형 변수는 null 이 들어있다.
    String s2 = new String("Hello"); // 내용이 같은 String 이 있더라도 새 객체 생성

    String s3 = "Hello";
    String s4 = "Hello"; // Spring pool에 동일한 값이 있다면 그 값의 주소를 할당함, 없을 경우 새 객체 생성

    if (s1.equals(s2)) {
      System.out.println("두 문장은 동일합니다.");
    } else {
      System.out.println("두 문장은 동일하지 않습니다.");
    }

    System.out.println("s1과 s2은 동일한가?" + s1 == s2);
    System.out.println("s3과 s4은 동일한가?" +s3 == s4);
    System.out.println("s1 주소 : " + System.identityHashCode(s1));
    System.out.println("s2 주소 : " + System.identityHashCode(s2));
    System.out.println("s3 주소 : " + System.identityHashCode(s3));
    System.out.println("s4 주소 : " + System.identityHashCode(s4));

    s3 = "bye";
    System.out.println("값이 바뀐 s3 주소 : " + System.identityHashCode(s3));

    System.out.println(s1.equals(s2));*/

    // short-circuit test

    String s5 = null;
    String s6 = new String("Hello");

    // s5.equals(s6); null이랑 equals 메소드로 비교가 안된다.
    // 따라서 아래 AND문에서 앞에서 먼저 걸러졌기 때문에 뒤에 비교가 안돼서 에러가 나는 경우가 없어짐

    /*if (s5.equals(s6) ==> 이부분에서 오류가 나서 뒤에 아예 작동이 안됨.
        && s5  != null) {
      System.out.println("문자열의 내용이 동일합니다.");
    }*/

    s5 = s6;

    if (s5 != null && s5.equals(s6)) {
      System.out.println("문자열의 내용이 동일합니다.");
    }

    // String = "", new String(); 의 차이점
    /* "" 으로 생성하는 경우 heap memory 내 String Constant Pool 에 저장되고 새 객체를 생성하기 전에 pool을 살펴본다.
    동일한 값을 가지는 String 이 있는 경우 해당 주소를 부여하고 이 때 값과 주소 모두 동일한 String 이 된다.
    다만 String 값을 변경하는 경우 주소가 변경된다.

    new String(); 으로 String 을 생성하는 경우 heap memory 영역에서 값과 무관한 새 객체가 생성된다.
    묹장이 동일하더라도 새로 주소가 다르기 때문에 주소를 비교하는 == 연산자의 결과값은 false,
    값을 비교하는 equals 의 결과값은 true 가 된다.
    */

    String test = "hello";
    String test1 = "hello";
    String test2 = "bye";
    String test3 = new String("bye");
    System.out.println("test == test1 ? " + (test == test1));
    test = test2;
    System.out.println("값을 변경한 test == test2 ? " + (test == test2));
    System.out.println("값을 변경한 test == test2 ? " + (test == test3));


    // 주소 할당해서 값을 변경하면 다른 객체 값도 변하는지 확인
    
    ClassTest testC = new ClassTest(1, "test");
    ClassTest testC2 = new ClassTest(2, "hello");

    System.out.println(testC.name);
    testC = testC2;
    System.out.println(testC.name);
    testC2.setName("change");
    System.out.println(testC.name);

  }

  public static class ClassTest {
    int x;
    String name;

    public ClassTest(int x, String name) {
      this.x = x;
      this.name = name;
    }

    public void setX(int x) {
      this.x = x;
    }

    public void setName(String name) {
      this.name = name;
    }
  }
}
