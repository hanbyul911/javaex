package advancedjava2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Echo1Server {
  public static void main(String[] args) throws IOException {
    ServerSocket serverSocket = null;
    Socket connection = null;
    BufferedReader in = null;

    serverSocket = new ServerSocket(5000);

    System.out.println("연결 대기 중....");

    connection = serverSocket.accept();

    System.out.println("메시지를 기다리는 중....");

    in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
    String msg;

    while ((msg = in.readLine()) != null) {
      if (msg.contains("end")) {
        break;
      }
      System.out.println("읽은 메세지 메아리 : " + msg);
    }
    System.out.println("서버 종료");
    in.close();
    connection.close();
    serverSocket.close();
  }
}
