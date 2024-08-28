package collection_framework;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
  public static void main(String[] args) {
    Queue<String> queue = new LinkedList<String>();

    System.out.println(queue.size());
    System.out.println(queue.isEmpty()); // Collection 한테 물려받음
    queue.offer("바나나");
    queue.offer("사과");
    queue.offer("수박");

    while (!queue.isEmpty()) {
      System.out.println("맨 처음에 위치한 element : " + queue.peek()); // 선입선출 FIFO
      System.out.println("제거된 element : " + queue.poll());
    }


    //queue.remove(); // NoSuchElementException 발생
  }
}
