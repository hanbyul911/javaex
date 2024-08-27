package advancedjava;

public class GenericDemo {
  public static void main(String[] args) {
/*    Cup cup = new Cup();
    cup.setBeverage(new Beer());
    Object beverage = cup.getBeverage();
    Beer b = (Beer) beverage; // 무엇을 담았는지 모르는데 형변환할 수 없다.
    System.out.println(b.name);

    cup.setBeverage(new Boricha());
    Object beverage2 = cup.getBeverage();
    Boricha b2 = (Boricha) beverage2;
    System.out.println(b2.name);
    */
    // Cup<Beer> cup2 = new Cup<>();


    CupBoricha cupBoricha = new CupBoricha();
    cupBoricha.setBoricha(new Boricha());
    Boricha boricha = cupBoricha.getBoricha();

    CupBeer cupBeer = new CupBeer();
    cupBeer.setBeer(new Beer());
    Beer beer = cupBeer.getBeer();
  }
}

class Beverage {}

class Boricha extends Beverage {
  String name = "보리차";
}

class Beer extends Beverage {
  String name = "맥주";
}

/*
class Cup<E> {
  private Object beverage;

  public Object getBeverage() {
    return beverage;
  }

  public void setBeverage(Object beverage) {
    this.beverage = beverage;
  }
}
*/

class CupBeer {
  private Beer beer;

  public Beer getBeer() {
    return beer;
  }

  public void setBeer(Beer beer) {
    this.beer = beer;
  }
}

class CupBoricha {
  private Boricha boricha;

  public Boricha getBoricha() {
    return boricha;
  }

  public void setBoricha(Boricha boricha) {
    this.boricha = boricha;
  }
}