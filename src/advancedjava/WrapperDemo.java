package advancedjava;

import java.util.Random;

public class WrapperDemo {
  public static void main(String[] args) {
    Integer ic = 10; // Integer ic = new Integer(20); 객체 생성 역시 JDK9 부터 사용 자제 권고
    System.out.println(ic.getClass().getSimpleName());
    int i = ic; // 자동 언박싱, int i = intValue(); 로 명시적 언박싱해도 되나 JDK9 부터 자동 박싱, 언박싱 가능
  }
}
