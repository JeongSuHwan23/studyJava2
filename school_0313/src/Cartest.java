class Car{
  int speed;
  boolean power;

  void speedUp() {
    speed += 10;
    System.out.println("현재 속력은 " + speed + "km 입니다");
  }
  void speedDown() {
    speed -= 10;
    System.out.println("현재 속력은 " + speed + "km 입니다");
  }
  void speedBreak() {
    speed = 0;
    System.out.println("급브레이크");
  }
  void power() {
    power = !power;
    if(power){
      System.out.println("시동 걸림");
    }
    else{
      System.out.println("시동 꺼짐");
    }
  }

}

public class Cartest {
  public static void main(String[] args) {
    Car c1 = new Car();
    Car c2 = new Car();

    c1.power();
    c2.power();

    c1.speed = 50;
    c2.speed = 100;

    c1.speedUp();
    c2.speedDown();

  }
}
