package basic;

import java.util.Scanner;

public class InputDemo {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // nextLine() 실습
    /*System.out.print("정수형 숫자 하나를 입력하세요. : ");
    String s = sc.nextLine();
    int i = Integer.parseInt(s);
    int result = i + 100;
    System.out.printf("당신이 입력한 숫자는 %d 이고 100을 더한 결과는 %d 입니다.", i, result);*/

    // nextInt() 실습
    System.out.print("정수형 숫자 두개를 입력하세요. : ");
    int x = sc.nextInt();
    int y = sc.nextInt();
    System.out.printf("당신이 입력한 숫자는 %d , %d 이고 그 둘을 곱한 결과는 %d 입니다.", x, y, x*y);
  }
}
