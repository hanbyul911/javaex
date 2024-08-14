package object;

public class PhoneDemo {
  public static void main(String[] args) {
    Phone phone1 = new Phone();
    Phone phone2 = new Phone();

    phone1.setModel("갤럭시 Z 폴드 6");
    phone1.setPrice(2580000);
    phone1.print();

    phone2.setModel("아이폰 14 프로");
    phone2.setPrice(2320000);
    phone2.print();

  }
}
