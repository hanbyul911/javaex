package datastructure;

public class ListStackDemo {
  public static void main(String[] args) {
    ListStack<String> listStack = new ListStack();
    System.out.println(listStack.isEmpty());
    System.out.println(listStack.size());
    // System.out.println(listStack.peek());

    listStack.push("a");
    listStack.push("b");
    listStack.push("c");

    while(!listStack.isEmpty()) {
      System.out.println(listStack.pop());
    }
  }
}
