package datastructure;

import org.w3c.dom.Node;

public class SLinkedListDemo {
  public static void main(String[] args) {
    SLinkedList<Integer> sLinkedList = new SLinkedList();
    System.out.println(sLinkedList.size());
    sLinkedList.addFirst(10);
    sLinkedList.addLast(9);
    System.out.println(sLinkedList.size());
    sLinkedList.addLast(7);
    sLinkedList.addFirst(20);
    sLinkedList.addFirst(30);
/*    sLinkedList.addFirst(40);
    sLinkedList.addFirst(50);*/
    System.out.println(sLinkedList.size());

//    System.out.println(sLinkedList.getValue(1));
    System.out.println(sLinkedList.removeLast() + "이 삭제되었습니다.");
    System.out.println("삭제 후 크기는 " + sLinkedList.size());
    System.out.println(sLinkedList.removeFirst() + "이 삭제되었습니다.");
    System.out.println("삭제 후 크기는 " + sLinkedList.size());
    System.out.println(sLinkedList.removeFirst() + "이 삭제되었습니다.");
    System.out.println("삭제 후 크기는 " + sLinkedList.size());
    System.out.println(sLinkedList.removeFirst() + "이 삭제되었습니다.");
    System.out.println("삭제 후 크기는 " + sLinkedList.size());
    System.out.println(sLinkedList.removeFirst() + "이 삭제되었습니다.");
    System.out.println("삭제 후 크기는 " + sLinkedList.size());
  }
}
