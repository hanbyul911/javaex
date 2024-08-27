package collection_framework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListDemo2 {
  public static void main(String[] args) {
    List<String> sList = Arrays.asList("사자","호랑이","곰");
    sList.set(2, "판다");
    System.out.println(sList);
    //sList.add("기린"); // 배열의 성격을 가지고 있어서 크기가 고정되어 있음

    List<String> sList2 = new ArrayList<>(sList);
    sList2.add("기린");
    System.out.println(sList2);
  }
}
