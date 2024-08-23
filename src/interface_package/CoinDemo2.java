package interface_package;

public class CoinDemo2 implements Coin, MyInterface {
  public static void main(String[] args) {
    // implements 되어 있기 때문에 import 한 것처럼 바로 사용 가능
    System.out.println("Dime 은 " + DIME + "입니다.");
    System.out.println("Quarter 는 " + QUARTER + "입니다.");
  }

  @Override
  public void sayHello() {

  }
}
