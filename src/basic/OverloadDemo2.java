package basic;

public class OverloadDemo2 {
  public static void main(String[] args) {
    int i = 3, j = 7, k = 10;
    double d1 = 7.0, d2 = 10.0;

    System.out.printf("%d, %d 중 큰 수는 %d이다.\n", i, j, max(i, j));
    System.out.printf("%f, %f 중 큰 수는 %f이다.\n", d1, d2, max(d1, d2));
    System.out.printf("%d, %d, %d 중 가장 큰 수는 %d이다.\n", i, j, k, max(i, j, k));
  }

  public static int max (int i, int j) {
    return i > j ? i : j;
  }

  public static int min (int i, int j) {
    return i > j ? j : i;
  }

  public static double max (double d1, double d2) {
    return d1 > d2 ? d1 : d2;
  }

  public static int max (int i, int j, int k) {
    return max(i, max(j, k));
  }
}
