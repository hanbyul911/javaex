package exercise;

import java.util.Arrays;
import java.util.Comparator;

public class Ex7_3_3 {
  public static void main(String[] args) {
    Book[] books = {new Book(15000), new Book(50000), new Book(20000),};

    System.out.println("정렬 전");
    for (Book book : books) {
      System.out.println(book.toString());
    }
    Arrays.sort(books);
    //Arrays.sort(books, (a, b) -> a.price - b.price);

    System.out.println("\n정렬 후");
    for (Book book : books) {
      System.out.println(book.toString());
    }
  }
}

class Book implements Comparable<Book> {
  // 필드
  int price;

  // 생성자
  public Book(int price) {
    this.price = price;
  }

  // 메서드
  @Override
  public String toString() {
    return "Book[" +
        "price=" + price +
        ']';
  }

  @Override
  public int compareTo(Book o) {
    return this.price - o.price;
  }
}
