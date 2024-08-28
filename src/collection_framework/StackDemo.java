package collection_framework;

import java.util.List;
import java.util.Stack;

public class StackDemo {
  public static void main(String[] args) {
    List<String> list = new Stack<>();
    Stack<String> st = new Stack<>();

    System.out.println(list.isEmpty());
    System.out.println(st.empty());

    st.push("a"); // addLast
    st.push("b");
    st.push("c");
    st.push("d");
    // System.out.println(st.peek()); // get Last
    // System.out.println(st);
    System.out.println(st.search("a"));
    System.out.println(st.search("c"));
    // top에서부터 몇 번째에 존재하는지 즉, idx와 반대 숫자, idx는 0부터 search는 1부터 시작한다.

    while (!st.empty()) {
      System.out.println(st.pop());
    }

    // st.pop(); // remove Last
  }
}
