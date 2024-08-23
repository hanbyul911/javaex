package interface_package;

public class AnonymousDemo2 {
  public static void main(String[] args) {
    Parent p = new Parent() {
      int innerField = 100;

      @Override
      public void callOnce() {
        System.out.println("딱 한 번만 호출됩니다.");
        newMethod();
        System.out.println(innerField);
      }

      public void newMethod() {
        System.out.println("익명객체의 새로운 메서드입니다.");
      }
    };

    p.callOnce();
    // System.out.println(p.innerField);
    // p.newMethod(); 이름이 없어서 외부에서 접근할 수 없다. 타입도 없음.
  }
}

interface Parent {
  void callOnce();
}
