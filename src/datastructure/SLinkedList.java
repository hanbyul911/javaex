package datastructure;

public class SLinkedList<E> {
  private Node<E> head;
  private Node<E> tail;
  private int size;

  public SLinkedList() {
    head = tail = null;
    size = 0;
  }

  public int size() {
    return size;
  }

  public void addFirst(E e) {
    // 1단계. node 를 만들고 값을 넣는다.
    Node<E> node = new Node<>();
    node.e = e;
    node.next = head;
    // node.next = null;
    // 2단계. head 랑 연결시킨다.
    if (size == 0) {
      tail = node;
    }
    head = node;
    // 3단계. size 를 증가시킨다.
    size++;
  }

  public void addLast(E e) {
    Node<E> newNode = new Node<>();
    newNode.e = e;
    newNode.next = null;
    if (size == 0) {
      head = newNode;
    } else {
      getNode(size - 1).next = newNode;
    }
    tail = newNode;
    size++;
  }

  public E removeFirst() {
    // 1. removed item 을 꺼내놓는다, node를 백업받아야.
    Node<E> node = head;
    E removed = node.e;
    // 2. head의 next를 head로 지정
    head = head.next;
    if (size == 1) {
      tail = null;
    }
    // 3. head의 next 를 null로 끊어내기
    node.next = null;
    // 4. size 줄이기
    size--;
    return removed;
  }

  public E removeLast() {
    Node<E> node = tail;
    E removed = node.e;
    // tail의 앞의 노드 2개 찾기
    if (size > 1) {
      Node<E> prev = getNode(size - 2);
      prev.next = null;
      tail = prev;
   } else {
      head = null;
      tail = null;
    }
    size--;
    // tobetail.next = null
    // node.next = null;
    // tail = tobetail;
    // size가 1이면 head tail 다 null로
    return removed;
  }


  @Override
  public String toString() {
    return "SLinkedList{}";
  }

  private class Node<E> {
    E e;
    Node<E> next;
  }

  public E getValue(int idx) {
    if (idx < 0 || idx >= size) {
      return null;
    }
    Node<E> find = head;
    for (int i = 0; i < idx; i++) {
      find = find.next;
    }
    return find.e;
  }

  public Node<E> getNode(int idx) {
    if (idx < 0 || idx >= size) {
      return null;
    }
    Node<E> find = head;
    for (int i = 0; i < idx; i++) {
      find = find.next;
    }
    return find;
  }

}
