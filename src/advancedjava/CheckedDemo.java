package advancedjava;

public class CheckedDemo {
  public static void main(String[] args) /*throws InterruptedException*/ {
    // checked exception 은 내가 처리하든 상위 메소드가 처리하든 예외 처리를 해야한다.
    try {
      Thread.sleep(100);
      System.out.println("0.1초 동안 아무일도 일어나지 않았습니다.");
    } catch (InterruptedException e) {
      //throw new RuntimeException(e); // unchecked exception 으로 던짐
      System.out.println("예외가 발생했습니다.");
    }
  }
}
