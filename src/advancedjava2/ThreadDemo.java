package advancedjava2;

public class ThreadDemo {
  public static void main(String[] args) throws InterruptedException {
    // Runnable 을 implements -> .run() 으로 실행
    Thread thread = new Thread(new RunnableTest());
    // thread.start(); // 새로운 스레드 생성, 중간에 끼어들 수 있다.
    long before = System.currentTimeMillis();
    thread.run(); // 내 영역에 thread 를 올려서 실행시켜버림 따라서 동시에 실행되는게 아니라 해당 스레드가 먼저 실행되고 메인스레드로 돌아온다.
    // 해당 실행 또한 아무도 못 끼어듦
    // Thread 를 extends -> .start() 로 실행
    /*MyThread myThread = new MyThread();
    myThread.start();*/
    // myThread.run(); // main thread 의 stack 영역에서 스레드가 시작됨
    for (int i = 0; i < 5; i++) {
      System.out.println("나는 메인 스레드입니다.");
      Thread.sleep(500);
    }
    long after = System.currentTimeMillis();
    System.out.println(after - before);
  }
}

class RunnableTest implements Runnable {
  @Override
  public void run() {
    for (int i = 0; i < 5; i++) {
      System.out.println("My Thread");
      try {
        Thread.sleep(500);
      } catch (InterruptedException e) {
      }
    }
  }

  class MyThread extends Thread {
    @Override
    public void run() {
      System.out.println("MyThread");
    }
  }
}


