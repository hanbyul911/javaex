package advancedjava;

public class GenericDemo3 {
  public static void main(String[] args) {

    Entry<String, Integer> entry = new Entry<>("김선달", 20);
    Entry<String, String> entry2 = new Entry<>("기타", "등등");
    Entry<Integer, String> entry3 = new Entry<>(10, "ten");

    System.out.println(entry2.getName() + entry2.getAge());
  }

}

class Entry<K, V> {
  private K name;
  private V age;

  public K getName() {
    return name;
  }

  public void setName(K name) {
    this.name = name;
  }

  public V getAge() {
    return age;
  }

  public void setAge(V age) {
    this.age = age;
  }

  public Entry(K name, V age) {
    this.name = name;
    this.age = age;
  }
}
