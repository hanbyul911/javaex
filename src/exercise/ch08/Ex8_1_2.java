package exercise.ch08;

public class Ex8_1_2 {
  public static void main(String[] args) {
    NewPerson np1 = new NewPerson("11111", "홍길동");
    NewPerson np2 = new NewPerson("11111", "손흥민");
    NewPerson np3 = new NewPerson("11111", "손흥민");

    if (np1.equals(np2)) {
      System.out.println("같은 사람이다.");
    } else {
      System.out.println("다른 사람이다.");
    }

    if (np1.equals(np3)) {
      System.out.println("같은 사람이다.");
    } else {
      System.out.println("다른 사람이다.");
    }

    if (np3.equals(np2)) {
      System.out.println("같은 사람이다.");
    } else {
      System.out.println("다른 사람이다.");
    }
  }
}

class NewPerson {
  String id;
  String name;

  public NewPerson(String id, String name) {
    this.id = id;
    this.name = name;
  }

  @Override
  public boolean equals(Object obj) {
    if (obj instanceof NewPerson) {
      NewPerson person = (NewPerson) obj;
      if (person.id.equals(this.id) && person.name.equals(this.name)) {
        return true;
      } else {
        return false;
      }
    }
    return false;
  }
}
