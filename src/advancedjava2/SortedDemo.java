package advancedjava2;

import java.util.Comparator;
import java.util.stream.Stream;

public class SortedDemo {
  public static void main(String[] args) {
    Stream.of("d2", "a2","b1", "b3","c")
        .sorted()
        .forEach(Util::print);
    System.out.println();

    Nation.nations.stream()
        .sorted(Comparator.comparing(Nation::getName))
        .map(Nation::getName)
        .forEach(Util::printWithParenthesis);
    System.out.println();

    Nation.nations.stream()
        .sorted(Comparator.comparing(Nation::getGdpRank))
        .map(n -> n.getName() + " GDP " + n.getGdpRank() + "위")
        .forEach(Util::printWithParenthesis);
  }
}
