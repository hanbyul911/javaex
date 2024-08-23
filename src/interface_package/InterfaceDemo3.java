package interface_package;

public class InterfaceDemo3 {
  public static void main(String[] args) {
    TV tv = new TV();
    tv.turnOn();
    tv.turnOff();
    Controllable.reset();
    tv.repair();
    tv.say("hello");

    System.out.println();

    Computer computer = new Computer();
    computer.turnOn();
    computer.turnOff();
    Controllable.reset();
    computer.repair();

    System.out.println();

    Notebook notebook = new Notebook();
    notebook.turnOn();
    notebook.turnOff();
    notebook.inMyBag();
  }
}
