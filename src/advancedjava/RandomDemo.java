package advancedjava;

import java.util.Random;

public class RandomDemo {
  public static void main(String[] args) {
    Random rand = new Random();
    for (int i = 0; i < 100; i++) {
      System.out.println(rand.nextInt(51));
    }

    /* 음수 범위를 따로 설정하는 방법은 없는 것 같고 음양 범위가 동일하다면 random 하게 false, true 받아서 곱하거나
    범위가 동일하지 않다면 - 값으로 설정하는 방법도 있을 것 같다.
    예를 들어 -10부터 57까지의 범위라고 한다면 nextInt(68) - 10 으로 설정하면 된다.
   범위가 동일한 경우에도 똑같이 마이너스 값으로 설정해도 문제가 없다. 뭐가 더 계산이 빠른지에 따라 설정하면 될 듯.
   */
  }
}
