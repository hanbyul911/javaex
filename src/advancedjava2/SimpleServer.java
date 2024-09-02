package advancedjava2;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class SimpleServer {
  public static void main(String[] args) {
    try {
      ServerSocket serverSocket = new ServerSocket(5000);
      Socket connection = serverSocket.accept();
      InputStream inputStream = connection.getInputStream();
      ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
      String o = (String) objectInputStream.readObject();
      System.out.println("받은 문자열은 " + o);
    } catch (Exception e) { // exception 한번에 처리
    }
  }
}
