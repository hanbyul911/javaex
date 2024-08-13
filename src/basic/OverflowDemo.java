package basic;

public class OverflowDemo {
  public static void main(String[] args) {
    int a = 1_000_000;
    int b = 2_000_000;

    long result = (long) a * b; // 연산자체에서 오류가 나지 않아서 컴파일러가 잘못했다고 알려주지 않음
    // 이미 연산에서 오버플로우가 나면 그보다 큰 데이터타입에 값을 대입해도 오류나기 때문에 계산할때부터 타입을 바꾸고 실행해야한다

    System.out.println(result);
  }
}
