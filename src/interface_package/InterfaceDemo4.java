package interface_package;

public class InterfaceDemo4 {
  public static void main(String[] args) {
    /*controllable 객체배열을 이용(TV와 컴퓨터객체를 배열에 저장)
    반복문으로 모든 배열의 요소인 각 객체에 대해서 각각 켜고 끄고 수리한다.
    최종적으로 공장초기화 한다.*/
    Controllable[] controllable = {new TV(), new Computer()};
    for (Controllable c : controllable) {
      c.turnOn();
      c.turnOff();
      c.repair();
    }
    Controllable.reset();
  }
}
