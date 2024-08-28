package collection_framework;

import java.util.*;

public class ColletionsDemo {
  public static void main(String[] args) {
    String[] fruits = {"포도", "수박", "딸기", "사과","배"};
    List<String> fList = Arrays.asList(fruits);
    for (String s : fList) {
      System.out.print(s + " ");
    }
    System.out.println();
    /*for (String s : fruits) {
      System.out.print(s + " ");
    }*/

   /* Collections.sort(fList);
    for (String s : fList) {
      System.out.print(s + " ");
    }

    System.out.println();
    Collections.reverse(fList);
    for (String s : fList) {
      System.out.print(s + " ");
    }*/

    Collections.sort(fList, Comparator.reverseOrder());
    for (String s : fList) {
      System.out.print(s + " ");
    }
  }
}
