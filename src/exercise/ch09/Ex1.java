package exercise.ch09;

public class Ex1 {
  public static void main(String[] args) {
    Box<Integer> i = new Box<>();
    // i.set(Integer.valueOf(100));
    i.set(100); // 그냥 숫자를 넣어도 자동으로 형변환해줌
    System.out.println(i.get());

    Box<String> s = new Box<>();
    s.set("만능이네!");
    System.out.println(s.get());
  }
}

class Box<T> {
  private T t;

  public void set(T t) {
    this.t = t;
  }

  public T get() {
    return t;
  }
}
