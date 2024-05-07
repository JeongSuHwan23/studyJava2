public class Exercise7_20 {
  public static void main(String[] args) {
    Parent p = new Child();
    Child c =  new Child();
    System.out.println(c.x);
    p.method();
  }
}

class Parent {
  int x = 100;

  void method(){
    System.out.println("Parent");
  }
}

class Child extends Parent {
  int x = 200;

  void method() {
    System.out.println("Child");
  }
}
