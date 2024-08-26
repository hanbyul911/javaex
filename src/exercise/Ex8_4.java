package exercise;

import java.util.Random;

public class Ex8_4 {
  public static void main(String[] args) {
    System.out.println(new Dice().roll());
  }
}

class Dice {
  public int roll() {
    Random rand = new Random();
    return rand.nextInt(6) + 1;
  }
}
