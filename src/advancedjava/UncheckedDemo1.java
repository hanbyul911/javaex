package advancedjava;

import java.util.Scanner;
import java.util.StringTokenizer;

public class UncheckedDemo1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); // 콘솔창에 한글 언제쯤 쳐질까..
    String s = sc.nextLine();
    StringTokenizer st = new StringTokenizer(s);

    while (st.hasMoreTokens()) {
      System.out.println(st.nextToken());
    }
  }

}
