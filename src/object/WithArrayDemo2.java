package object;

import java.util.Arrays;
import java.util.Scanner;

public class WithArrayDemo2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    long[] prices = new long[5];
    long price, sum = 0;
    for (int i = 0; i < prices.length; i++) {
      System.out.print((i + 1) + "번째 구매하실 품목의 가격을 입력해주세요 : ");
      price = sc.nextLong();
      prices[i] = price;
      sum += price;
    }
    System.out.println("입력된 가격의 배열 : " + Arrays.toString(prices));
    System.out.printf("입력된 가격의 총합은 %d 이며 평균값은 %.2f 입니다.", sum, (double)sum / prices.length );

    sum = 0;
    for (long l : prices) {
      sum += l;
    }

    System.out.println("입력된 가격의 배열 : " + Arrays.toString(prices));
    System.out.printf("입력된 가격의 총합은 %d 이며 평균값은 %.2f 입니다.", sum, (double)sum / prices.length );
  }
}
