package advancedjava;

import java.util.StringTokenizer;

public class TokenizerDemo {
  public static void main(String[] args) {
    String s = "of the people, by\n the people\n, \nfor the people";
    // StringTokenizer st = new StringTokenizer(s, " ,");
    StringTokenizer st = new StringTokenizer(s);
    while (st.hasMoreTokens()) {
      System.out.println("[" + st.nextToken() + "] ");
    }
  }
}
