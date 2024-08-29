package advancedjava2;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Stream;

public class FindDemo {
  public static void main(String[] args) {
    Optional<Nation> any = Nation.nations.stream().filter(n -> n.isIsland())
        .findAny(); // findFirst랑 결과값이 똑같다. -> 멀티스레드 작동시에 먼저 발견한걸 뱉음(any)
    any.ifPresent(nation -> System.out.println(nation.getName()));

    Stream<Nation> nationStream = Nation.nations.stream();
    // nationStream.max(Comparator.comparing(Nation::getPopulation)).ifPresent(System.out::println);

    System.out.println(nationStream.filter(n -> n.getPopulation() > 100).count());
  }
}
