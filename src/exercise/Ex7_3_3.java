package exercise;

import java.util.Arrays;
import java.util.Comparator;

public class Ex7_3_3 {
  public static void main(String[] args) {
    Book[] books = {new Book(15000), new Book(50000), new Book(20000),};

    for (Book book : books) {
      System.out.println(book.toString());
    }
    Arrays.sort(books, (a, b) -> a.price - b.price);
    for (Book book : books) {
      System.out.println(book.toString());
    }
  }
}

class Book {
  int price;

  @Override
  public String toString() {
    return "Book[" +
        "price=" + price +
        ']';
  }

  public Book(int price) {
    this.price = price;
  }


}
