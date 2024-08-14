package basic;

public class WhileDemo {
  public static void main(String[] args) {
    int i = 0;
/*

    while(i < 3) {
      i++;
      System.out.println(i);
    }
*/

    while(true) {
      if (i == 3) {
        System.out.println("반복을 종료합니다.");
        break;
      }
      i++;
      System.out.printf("무한반복 %d회차\n", i);
    }
  }
}
