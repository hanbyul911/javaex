package exercise.ch09;

public class TicketTest {
  /* 티켓의 가격으로 크고 작음을 비교해야한다.
  티켓 가격을 비교하는 메소드가 필요하다.
  특정 티켓의 가격보다 비싼 티켓이 몇 개 있는지 카운트 하는 메소드
  티켓 뿐만 아니라 비교를 할 수 있는 다른 객체가 와도 재사용 가능하게 만들어야 한다.
   */
  public static void main(String[] args) {
    Ticket[] tickets = {new Ticket(6), new Ticket(10), new Ticket(1), new Ticket(2), new Ticket(3),
        new Ticket(4), new Ticket(5)};
    System.out.println(countGT(tickets, tickets[3]));
  }

  public static <T extends Comparable> int countGT(T[] a, T elem) {
    int count = 0;
    for (T t : a) {
      if (t.compareTo(elem) > 0) {
        count++;
      }
    }
    return count;
  }
}

class Ticket implements Comparable {
  int price;

  public Ticket(int price) {
    this.price = price;
  }

  @Override
  public int compareTo(Object o) {
    if (o instanceof Ticket) {
      Ticket t = (Ticket) o;
      return this.price - t.price;
    }
    return -99;
  }
}
