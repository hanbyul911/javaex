package basic;

import java.util.Scanner;

public class DivideByZeroDemo {
  public static void main(String[] args) {
    // int result = 5 / 0; // 컴파일러 퉁과 but JVM 에서 인터프리터 통과를 못해서 에러가 난다.
    Scanner sc = new Scanner(System.in);

    // 0이 들어오는 경우 if 문 이용하기
    /*System.out.print("정수를 입력해주세요 : ");
    int i = sc.nextInt();
    if (i == 0) {
      System.out.println("0으로 나눌 수 없습니다.");
    } else if (i > 0) {
      int result = 5 / i;
      System.out.printf("5 / %d = %d 입니다.", i, result);
    }*/

    // while 문 이용하여 0이아닌 숫자가 들어오도록 반복하기
    /*int i = 0;

    while (i == 0) {
      System.out.print("0을 제외한 정수를 입력해주세요 : ");
      i = sc.nextInt();
    }

    int result = 5 / i;

    System.out.printf("5 / %d = %d 입니다.", i, result);*/

    // 0.0으로 나누는 경우 (Infinity)
    double result = 5 / 0.0;
    System.out.println(result);

    // 0.0으로 모듈러 연산하는 경우 (NaN - Not a Number)
    double result2 = 5 % 0.0;
    System.out.println(result2);

    // 참조형 변수 동일 비교
    Scanner sc1 = new Scanner(System.in);
    System.out.println("Scanner 각각 생성 후 비교하기 : " + (sc == sc1));
    sc1 = sc;
    System.out.println("Scanner 주소값 복사 후 비교하기 : " + (sc == sc1));
  }
}
