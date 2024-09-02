package advancedjava2;

import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;

public class SimpleClient {
  public static void main(String[] args) {
    try {
      Socket client = new Socket("", 5000);
      ObjectOutputStream objectOutputStream;
      OutputStream outputStream = client.getOutputStream();
      objectOutputStream = new ObjectOutputStream(outputStream);
      objectOutputStream.writeObject("안녕 서버야");
      objectOutputStream.flush();
    } catch (Exception e) {
    }
  }
}
