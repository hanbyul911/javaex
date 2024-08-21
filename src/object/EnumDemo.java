package object;

public class EnumDemo {
  public static void main(String[] args) {
    /*System.out.println(People.FEMALE);
    System.out.println(People.TWO);
    */
    System.out.println(People.Number.ONE != People.Number.TWO);
  }
}

class People { // 상수값을 묶어놓은 클래스, 타입에 안전
/*  static final int MALE = 1;
  static final int FEMALE = 2;
  static final int ONE = 1;
  static final int TWO = 2;*/
  enum Gender {MALE, FEMALE}
  enum Number {ONE, TWO}

}
