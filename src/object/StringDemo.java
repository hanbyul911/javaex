package object;

public class StringDemo {
  public static void main(String[] args) {
    String s1 = new String();
    String s2 = new String("A");

    System.out.println("s1 = \"" + s1 + "\"");
    System.out.println("s2 = \"" + s2 + "\"");

    String s3 = "B";
    String s4 = s3;

    System.out.println("s3와 s4를 동일 객체로 공유(복사)했을 때");
    System.out.println("s3 = \"" + s3 + "\"");
    System.out.println("s4 = \"" + s4 + "\"");

    s4 = "B1";

    System.out.println("공유한 객체 중 s4의 값만 변경했을 때");
    System.out.println("s3 = \"" + s3 + "\"");
    System.out.println("s4 = \"" + s4 + "\"");

    String s5 = new String("check");
    String s6 = "check";
    System.out.println(System.identityHashCode(s5));
    System.out.println(System.identityHashCode(s6));
  }
}
