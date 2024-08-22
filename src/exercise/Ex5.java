package exercise;

public class Ex5 {
  public static void main(String[] args) {
    Phone[] phones = {new Phone("황진이"), new Telephone("길동이", "내일")
        , new SmartPhone("민국이", "갤러그")};

   /* System.out.println(((SmartPhone) phones[2]).getWhen());
    ((SmartPhone) phones[2]).setWhen("모레");
    System.out.println(((SmartPhone) phones[2]).getWhen());*/

    // 하위 클래스일 경우 상위 클래스에 포함되어 조건문의 순서에 유의할 것
    for (Phone phone : phones) {
      if (phone instanceof SmartPhone) {
        ((SmartPhone) phone).playGame();
      } else if (phone instanceof Telephone) {
        ((Telephone) phone).autoAnswering();
      } else {
        phone.talk();
      }
    }
  }
}

class Phone {
  // field - protected : 다른 package 에서 접근 불가
  protected String owner;

  public Phone(String owner) {
    this.owner = owner;
  }

  void talk() {
    System.out.println(owner + "가 통화중입니다.");
  }
}

class Telephone extends Phone {
  private String when;

  public Telephone(String owner) {
    super(owner);
  }
  public Telephone(String owner, String when) {
    super(owner);
    this.when = when;
  }

  public String getWhen() {
    return when;
  }

  public void setWhen(String when) {
    this.when = when;
  }

  void autoAnswering() {
    System.out.println(owner + "가 부재중이니 " + when + "에 전화 요망.");
  }
}

class SmartPhone extends Telephone {
  private String game;

  public SmartPhone(String owner, String game) {
    super(owner);
    this.game = game;
  }

  public String getWhen() {
    return super.getWhen();
  }

  public void setWhen(String when) {
    super.setWhen(when);
  }

  void playGame() {
    System.out.println(owner + "가 " + game + " 중 입니다.");
  }
}
