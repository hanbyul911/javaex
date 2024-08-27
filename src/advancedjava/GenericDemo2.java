package advancedjava;

public class GenericDemo2 {
  public static void main(String[] args) {
    Cup<Beer> beerCup = new Cup<>();
    beerCup.setBeverage(new Beer());
    System.out.println(beerCup.getBeverage().name);
    // beerCup.setBeverage(new Boricha()); -> 타입에 맞지 않으면 오류가 난다.
  }
}

// T와 E의 의미차이가 있다.
class Cup<T extends Beverage> {
  private T beverage;

  public T getBeverage() {
    return beverage;
  }

  public void setBeverage(T beverage) {
    this.beverage = beverage;
  }
}
