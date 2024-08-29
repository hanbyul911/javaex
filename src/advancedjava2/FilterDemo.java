package advancedjava2;

import java.util.Comparator;
import java.util.stream.Stream;

public class FilterDemo {
  public static void main(String[] args) {
    Stream<String> ss = Stream.of("a1", "b1", "b2", "c1", "c2", "c3", "c4");
    ss.filter(s -> s.startsWith("c")).skip(1).forEach(System.out::println); // 스트림 연산자 내 변수 이름 사용하지 않도록 조심.

    Stream<Integer> iStream = Stream.of(1,2,1,3,3,2,4);
    iStream.filter(i -> i % 2 == 0).distinct().forEach(System.out::println); // distinct 중복 요소 제거

    // 인구가 1억이 넘는 국가 중 2개만 출력, 인구가 큰 순서대로 2개만 출력
    Nation.nations.stream().filter(nation -> nation.getPopulation() > 100)
        .sorted(Comparator.comparing(Nation::getPopulation).reversed())
        // (n1, n2) ->(int) (n2.getPopulation - n1.getPopulation) 로 했는데 비교 후 int 로 변환해야한다는 점에서 정확도가 떨어짐
        .limit(2)
        .forEach(System.out::println);
  }
}
