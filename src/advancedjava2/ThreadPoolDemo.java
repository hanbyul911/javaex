package advancedjava2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolDemo {
  public static void main(String[] args) {
    Runnable task = () -> {
      for (int i = 0; i < 5; i++) {
        System.out.println(Thread.currentThread().getName() + " : " + i);
        try {
          Thread.sleep(500);
        } catch (InterruptedException e) {
        }
      }
    };

    // Thread thread = new Thread(task); -> CPU 에 부담이 되기 때문에 executor 사용

    ExecutorService executorService = Executors.newFixedThreadPool(2);
    executorService.submit(task);
    executorService.submit(task);
    executorService.submit(task);
    executorService.submit(task);
    executorService.submit(task); // 풀의 개수를 벗어나더라도 알아서 빈 스레드로 운용함
    executorService.shutdown(); // shutdown 하지 않으면 계속 실행 중, 중간에 shutdown 하면 이후 호출 불가

    for (int i = 0; i < 5; i++) {
      System.out.println(Thread.currentThread().getName() + " : " + i);
      try {
        Thread.sleep(500);
      } catch (InterruptedException e) {
      }
    }
  }
}
