package advancedjava2;

public class ThreadDemo2 {
  public static void main(String[] args) throws InterruptedException {
    String name = Thread.currentThread().getName();
    // System.out.println(name);

    Thread thread0 = new Thread(new Task());
    Thread thread1 = new Thread(new Task());
    Thread thread2 = new Thread(new Task());

    /*thread.run(); // main 의 stack 영역에서 실행
    thread.start(); // 새로운 thread 생성*/


    Thread thread3 = new Thread(new Runnable() {
      @Override
      public void run() {
        for (int i = 0; i < 5; i++) {
          throw new RuntimeException();
        }
      }
    });

    thread0.start();

    System.out.println(Thread.currentThread().getName());
    int res = 5/0;
    System.out.println(res);

    thread1.start();
    thread2.start();
    thread3.start();
    }
  }

  class Task implements Runnable {
    @Override
    public void run() {
      for (int i = 0; i < 5; i++) {
        System.out.println(i + " : " + Thread.currentThread().getName());
        try {
          Thread.sleep(500);
        } catch (InterruptedException e) {
          throw new RuntimeException(e);
        }
      }
    }
  }

