package datastructure;

import org.w3c.dom.Node;

public class ListQueue<E> {
  private Node<E> front;
  private Node<E> rear;
  private int size;

  public ListQueue() {
    front = null;
    rear = null;
    size = 0;
  }

  public boolean isEmpty() {
    return size == 0;
  }

  public int size() {
    return size;
  }

  public void offer(E e) {
    Node<E> newNode = new Node<>();
    newNode.e = e;
    newNode.next = null;
    if (size == 0) {
      front = newNode;
    } else {
      getNode(size - 1).next = newNode;
    }
    rear = newNode;
    size++;
  }

  public E poll() {
    if (isEmpty()) { // poll 은 exception return 하지 않음
      return null;
    }
    Node<E> temp = front;
    front = front.next;
    if (size == 1) {
      rear = null;
    }
    temp.next = null;
    size--;
    return temp.e;
  }

  public Node<E> getNode(int idx) {
    if (idx < 0 || idx >= size) {
      return null;
    }
    Node<E> find = front;
    for (int i = 0; i < idx; i++) {
      find = find.next;
    }
    return find;
  }


  private class Node<E> {
    E e;
    Node<E> next;
  }
}
