package object;

public class StringDemo3 {
  public static void main(String[] args) {
    String s1 = "Hello";
    String s2 = ", java";

    s1 = "hello";

    System.out.println("s1의 길이는 " + s1.length());
    System.out.println("s2의 길이는 " + s2.length());
    // s1.concat(s2); // 붙인다고 s1이 변하는 것이 아닌 새로운 객체가 만들어지고, 할당해야함
    System.out.println(s1.concat(s2));
    System.out.println(s1.toUpperCase()); // s1이 변경된 것이 아니라 새로운 객체가 생성된 것.
    System.out.println(s1);

    String s3 = s2.substring(2);
    System.out.println(s3);
    s3 = s2.substring(2,4); //  끝나는 인덱스 전까지 잘리기 때문에 원하는 인덱스 + 1 해준다.
    System.out.println(s3);

    System.out.println(String.valueOf(10).equals("10"));

    String s4 = """ 
        오 신기하다
        이런 기능이 생겼구나
               ';'!@#$%^&*() 특수문자 마음대로 쓸 수 이썽서 좋당
           으헤헹
        """;
    // 블럭 맨 윗줄은 비워둬야 함

    System.out.println("""
        hello""");

    System.out.println(s4);
  }
}
