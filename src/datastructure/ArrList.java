package datastructure;

import java.util.Arrays;

public class ArrList<E> {
  private E[] arr; // == E arr[];
  private int size;

  public ArrList() {
    this.arr = (E[]) (new Object[1]); // 제너릭 타입으로 배열을 만들 수 없어서 downcasting 한다.
    this.size = 0; // 안에 담긴 데이터 0개
  }

  // 삽입, 탐색, 삭제를 위한 연산 메서드
  public boolean add(E e) {
    if(arr.length == size) {
      // 배열의 크기를 두배로 증가한다.
      // 기존 배열의 값을 새로 만든 배열에 옮긴다.
      // 기존 배열을 가리키는 참조변수가 새로 만든 배열을 가리키도록 한다.
      resize(arr.length * 2);
    }
    arr[size] = e;
    size++;
    return true;
  }

  private void resize(int length) {
    E[] newArr = (E[]) new Object[length];
    for (int i = 0; i < size; i++) {
      newArr[i] = arr[i];
    }
    // Arrays.copyOf 로 최적화 되어 있음 -> O(1)에 가깝게 최적화
    arr = newArr;
  }

  public E remove() {
    if (size > 0) {
      if (arr.length / 2 > size) { // 메모리 정리
        resize(arr.length / 2);
      }
      E e = arr[size - 1];
      arr[size - 1] = null;
      size--;
      return e;
    } else return null;
  }

  public int size() {
    return size;
  }

  @Override
  public String toString() {
    StringBuilder str = new StringBuilder();
    str.append("[");
    for (int i = 0; i < arr.length; i++) {
      str.append(arr[i]);
      if (i < arr.length - 1) {
        str.append(", ");
      }
    }
    str.append("]");
    return str.toString();
  }

  public E peek(int idx) {
    if (idx < 0 || idx >= size) {
      return null;
    }
    return arr[idx];
  }
}
