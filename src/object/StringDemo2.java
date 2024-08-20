package object;

public class StringDemo2 {
  public static void main(String[] args) {
    // 문자열 동등비교, 동일비교
/*
    String s1 = "Hi, Java !";
    String s2 = "Hi, Java !";
    String s3 = new String("Hi, Java !");

    System.out.println("s1 == s2 ? "  + (s1 == s2));
    System.out.println("s1 == s3 ? "  + (s1 == s3));
    System.out.println("동등비교 s1.equals(s2) ? " + s1.equals(s2));
    System.out.println("동등비교 s1.equals(s3) ? " + s1.equals(s3));

    System.out.println("==== s1에 s3 대입 ====");
    s1 = s3;
    System.out.println("동일비교(identify) s1 == s2 ? "  + (s1 == s2));
    System.out.println("s1 == s3 ? "  + (s1 == s3));
    System.out.println("동등비교(equality) s1.equals(s3) ? " + s1.equals(s3));
*/

    // equals, compareTo
    String s1 = "Java";
    String s2 = "Code";
    String s3 = "java";

    int compareResult = s2.compareTo(s1);
    int compareResult2 = s1.compareTo(s2);
    int compareResult3 = s1.compareTo(s3);
    int compareResult4 = s1.compareToIgnoreCase(s3);
    boolean b = s1.equalsIgnoreCase(s3);

    System.out.println(compareResult);
    System.out.println(compareResult2);
    System.out.println(compareResult3);
    if (compareResult4 == 0) {
      System.out.println("두 문장의 값이 동등하다.");
    }
    if (b) {
      System.out.println("두 문장의 값이 동등하다.");
    }
  }
}
