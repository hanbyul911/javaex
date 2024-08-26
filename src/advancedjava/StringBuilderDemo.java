package advancedjava;

public class StringBuilderDemo {
  public static void main(String[] args) {
    StringBuilder sb = new StringBuilder();
    System.out.println(sb.capacity());
   /* for (int i = 0; i < 32; i++) {
      sb.append(i);
    }*/
    sb.append("Hello");
    sb.append(", World");
    System.out.println(sb.toString());
    System.out.println(sb.length());
    System.out.println(sb.capacity());
    System.out.println(sb.reverse().toString());
  }
}
