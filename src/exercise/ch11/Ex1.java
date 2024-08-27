package exercise.ch11;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;

public class Ex1 {
  public static void main(String[] args) {
    Collection<String> animals = new ArrayList<String>();
    animals = new LinkedHashSet<String>();
    animals.add("갈매기");
    animals.add("나비");
    animals.add("라마");

    for (String animal : animals) {
      if (animal.length() == 2) {
        System.out.println(animal);
      }
    }
  }
}
