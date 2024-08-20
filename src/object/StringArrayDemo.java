package object;

import java.util.Arrays;

public class StringArrayDemo {
  public static void main(String[] args) {
    String[] names = new String[3];

    names[0] = "hong kil-dong";
    names[1] = "son heung-min";
    names[2] = "lee kang-in";

    System.out.println(Arrays.toString(names));

    for (String name : names) {
      System.out.println(name.length());
      System.out.println(name);
    }
  }
}
