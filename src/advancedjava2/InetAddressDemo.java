package advancedjava2;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

public class InetAddressDemo {
  public static void main(String[] args) throws UnknownHostException {
    InetAddress arr1 = null, arr2 = null;
    Scanner sc = new Scanner(System.in);

    System.out.println("호스트 이름을 입력하세요.");
    String url = sc.nextLine();
    // url -> 큰 주소, uri -> 식별자(identify)

    arr1 = InetAddress.getByName(url); //예전에 만들어진 메서드
    arr2 = InetAddress.getLocalHost();
    System.out.println(arr1.getHostAddress());
    System.out.println(arr2.getHostAddress());

  }
}
