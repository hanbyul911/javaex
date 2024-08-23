package exercise;

public class InterfaceEx1 {
  public static void main(String[] args) {
    speak(new Korean());
    speak(new American());
  }

  static void speak(Talkable talkable) {
    talkable.talk();
  }
}
