package advancedjava2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Echo2Server extends Thread {
  protected static boolean cont = true;
  protected Socket connection = null;

  public static void main(String[] args) throws IOException {
    ServerSocket serverSocket = null;
    serverSocket = new ServerSocket(5000);
    System.out.println("서버 소켓 생성");

    while (cont) {
      System.out.println("연결 대기 중......");
      new Echo2Server(serverSocket.accept());
    }
    serverSocket.close();
  }

  private Echo2Server(Socket clientSocket) {
    connection = clientSocket;
    start();
  }

  public void run() {
    BufferedReader in = null;

    System.out.println("클라이언트와 통신을 위한 새로운 스레드 생성");
    try {
      in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
      String msg;

      while ((msg = in.readLine()) != null) {
        System.out.println("읽은 메세지 메아리 : " + msg);
      }
    } catch (IOException e) {
    }
  }
}
