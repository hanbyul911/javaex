package advancedjava2;

import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectorDemo {
  public static void main(String[] args) {
    Set<String> collect = Nation.nations.stream()
        .map(n -> n.getName())
        .collect(Collectors.toSet());

    for (String s : collect) {
      System.out.println(s);
    }

    System.out.println();

    Set<Nation.Type> nationType = Nation.nations.stream()
        .map(n -> n.getType())
        .collect(Collectors.toSet());
    for (Nation.Type type : nationType) {
      System.out.println(type);
    }

    System.out.println();
    Set<String> nationName = Nation.nations.stream()
        .map(n -> n.getName()).limit(3).collect(Collectors.toSet());
    for (String s : nationName) {
      System.out.println(s);
    }

    Map<String, Double> islandMap = Nation.nations.stream()
        .filter(Nation::isIsland)
        .collect(Collectors.toMap(Nation::getName, Nation::getPopulation));

    System.out.println(islandMap);


  }
}

