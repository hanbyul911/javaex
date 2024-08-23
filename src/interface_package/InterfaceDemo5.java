package interface_package;

public class InterfaceDemo5 {
  public static void main(String[] args) {
    Dog d = new Dog();
    Cuckoo c = new Cuckoo();

    makeSound(d);
    makeSound(c);
  }

  static void makeSound(Animal a) {
    a.sound();
  }
}
