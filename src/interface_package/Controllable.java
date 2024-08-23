package interface_package;

/**
 * 장비를 켜고 끄는 기능을 구현해야 하며,
 * 수리와 초기화 기능이 구현되어 있습니다.
 */
public interface Controllable {
  default void repair() {
    show("장비를 수리한다.");
  }

  static void reset() {
    System.out.println("장비를 공장초기화한다.");
  }

  private void show(String s) {
    System.out.println(s);
  }

  /**
   * 입력된 문장을 재호출하는 메서드
   * @param s
   * @return 없음
   */
  default String say (String s) {
    return null;
  }

  void turnOn();
  void turnOff();
}
