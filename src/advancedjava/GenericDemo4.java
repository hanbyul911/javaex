package advancedjava;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;

public class GenericDemo4 {
  public static void main(String[] args) {
    ArrayList<Beverage> beverages = new ArrayList<>();
    beverages.add(new Beer());
    beverages.add(new Boricha());

    ArrayList<Beer> beers = new ArrayList<>();
    beers.add(new Beer());
    // beers.add(new Boricha());

    bevTest(beverages);
    // bevTest(beers); 담겨있는 객체가 상속관계더라도 arraylist 자체가 상속관계가 아니기 때문에 넣을 수 없다.
    listTest(beverages);

    // 너무 추워 ㅠㅠㅠㅠㅠㅠㅠㅠ
  }

  public static void bevTest(ArrayList<Beverage> beverages) {
    System.out.println(beverages);
  }

  public static void listTest(List<Beverage> beverages) {
    System.out.println(beverages);
  }
}
