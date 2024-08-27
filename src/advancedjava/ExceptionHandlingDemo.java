package advancedjava;

import java.io.IOException;

public class ExceptionHandlingDemo {
  public static void main(String[] args) throws IllegalArgumentException {
    try {
      method1(); // unchecked 는 선택사항, checkedExeption 은 무조건 try-catch 로 감싸거나 상위 메소드로 throws 한다.
    } catch (IOException e) {
      // throw new RuntimeException(e);
      System.out.println("예외가 발생했습니다.");
    } finally { // 예외 여부에 상관없이 실행되는 블록
      System.out.println("프로그램 종료");
    }
  }

  public static void method1() throws IllegalArgumentException, IOException {
    // throw new IllegalArgumentException();
    // throw new IOException();
    System.out.println("정상 작동했습니다.");
  }
}
