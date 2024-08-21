package object;

public class Mission2 {
  public static void main(String[] args) {
    System.out.println(sum(1,2,3,4));
    int arr[] = {2,3};
    System.out.println(sum(1, arr));
    System.out.println(sum(1,2,3,4,5));
  }

  private static int sum(int i, int... j) {
    int sum = 0;
    for (int i1 : j) {
      sum += i1;
    }
    return sum;
  }


}
