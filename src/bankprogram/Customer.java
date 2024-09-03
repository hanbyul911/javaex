package bankprogram;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

class Customer {
  public static long seqno;
  String name;
  String customerId;
  Map<String, Account> accounts; // customerId, 계좌

  LocalDateTime registerTime;
  LocalDateTime finalTransactionDate;

  /**
   * @param id = 고객번호, name = 고객이름, birthday = 고객생년월일
   */
  public Customer(String id, String name) {
    this.customerId = id;
    this.name = name;
    this.accounts = new HashMap<>();
    this.registerTime = LocalDateTime.now();
    seqno = seqno + 1;
  }

  public Map<String, Account> getAccounts() {
    return accounts;
  }

  public Account creatAccount(Bank bank, String password) {
    Account a = new Account(this, bank, password);
    accounts.put(a.getAccountNumber(), a);
    return a;
  }

  public void closeAccount(Input input) {
    if (accounts.containsKey(input.getAccountNumber())) {
      if (accounts.get(input.getAccountNumber()).closeAccount(input)) {
        accounts.remove(input.getAccountNumber());
      } else {
        System.out.println("계좌 해지에 실패하였습니다.");
      }
    } else {
      System.out.println("해당하는 계좌가 없습니다.");
    }
  }
}
