package object;

import java.util.Arrays;

public class ArraySearchDemo {
  public static void main(String[] args) {
    int[] numbers = {77, 88, 55, 11, 22, 33, 99}; // 11 의 위치를 찾으시오
    int findNumber = 77;
    int findIdx = -1;
    for (int i = 0; i < numbers.length; i++) {
      if (numbers[i] == findNumber) {
        findIdx = i;
        break;
      }
    }

    if (findIdx == -1) {
      System.out.println("해당하는 값을 찾지 못했습니다.");
    } else {
      System.out.printf("%d는 %d 번째에 위치해있습니다.\n", findNumber, findIdx + 1);
    }

    Arrays.sort(numbers); // 정렬해야한다는 단점, 현재 위치를 찾아낼 수 없다는 단점이 있다.
    System.out.println(Arrays.toString(numbers));
    int i = Arrays.binarySearch(numbers, findNumber);
    System.out.println(i);
  }
}
