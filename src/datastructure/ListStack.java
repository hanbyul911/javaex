package datastructure;

import java.util.EmptyStackException;

public class ListStack<E> {
  Node<E> top;
  int size;

  public ListStack() {
    top = null;
    size = 0;
  }

  public boolean isEmpty() {
    return size == 0;
  }

  public int size() {
    return size;
  }

  public void push(E e) {
    Node<E> newNode = new Node<>();
    newNode.e = e;
    newNode.next = top;
    top = newNode;
    size++;
  }

  public E pop() {
    if (isEmpty()) {
      throw new EmptyStackException();
    }
    Node<E> temp = top;
    top = top.next;
    size--;
    return temp.e;
  }

  public E peek() {
    if (isEmpty()) {
      throw new EmptyStackException();
    }
    return top.e;
  }

  private class Node<E> {
    E e;
    Node<E> next;
  }
}
