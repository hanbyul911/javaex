package datastructure;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class ListQueueDemo {
  public static void main(String[] args) {
    Queue<String> queue = new LinkedList<String>();
    queue.offer("a");
    queue.offer("b");
    queue.offer("c");
    queue.offer("d");
    /*while (!queue.isEmpty()) {
      System.out.println(queue.poll());
    }*/
    //queue.poll(); // exception 없음
    // queue.remove(); // exception 발생

    ListQueue<Integer> listQueue = new ListQueue<>();
    System.out.println(listQueue.isEmpty());
    System.out.println(listQueue.size());

    listQueue.offer(1);
    listQueue.offer(2);
    listQueue.offer(3);
    listQueue.offer(4);

    while (!listQueue.isEmpty()) {
      System.out.println(listQueue.poll());
    }
    listQueue.poll();
  }
}
