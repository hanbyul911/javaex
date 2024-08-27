package exercise.ch08;

import java.util.Random;

public class Ex8_4 {
  public static void main(String[] args) {
    for (int i = 0; i < 10; i++) {
      System.out.println(new Dice().roll());
    }
  }
}

class Dice {
  public int roll() {
    // Random rand = new Random();
    // return rand.nextInt(1, 7);
    return (int)(Math.random() * 6) + 1;
  }
}
