package advancedjava2;

import java.util.stream.Stream;

public class MapDemo {
  public static void main(String[] args) {
    Stream<String> s1 = Stream.of("a1", "b1", "b2", "c1", "c2");
    /*Stream<String> s2 = s1.map(String::toUpperCase);
    s2.forEach(Util::print);
    */
    s1.map(String::toUpperCase)
        .forEach(Util::print);
    System.out.println();

    Stream<Integer> i1 = Stream.of(1,2,3,2,4,2,1);
    /*Stream<Integer> i2 = i1.map(i -> i * 2);
    i2.forEach(Util::print);
    */
    i1.map(i -> i * 2)
            .forEach(Util::print);

    System.out.println();

    Stream<String> s3 = Stream.of("a1", "c2", "c3");
    /*Stream<String> s4 = s3.map(s -> s.substring(1));
    Stream<Integer> i3 = s4.map(Integer::parseInt);
    Stream<String> s5 = i3.map(i -> "b" + i);
    s5.forEach(Util::print);
    */
    s3.map(s -> s.substring(1))
        .mapToInt(Integer::parseInt)
        .mapToObj(i -> "b" + i)
        .forEach(Util::print);
    System.out.println();

    Nation.nations.
        stream()
        .map(Nation::getName)
        .limit(4).forEach(Util::printWithParenthesis);
  }
}
