package advancedjava;

public class UncheckedDemo2 {
  public static void main(String[] args) {
    int[] array = {1,2,3};
    int[] array2 = null;

    //IndexOutOfBoundsException
    /*try {
      System.out.println(array[3]);
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("인덱스 범위를 벗어났습니다.");
     // throw new RuntimeException(e);
    }

    System.out.println("프로그램 종료");
*/

    // NullPointerException
    /*try {
      System.out.println(array2[0]);
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("인덱스 범위를 벗어났습니다.");
    } catch (NullPointerException e) {
      System.out.println("배열이 정상적으로 생산되지 않았습니다.");
      //throw new RuntimeException(e);
    }

    System.out.println("프로그램이 종료됩니다.");
*/

    // ArithmeticException
    /*try {
      int result = 3/0;
      System.out.println(result);
    } catch (ArithmeticException e) {
      System.out.println("유효한 계산이 아닙니다.");
     // throw new RuntimeException(e);
    } catch (Exception e) {
      System.out.println("알 수 없는 예외가 발생했습니다.");
      e.printStackTrace(); -> 예외처리를 했으나 프로그램이 터진것처럼 보이기도 함
      System.out.println(e.getMessage()); -> 예외를 파악하기 어려움
    }
    System.out.println("프로그램을 종료합니다.");*/
  }
}
